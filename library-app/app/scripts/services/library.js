'use strict';

/**
 * Created by paul_hopkins on 08/06/2016.
 */
angular.
  module('libraryAppApp').
  factory('Library', ['$resource',
    function($resource) {
      return $resource('http://library-service:81/library.json', {}, {
        query: {
          method: 'GET',
          isArray: false
        }
      });
    }
  ]);
