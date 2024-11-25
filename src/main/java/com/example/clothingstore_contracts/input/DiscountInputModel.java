package com.example.clothingstore_contracts.input;

public class DiscountInputModel {
    private Long customerId;
    private Long categoryId;

    @jakarta.validation.constraints.NotNull(message = "ID клиента обязателен")
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @jakarta.validation.constraints.NotNull(message = "ID категории обязательна")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
