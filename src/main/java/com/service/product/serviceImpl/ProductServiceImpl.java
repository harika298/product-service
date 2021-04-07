package com.service.product.serviceImpl;

import com.service.product.domain.ProductType;
import com.service.product.repository.ProductRepository;
import com.service.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;


    @Override
    public void insertProductType(ProductType productType) {
        repo.save(productType);

    }

    @Override
    public ProductType getProductType(int id) {
        return repo.getOne(id);
    }

    @Override
    public void deleteProductType(int id) {
        repo.deleteById(id);

    }

}