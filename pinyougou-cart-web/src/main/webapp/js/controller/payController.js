//购物车控制层
app.controller('payController',function($scope,payService,$location){
	//微信扫码支付下单
	$scope.weixinPayNative=function(){
		return payService.weixinPayNative().success(function(response){
			$scope.out_trade_no=response.out_trade_no;//订单号
			$scope.money=(response.total_fee/100).toFixed(2);//金额
			//根据返回的code_url生成二维码
			 var qr = new QRious({
				   element:document.getElementById('qrious'),
				   size:250, 
				   level:'H',
				   value:response.code_url
				});
			 console.log('查询状态');
			 $scope.queryWeixinPayNative('1415757673sdsfsafsfs');//查询支付状态
			
			
		});
	}
	
	//查询扫码支付状态
	$scope.queryWeixinPayNative=function(out_trade_no){
		console.log('进入状态查询功能了');
		return payService.queryWeixinPayNative(out_trade_no).success(function(response){
			if(response.success){
				location.href='paysuccess.html#?money='+$scope.money;
			}else {
				if(response.message=='二维码超时'){
					$scope.weixinPayNative();
				}else {
					location.href='payfail.html'
				}
				
			}
		})
	}
	
	//获取金额
	$scope.getMoney=function(){
		return $location.search()['money'];
	}

});