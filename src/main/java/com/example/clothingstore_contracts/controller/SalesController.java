package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.TopProductsBySalesViewModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface SalesController {

    @GetMapping("/sales/top-products")
    TopProductsBySalesViewModel getTopProductsBySalesSeason(@RequestParam String season);
}
