app.controller('searchController',function($scope,searchService,$location){
	//定义商品搜索对象的结构
	$scope.searchMap={'keywords':'','category':'','brand':'','spec':{},'price':'','pageNo':1,'pageSize':40,
			'sort':'','sortField':''
	};
	
	//搜索
	$scope.search=function(){
		//对当前页码强制转为int类型
		$scope.searchMap.pageNo=parseInt($scope.searchMap.pageNo);
		
		searchService.search($scope.searchMap).success(
			function(response){
				$scope.resultMap=response;		
				//构造分页栏
				buildPageLabel();
			}
		);		
	}
	
	//构造分页栏
		/**
		 * 显示固定页数的方法：
		 * 1.设固定显示页数=x；
		 * 2.设当前页码=y；
		 * 3.设当前页码左右两边数=z；
		 * 4.如果totalPages<=x；那么全部显示分页；
		 * 5.如果totalPages>=x；
		 * 		5.1：如果y<=3,那么显示前x页；
		 * 		5.2：如果y>=totalPages-2,那么显示最后x页
		 * 		5.3：其余情况，显示y-2~y+2；
		 * 
		 * */
	buildPageLabel=function(){
		$scope.pageLabel=[];
		var firstPage=1;
		var lastPage=$scope.resultMap.totalPages;
		//前、后省略号判断符
		$scope.firstDot=true;
		$scope.lastDot=true;
		/**
		 * 功能：
		 */
		if($scope.resultMap.totalPages>5){
			if($scope.searchMap.pageNo<=3){
				lastPage=5;
				$scope.firstDot=false;
			}else if($scope.searchMap.pageNo>=$scope.resultMap.totalPages-2){
				firstPage=$scope.resultMap.totalPages-4;
				$scope.lastDot=false;
			}else{
				firstPage=$scope.searchMap.pageNo-2;
				lastPage=$scope.searchMap.pageNo+2;
			}
		}else {
			$scope.firstDot=false;
			$scope.lastDot=false;
		}
		
		
		for(var i=firstPage;i<=lastPage;i++){
			$scope.pageLabel.push(i);
		}
	}
	
	//分页查询
	$scope.queryByPage=function(pageNo){
		//判断“上一页”和“下一页”
		if(pageNo<1 || pageNo>$scope.resultMap.totalPages){
			return ;
		}
		
		$scope.searchMap.pageNo=pageNo;
		$scope.search();
	}
	
	
	//判断是否首页
	$scope.isTopPage=function(){
		if ($scope.searchMap.pageNo==1) {
			return true;
		}else {
			return false;
		}
	}
	//判断是否尾页
	$scope.isEndPage=function(){
		if($scope.searchMap.pageNo==$scope.resultMap.totalPages){
			return true;
		}else {
			return false;
		}
	}
	
	//添加搜索项，改变searchMap的值
	$scope.addSearchItem=function(key,value){
		
		//如果key是分类和品牌
		if(key == 'category' || key == 'brand' || key=='price'){
			
			$scope.searchMap[key]=value;
		}else {//如果key是规格选项
			$scope.searchMap.spec[key]=value;
		}
		
		$scope.search();
		
	}
	
	//移除搜索项
	$scope.removeSearchItem=function(key){
		//如果key是分类和品牌
		if(key == 'category' || key == 'brand' || key=='price'){
			$scope.searchMap[key]="";
		}else {//如果key是规格选项
			delete $scope.searchMap.spec[key];
		}
		$scope.search();
	}
	
	//设置排序规则
	$scope.sortSearch=function(sortField,sort){
		$scope.searchMap.sort=sort;
		$scope.searchMap.sortField=sortField;
		$scope.search();
	}
	
	//判断关键字是否是品牌
	$scope.keywordsIsBrand=function(){
		for(var i=0;i<$scope.resultMap.brandList.length;i++){
			if($scope.searchMap.keywords.indexOf($scope.resultMap.brandList[i].text)>=0){
				return true;
			}
		}
		return false;
	}
	
	//接受门户搜索请求
	$scope.loadkeywords=function(){
		$scope.searchMap.keywords= $location.search()['keywords'];
		$scope.search();
	}
});