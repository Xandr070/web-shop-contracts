package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.CustomerDiscountViewModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface DiscountController {

    @GetMapping("/discounts")
    CustomerDiscountViewModel getDiscounts(@RequestParam Long customerId);
}
