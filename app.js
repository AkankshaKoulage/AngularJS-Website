var mainApp = angular.module("mainApp", ['ngRoute']);
mainApp.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
            when('/sidebar.html', {
                templateUrl: '/sidebar.html',
               
            }).
            when('/volleyball.html', {
                templateUrl: '/volleyball.html',
              
            }).
             when('/yoga.html', {
                templateUrl: 'yoga.html',
              
            }).
            
             when('/VC.html', {
                templateUrl: 'VC.html',
              
            }).
             when('/fitness.html', {
                templateUrl: 'fitness.html',
                
            
               
            }).
            otherwise({
                redirectTo: '/assignment1'
            });
    }]); 