app.controller("contentController",function($scope,contentService){
	
	//广告列表数组,不同分类id的广告根据数组下标获取
	$scope.contentList=[];
	
	$scope.findByCategoryId=function(categoryId){
		contentService.findByCategoryId(categoryId).success(
				function(response) {
					$scope.contentList[categoryId]=response;
				}
		);
	}
	
	//搜索跳转到搜索主页
	$scope.search=function(){
		location.href="http://localhost:9104/search.html#?keywords="+$scope.keywords;
	}
})