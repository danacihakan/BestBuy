$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/products.feature");
formatter.feature({
  "name": "Sample Api tests to demonstrate CRUD operation on products",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.scenario({
  "name": "Get Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "I perform GET request for products endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "com.bestBuy.stepDefs.ProductSteps.i_perform_GET_request_for_products_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a 200 http status code",
  "keyword": "Then "
});
formatter.match({
  "location": "com.bestBuy.stepDefs.ProductSteps.i_get_a_http_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});