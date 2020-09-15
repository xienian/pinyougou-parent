//购物车控制层
app.controller('cartController',function($scope,cartService){
	
	
	//查询购物车列表
	$scope.findCartList=function(){
		cartService.findCartList().success(
			function(response){
				$scope.cartList=response;
				$scope.totalValue= cartService.sum($scope.cartList);
			}
		);
	}
	
	//数量加减
	$scope.addGoodsToCartList=function(itemId,num){
		cartService.addGoodsToCartList(itemId,num).success(
			function(response){
				if(response.success){//如果成功
					$scope.findCartList();//刷新列表
				}else{
					alert(response.message);
				}				
			}		
		);		
	}
	
	//求合计
	/*
	sum=function(){
		$scope.totalNum=0;//总数量
		$scope.totalMoney=0;//总金额
		
		for(var i=0;i<$scope.cartList.length ;i++){
			var cart=$scope.cartList[i];//购物车对象
			for(var j=0;j<cart.orderItemList.length;j++){
				var orderItem=  cart.orderItemList[j];//购物车明细
				$scope.totalNum+=orderItem.num;//累加数量
				$scope.totalMoney+=orderItem.totalFee;//累加金额				
			}			
		}
	}
	*/
	
	//查询用户的收货地址
	$scope.findAddressList=function(){
		cartService.findAddressList().success(function(response) {
			//编辑显示隐藏变量
			$scope.addressToggle=false;
			$scope.addressList=response;
			//将默认地址设为选中地址
			for(var i=0;i<$scope.addressList.length;i++){
				if($scope.addressList[i].isDefault=='1'){
					$scope.address=$scope.addressList[i];
					break;
				}
			}
		})
	}
	
	//选择地址对象
	$scope.selectAddress=function(address){
		$scope.address=address;
	}
	
	//判断当前地址对象是否是选中的
	$scope.isSelectedAddress=function(address){
		if(address==$scope.address){
			return true;
		}else {
			return false;
		}
	}
	//
	$scope.addressToggle=function(){
		if($scope.addressToggle==true){
			$scope.addressToggle=false;
		}else {
			$scope.addressToggle=true;
		}
		
	}
	
	//新增地址方法
	$scope.addAddressFun=function(){
		$scope.updateAddress=null;
	}
	
	//编辑地址方法
	$scope.updateAddressFun=function(address){
		
		$scope.updateAddress=address;
		
	}
	
	//保存新增地址
	$scope.saveAddress=function(updateAddress){
		
		if(updateAddress.userId==null){
			updateAddress.userId=$scope.address.userId;
		}
		//保存刷新地址
		cartService.saveAddress(updateAddress).success(function(response){
			if(response.success){//如果成功
				$scope.findAddressList();//刷新列表
			}else{
				alert(response.message);
			}		
			})
	}
	
	//删除地址
	$scope.deleteAddress=function(address){
		cartService.deleteAddress(address).success(function(response){
			if(response.success){//如果成功
				$scope.findAddressList();//刷新列表
			}else{
				alert(response.message);
			}	
		})
	}
	
	//选择付款方式
	$scope.order={paymentType:'1'};
	$scope.selectPayType=function(type){
		$scope.order.paymentType=type;
	}
	
	//保存订单
	$scope.submitOrder=function(){
	
		$scope.order.receiverAreaName=$scope.address.address;//地址
		$scope.order.receiverMobile=$scope.address.mobile;//手机
		$scope.order.receiver=$scope.address.contact;//联系人
		
		cartService.submitOrder( $scope.order ).success(
				function(response){
					if(response.success){
						//页面跳转
						if($scope.order.paymentType=='1'){//如果是微信支付，跳转到支付页面
							location.href="pay.html";
						}else{//如果货到付款，跳转到提示页面
							location.href="paysuccess.html";
						}					
					}else{
						alert(response.message);	//也可以跳转到提示页面				
					}				
				}				
			);		

	}
});