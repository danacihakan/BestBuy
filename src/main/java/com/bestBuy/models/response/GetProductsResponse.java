package com.bestBuy.models.response;

import com.bestBuy.models.products.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true )
public class GetProductsResponse {
    public int Total;
    public int Limit;
    public int Skip;
    public List<Product> Data;

    public List<Product> getData() {
        return Data;
    }

    public void setData(List<Product> data) {
        Data = data;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    public int getSkip() {
        return Skip;
    }

    public void setSkip(int skip) {
        Skip = skip;
    }


}
