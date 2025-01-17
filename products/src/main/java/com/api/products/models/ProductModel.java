package com.api.products.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class ProductModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long code;
    private String name;
    private String brand;

}
