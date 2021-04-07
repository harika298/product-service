package com.service.product.controller;

import com.service.product.domain.ProductType;
import com.service.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(path = "/insertProduct", consumes = "application/json", produces = "application/json")
    public void insertProducts(@RequestBody ProductType productType){
        productService.insertProductType(productType);
    }

    @GetMapping(path = "/getProductType/{id}", produces = "application/json")
    public ProductType getProductTypeById(@PathVariable int id){
       return productService.getProductType(id);

    }
    @DeleteMapping(path = "/deleteProductType/{id}")
    public HttpStatus deleteCustomerById(@PathVariable int id){
        productService.deleteProductType(id);
        return HttpStatus.OK;
    }

}
