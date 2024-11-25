package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.viewmodel.UserViewModel;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserController {

    @GetMapping("/user")
    UserViewModel getCurrentUser();
}
