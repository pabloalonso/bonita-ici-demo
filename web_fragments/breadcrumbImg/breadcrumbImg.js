var module;
try {
  module = angular.module('bonitasoft.ui.fragments');
} catch (e) {
  module = angular.module('bonitasoft.ui.fragments', []);
  angular.module('bonitasoft.ui').requires.push('bonitasoft.ui.fragments');
}
module.directive('pbFragmentBreadcrumbImg', function() {
  return {
    template: '<div>    <div class="row">\n        <div pb-property-values=\'af8c0070-02b0-4fc4-a2d9-845ed00ab4df\'>\n\n  <div class="col-xs-12  col-sm-12  col-md-3  col-lg-4"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        \n    </div>\n\n\n  </div>\n</div>\n<div pb-property-values=\'d5a4a782-8398-46a9-8d24-1592bd512a29\'>\n\n  <div class="col-xs-12  col-sm-12  col-md-6  col-lg-4"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        <div pb-property-values=\'50f4602b-c468-4d73-b01d-b9384e5c8424\'>\n    <div ng-if="!properties.hidden" class="component col-xs-12  col-sm-12  col-md-12  col-lg-12" ng-class="properties.cssClasses">\n        <pb-image></pb-image>\n    </div>\n</div>\n    </div>\n\n\n  </div>\n</div>\n<div pb-property-values=\'c227de2f-6659-4cd8-824d-abf5befc7409\'>\n\n  <div class="col-xs-12  col-sm-12  col-md-3  col-lg-4"\n       ng-class="properties.cssClasses"\n       ng-if="!properties.hidden"\n>\n\n        <div class="row">\n        \n    </div>\n\n\n  </div>\n</div>\n\n    </div>\n</div>'
  };
});
