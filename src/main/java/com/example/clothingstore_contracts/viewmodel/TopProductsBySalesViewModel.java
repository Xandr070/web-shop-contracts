package com.example.clothingstore_contracts.viewmodel;

import java.util.List;

public class TopProductsBySalesViewModel {
    private List<ProductDTO> topProducts;

    public List<ProductDTO> getTopProducts() {
        return topProducts;
    }

    public void setTopProducts(List<ProductDTO> topProducts) {
        this.topProducts = topProducts;
    }
}
