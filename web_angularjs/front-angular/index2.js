let app = angular.module("myApp", []);

app.controller("myBoard", function ($scope) {
    $scope.boardList = [{
        no: 1,
        todo: 'default',
        complete: false,
    },
    ];


    $scope.boardListForm = {};

    $scope.addBoard = function () {
        let newNo = !$scope.boardList.length ? 1 : $scope.boardList[$scope.boardList.length - 1].no
        let newItem = {
            no: newNo,
            todo: $scope.boardListForm.todo,
            complete: false
        };

        $scope.boardList.push(newItem);
        $scope.boardListForm.todo = "";
    }



});