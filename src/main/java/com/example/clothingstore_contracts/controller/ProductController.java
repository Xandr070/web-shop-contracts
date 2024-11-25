package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.ProductListViewModel;
import com.example.clothingstore_contracts.viewmodel.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductController {

    @GetMapping("/products")
    ProductListViewModel getProductsWithFilters(@RequestParam(required = false) String category,
                                                @RequestParam(required = false) String season,
                                                @RequestParam(required = false) String discount);

    @GetMapping("/products/category")
    ProductListViewModel getProductsByCategory(@RequestParam String category,
                                               @RequestParam(required = false) String season);

    @GetMapping("/products/{productId}")
    ProductDTO getProductById(@RequestParam Long productId);

    @GetMapping("/products/customer-discount")
    ProductListViewModel getProductsWithCustomerDiscount(@RequestParam Long customerId);
}
