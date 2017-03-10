/**
 * 
 */

var app=angular.module("addStudent",[])


app.controller("studentController",function($scope,$http){

       // add student method
       $scope.addStudent=function addStudent(){
    		//alert("inside add controller");
    	
   		//mapping the fields 
   var request=$http({
   		method:'POST',
   		url:"/student/create", 
   		data:$scope.student
   	});
   	}
       
      
       //viewing the table data
       $scope.viewStudent=function viewStudent(){
    	   $scope.students={};
   		//alert("inside view controller");
   	    $http({
   			method:'GET',
   			url:"/student/view"
   		}).then(function mySuccess(response){
   			$scope.students=response.data;
   		});	
   	}
   // $scope.viewStudent(); 
      
    
   
      $scope.deleteEntry=function deleteEntry(id){
       //	alert("inside delete controller");
       	$http({
       		method:'POST',
       		url:"/student/delete",
       		data:id
       	});
       	
       }
       
});     
       
       
       
       
       
       
       



