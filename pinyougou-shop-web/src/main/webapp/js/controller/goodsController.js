 //控制层 
app.controller('goodsController' ,function($scope,$controller ,$location,goodsService,uploadService,itemCatService,typeTemplateService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		goodsService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		goodsService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		goodsService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//查询实体2，商品页面初始化时根据id查询商品
	$scope.findOne=function(){
		var id=$location.search()['id'];
		if(id==null){
			return ;
		}
		goodsService.findOne(id).success(
			function(response){
				$scope.entity= response;	
				//回填编辑器内容
				editor.html($scope.entity.goodsDesc.introduction);
				//回填图片
				$scope.entity.goodsDesc.itemImages=JSON.parse($scope.entity.goodsDesc.itemImages);
				//回填扩展属性
				$scope.entity.goodsDesc.customAttributeItems=JSON.parse($scope.entity.goodsDesc.customAttributeItems);
				//规格				
				$scope.entity.goodsDesc.specificationItems=JSON.parse($scope.entity.goodsDesc.specificationItems);
				//SKU列表规格列转换				
				for(var i=0;i<$scope.entity.itemList.length;i++ ){
					$scope.entity.itemList[i].spec = 
					JSON.parse( $scope.entity.itemList[i].spec);		
				}	

			}
		);				
	}
	
	//根据规格名称和选项名称返回是否被勾选
	$scope.checkAttributeValue=function(specName,optionName){
		
		var items= $scope.entity.goodsDesc.specificationItems;
		var object= $scope.searchObjectByKey(items,'attributeName',specName);
		if(object==null){
			return false;
		}else{
			if(object.attributeValue.indexOf(optionName)>=0){
				return true;
			}else{
				return false;
			}
		}			
	}

	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=goodsService.update( $scope.entity ); //修改  
		}else{
			serviceObject=goodsService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	//增加商品 
	$scope.add=function(){			
		$scope.entity.goodsDesc.introduction=editor.html();
		
		goodsService.add( $scope.entity  ).success(
			function(response){
				if(response.success){
					alert("新增成功");
					$scope.entity={};
					editor.html("");//清空富文本编辑器
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		goodsService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	//定义商品状态含义
	$scope.auditStatus=['未审核','已审核','审核未通过','关闭'];
	//定义分类数组
	$scope.itemCatList=[];
	//初始化分类数组
	$scope.findItemCatList=function(){
		
		itemCatService.findAll().success(
			function(response){
				
				for(var i=0;i<response.length;i++){
					$scope.itemCatList[response[i].id]=response[i].name;
				}
				
			
		});
	}

	//搜索
	$scope.search=function(page,rows){			
		goodsService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//上传图片
	$scope.uploadFile=function(){
		uploadService.uploadFile().success(
			function(response){
				if(response.success){
					$scope.image_entity.url= response.message;
				}else{
					alert(response.message);					
				}
			}		
		);
		
		
	}
	
	$scope.entity={ goodsDesc:{itemImages:[],specificationItems:[]}};
	
	//将当前上传的图片实体存入图片列表
	$scope.add_image_entity=function(){
		$scope.entity.goodsDesc.itemImages.push($scope.image_entity);			
	}
	
	//移除图片
	$scope.remove_image_entity=function(index){
		
		$scope.entity.goodsDesc.itemImages.splice(index,1);
	}
	
	
	//读取商品分类一级列表
	$scope.selectItemCat1List=function(){
		//获得商品分类1级列表
		itemCatService.findByParentId(0).success(function(response) {			
			$scope.itemCat1List=response;
		})
	}
    
	//监控一级分类，查询二级分类数据
	$scope.$watch('entity.goods.category1Id',function(newValue,oldValue){
		itemCatService.findByParentId(newValue).success(function(response) {
			$scope.itemCat2List=response;
		})
	})
	
	//监控二级分类，查询三级分类数据
	$scope.$watch('entity.goods.category2Id',function(newValue,oldValue){
		itemCatService.findByParentId(newValue).success(function(response) {
			$scope.itemCat3List=response;
		})
	})
	
	//监控3级分类，查询商品模板值
	$scope.$watch('entity.goods.category3Id',function(newValue,oldValue){
		itemCatService.findOne(newValue).success(function (response) {
			$scope.entity.goods.typeTemplateId=response.typeId;
		})
	})
	
	//监控模板值，查询模板，获取品牌属性,获取规格列表
	$scope.$watch('entity.goods.typeTemplateId',function(newValue,oldValue){
		//当商品添加页面不是作为修改页面时，那么就查询扩展属性，否则页面已经查到扩展属性了
		
		typeTemplateService.findOne(newValue).success(function (response) {
			$scope.typeTemplate=response;//获取类型模板
		    $scope.typeTemplate.brandIds= JSON.parse( $scope.typeTemplate.brandIds);//品牌列表
		    if($location.search()['id']==null){
		    $scope.entity.goodsDesc.customAttributeItems=JSON.parse($scope.typeTemplate.customAttributeItems);//扩展属性
		    }
		});
		
		//查询规格列表
		typeTemplateService.findSpecList(newValue).success(function(response) {
			$scope.specList=response;
		});
		
	})
	
	//添加规格
	$scope.updateSpecAttribute=function($event,name,value){
		//获取规格对象
		var object=$scope.searchObjectByKey($scope.entity.goodsDesc.specificationItems,'attributeName',name);
		//有就根据选择属性，添加或去掉规格
		if(object!=null){
			if($event.target.checked){
				object.attributeValue.push(value);
			}else {
				
				object.attributeValue.splice(object.attributeValue.indexOf(value),1);
				//如果移除选项后，attributeValue为空，那么将这个对象移除
				if(object.attributeValue.length==0){
					$scope.entity.goodsDesc.specificationItems.splice($scope.entity.goodsDesc.specificationItems.indexOf(object),1);
				}
			}
		}else {//没有就代表第一次选择那个属性，则创建一个
			$scope.entity.goodsDesc.specificationItems.push({"attributeName":name,"attributeValue":[value]});
		}
		
	}
	
	//生成sku集合
	$scope.createItemList=function(){
		$scope.entity.itemList=[{spec:{},price:0,num:99999,status:'0',isDefault:'0' }];
		
		//遍历规格集合，根据规格集合生成sku集合
		var items=$scope.entity.goodsDesc.specificationItems;
		
		for(var i=0;i<items.length;i++){
			$scope.entity.itemList=$scope.addColumn($scope.entity.itemList,items[i].attributeName,items[i].attributeValue);
		}
	}
	
	//SKU集合添加数据方法
	$scope.addColumn=function(list,columnName,columnValues){
		var newList=[];//新的集合
		for(i=0;i<list.length;i++){//这里的i，和createItemList方法里的i需要通过命名区分，不然都会变成一样的值
			var oldRow= list[i];//旧集合
			for(j=0;j<columnValues.length;j++){
				var newRow= JSON.parse( JSON.stringify(oldRow) );//深克隆,先将旧集合转换成字符串，再将字符串转换成js对象
				newRow.spec[columnName]=columnValues[j];
				newList.push(newRow);
			}
		}
		return newList;
	}
	
	
	//保存 
	$scope.save=function(){			
		//提取文本编辑器的值
		$scope.entity.goodsDesc.introduction=editor.html();	
		var serviceObject;//服务层对象  				
		if($scope.entity.goods.id!=null){//如果有ID
			serviceObject=goodsService.update( $scope.entity ); //修改  
		}else{
			serviceObject=goodsService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					location.href="goods.html";//跳转到商品列表页
				}else{
					alert(response.message);
				}
			}		
		);				
	}

	
});	
