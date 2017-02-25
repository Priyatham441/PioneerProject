var app=angular.module("PCSProject", []);
app.controller("Btnfunction",Btnfunction);
function Btnfunction($scope)
        {

            $scope.hideClasses= function()
        {
            console.log("when button clicked");
            $scope.hideClassStatus=!$scope.hideClassStatus;
        }
        
        }

        