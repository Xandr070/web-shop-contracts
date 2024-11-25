package com.example.clothingstore_contracts.viewmodel;

public record ProductDTO(
        Long id,
        String name,
        String description,
        double price,
        double discount,
        String category,
        String season
) {}
