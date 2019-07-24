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
})