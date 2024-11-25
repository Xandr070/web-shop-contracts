package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.ProductListViewModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductFilterController {

    @GetMapping("/filter/products")
    ProductListViewModel filterProducts(@RequestParam String category,
                                        @RequestParam(required = false) String season,
                                        @RequestParam(required = false) String discount);
}
