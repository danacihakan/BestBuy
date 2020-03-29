package com.bestBuy.models.products;

import com.bestBuy.models.categories.Categories;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true )
public class Product {

    public int Id;
    public String Name;
    public String Type;
    public Double Price;
    public Double Shipping;
    public String Upc;
    public String Description;
    public String Manufacturer;
    public String Model;
    public String Url;
    public String Image;
    public String CreatedAt;
    public String UpdatedAt;
    public List<Categories> Categories;

    public List<com.bestBuy.models.categories.Categories> getCategories() {
        return Categories;
    }

    public void setCategories(List<com.bestBuy.models.categories.Categories> categories) {
        Categories = categories;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getShipping() {
        return Shipping;
    }

    public void setShipping(Double shipping) {
        Shipping = shipping;
    }

    public String getUpc() {
        return Upc;
    }

    public void setUpc(String upc) {
        Upc = upc;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        UpdatedAt = updatedAt;
    }
}
