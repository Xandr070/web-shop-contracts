package com.example.clothingstore_contracts.viewmodel;

import java.util.List;

public class TopProductsViewModel {
    private List<ProductViewModel> topProducts;

    public List<ProductViewModel> getTopProducts() {
        return topProducts;
    }

    public void setTopProducts(List<ProductViewModel> topProducts) {
        this.topProducts = topProducts;
    }
}
