package com.bestBuy.client;

import com.bestBuy.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class RestClient {


    static {
        baseURI = ConfigurationReader.getProperty("BASE_URL");
        RestAssured.useRelaxedHTTPSValidation();
    }

    public static Response get(String endPoint){
        basePath = ConfigurationReader.getProperty(endPoint);
        Response response = given().get();
        return response;
    }
    public static Response get(String endPoint, Map<String, String> headerMap){
        basePath = ConfigurationReader.getProperty(endPoint);
        Response response = given().headers(headerMap).when().get();
        return response;
    }
    public static Response get(String endPoint, int limit, Map<String, String> headerMap){
        basePath = ConfigurationReader.getProperty(endPoint);
        Response response = given().pathParam("limit",limit).headers(headerMap).when().get();
        return response;
    }
}
