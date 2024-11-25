package com.example.clothingstore_contracts.controller;

import com.example.clothingstore_contracts.input.LoginInputModel;
import com.example.clothingstore_contracts.input.RegisterInputModel;
import com.example.clothingstore_contracts.viewmodel.UserViewModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {

    @PostMapping("/auth/register")
    UserViewModel register(@RequestBody RegisterInputModel registerInput);

    @PostMapping("/auth/login")
    UserViewModel login(@RequestBody LoginInputModel loginInput);

    @PostMapping("/auth/logout")
    void logout();
}
