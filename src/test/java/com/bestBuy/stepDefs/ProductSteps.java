package com.bestBuy.stepDefs;

import com.bestBuy.client.RestClient;
import com.bestBuy.models.response.GetProductsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProductSteps {
    Response response;
    ObjectMapper mapper;

    @When("I perform GET request for products endpoint")
    public void i_perform_GET_request_for_products_endpoint() {
        Map<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("Content-Type", "application/json");
        response = RestClient.get("PRODUCT_ENDPOINT", headerMap);
    }

    @Then("I get a {int} http status code")
    public void i_get_a_http_status_code(Integer statusCode) throws IOException {
        response.then().assertThat().statusCode(statusCode);
        mapper = new ObjectMapper();
        System.out.println(response.getBody().asString());
        GetProductsResponse proResponse = mapper.readValue(response.asString(), GetProductsResponse.class);
        System.out.println(proResponse.Total);
        proResponse.Data.forEach(x -> System.out.println(x.Id));
        Assert.assertEquals(proResponse.Total, 51959);
    }


}
