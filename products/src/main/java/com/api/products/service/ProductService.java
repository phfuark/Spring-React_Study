package com.api.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.products.models.ProductModel;
import com.api.products.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository pr;
    
    // List All
    public Iterable<ProductModel> listAll(){
        return pr.findAll();
    }

}
