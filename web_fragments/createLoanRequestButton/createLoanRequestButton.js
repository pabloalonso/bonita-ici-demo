var module;
try {
  module = angular.module('bonitasoft.ui.fragments');
} catch (e) {
  module = angular.module('bonitasoft.ui.fragments', []);
  angular.module('bonitasoft.ui').requires.push('bonitasoft.ui.fragments');
}
module.directive('pbFragmentCreateLoanRequestButton', function() {
  return {
    template: '<div>    <div class="row">\n        <div pb-property-values=\'d1b4cf64-5473-4d3a-a1a1-2a6ccd31cf8e\'>\n    <div ng-if="!properties.hidden" class="component col-xs-12  col-sm-12  col-md-12  col-lg-12" ng-class="properties.cssClasses">\n        <pb-button></pb-button>\n    </div>\n</div>\n    </div>\n</div>'
  };
});
