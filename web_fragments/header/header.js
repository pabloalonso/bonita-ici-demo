var module;
try {
  module = angular.module('bonitasoft.ui.fragments');
} catch (e) {
  module = angular.module('bonitasoft.ui.fragments', []);
  angular.module('bonitasoft.ui').requires.push('bonitasoft.ui.fragments');
}
module.directive('pbFragmentHeader', function() {
  return {
    template: '<div>    <div class="row">\n        <div pb-property-values=\'cdaf7d4f-711a-4885-9924-b92b4a70c2b6\'>\n\n  <div class="col-xs-12  col-sm-12  col-md-12  col-lg-12"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        <div pb-property-values=\'ff1c5cb9-17b0-4c97-8a94-9595017ef1a2\'>\n    <div ng-if="!properties.hidden" class="component col-xs-11  col-sm-11  col-md-11  col-lg-11" ng-class="properties.cssClasses">\n        <pb-text></pb-text>\n    </div>\n</div><div pb-property-values=\'e884c6d9-9fd7-45c3-befe-71d9268f637e\'>\n    <div ng-if="!properties.hidden" class="component col-xs-1  col-sm-1  col-md-1  col-lg-1" ng-class="properties.cssClasses">\n        <pb-image></pb-image>\n    </div>\n</div>\n    </div>\n\n\n  </div>\n</div>\n\n    </div>\n</div>'
  };
});
