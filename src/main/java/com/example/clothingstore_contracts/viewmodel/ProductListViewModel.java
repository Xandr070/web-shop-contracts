package com.example.clothingstore_contracts.viewmodel;

import java.util.List;

public record ProductListViewModel(
        List<ProductDTO> products,
        PaginationViewModel pagination
) {}
