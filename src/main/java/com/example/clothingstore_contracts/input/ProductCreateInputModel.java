package com.example.clothingstore_contracts.input;

import jakarta.validation.constraints.NotBlank;

public class ProductCreateInputModel {
    private String name;

    private String description;

    private double price;
    private double discount;
    private String category;
    private String season;

    public @NotBlank(message = "Название обязательно") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Название обязательно") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Описание обязательно") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Описание обязательно") String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
