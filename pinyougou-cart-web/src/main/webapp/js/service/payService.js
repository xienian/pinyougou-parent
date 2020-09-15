//服务层
app.service('payService',function($http){
	//微信支付扫码下单
	this.weixinPayNative=function(){
		return $http.get('/pay/weixinPayNative.do');
	}
	
	this.queryWeixinPayNative=function(out_trade_no){
		return $http.get('/pay/queryWeixinPayNative.do?out_trade_no='+out_trade_no);
	}
});
