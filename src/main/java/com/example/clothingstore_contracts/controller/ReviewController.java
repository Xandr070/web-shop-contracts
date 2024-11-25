package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.TopProductsViewModel;
import org.springframework.web.bind.annotation.GetMapping;

public interface ReviewController {

    @GetMapping("/reviews/top-products")
    TopProductsViewModel getTopProductsByReviews();
}
