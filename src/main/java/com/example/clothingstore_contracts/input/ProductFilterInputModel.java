package com.example.clothingstore_contracts.input;

public class ProductFilterInputModel {
    private String season;
    private String category;

    @jakarta.validation.constraints.NotBlank(message = "Сезон обязателен")
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
