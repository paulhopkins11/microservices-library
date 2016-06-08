'use strict';

/**
 * @ngdoc function
 * @name libraryAppApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the libraryAppApp
 */
angular.module('libraryAppApp')
  .controller('MainCtrl', ['$scope','Library', function ($scope, Library) {
      $scope.library ={};
      $scope.some="thing";
      $scope.loadLibrary = function() {

        $scope.library = Library.query();

    };
    $scope.loadLibrary();

  }]);
