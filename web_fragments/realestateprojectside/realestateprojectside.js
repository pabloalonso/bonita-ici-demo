var module;
try {
  module = angular.module('bonitasoft.ui.fragments');
} catch (e) {
  module = angular.module('bonitasoft.ui.fragments', []);
  angular.module('bonitasoft.ui').requires.push('bonitasoft.ui.fragments');
}
module.directive('pbFragmentRealestateprojectside', function() {
  return {
    template: '<div>    <div class="row">\n        <div pb-property-values=\'12d52b53-45a1-4ad4-832f-1f97b71d2f99\'>\n    <div ng-if="!properties.hidden" class="component col-xs-12  col-sm-12  col-md-12  col-lg-12" ng-class="properties.cssClasses">\n        <pb-text></pb-text>\n    </div>\n</div>\n    </div>\n    <div class="row">\n        <div pb-property-values=\'0ef967f8-1692-4716-bbde-bde9dadf8673\'>\n\n  <div class="col-xs-5  col-sm-4  col-md-4  col-lg-4"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        \n    </div>\n\n\n  </div>\n</div>\n<div pb-property-values=\'9e324856-9dd0-45d7-87eb-7dc13f3dac12\'>\n    <div ng-if="!properties.hidden" class="component col-xs-2  col-sm-4  col-md-4  col-lg-4" ng-class="properties.cssClasses">\n        <pb-image></pb-image>\n    </div>\n</div><div pb-property-values=\'811edc2d-cd31-49d4-bf54-a2db5bb83107\'>\n\n  <div class="col-xs-5  col-sm-4  col-md-4  col-lg-4"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        \n    </div>\n\n\n  </div>\n</div>\n\n    </div>\n</div>'
  };
});
