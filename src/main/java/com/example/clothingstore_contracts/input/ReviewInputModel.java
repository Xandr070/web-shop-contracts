package com.example.clothingstore_contracts.input;

public class ReviewInputModel {
    private Long productId;
    private String reviewText;
    private int rating;

    @jakarta.validation.constraints.NotNull(message = "ID товара обязателен")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @jakarta.validation.constraints.NotBlank(message = "Отзыв не может быть пустым")
    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
