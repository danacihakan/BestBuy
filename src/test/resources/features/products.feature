#Sample test scenario which gives an example of API or Service level testing

@api
Feature: Sample Api tests to demonstrate CRUD operation on products


  Scenario: Get Details
    When I perform GET request for products endpoint
    Then I get a 200 http status code