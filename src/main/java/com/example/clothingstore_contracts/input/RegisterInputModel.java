package com.example.clothingstore_contracts.input;

import jakarta.validation.constraints.NotBlank;

public class RegisterInputModel {

    private String username;

    private String password;

    private String email;

    public @NotBlank(message = "Имя пользователя обязательно") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "Имя пользователя обязательно") String username) {
        this.username = username;
    }

    public @NotBlank(message = "Пароль обязателен") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Пароль обязателен") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Email обязателен") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email обязателен") String email) {
        this.email = email;
    }
}
