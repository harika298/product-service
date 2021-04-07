package com.service.product.service;

import com.service.product.domain.ProductType;

public interface ProductService {
    public void insertProductType(ProductType productType);

    public ProductType getProductType(int id);

    public void deleteProductType(int id);

}