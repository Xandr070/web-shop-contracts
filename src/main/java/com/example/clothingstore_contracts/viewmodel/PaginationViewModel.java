package com.example.clothingstore_contracts.viewmodel;

public record PaginationViewModel(
        int page,
        int size,
        long totalItems
) {}
