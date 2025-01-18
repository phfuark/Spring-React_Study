package com.api.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.products.models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{
    
}
