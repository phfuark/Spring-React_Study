package com.api.products.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.products.models.ProductModel;
import com.api.products.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    @Autowired 
    private ProductService ps;

    @GetMapping("/")
    public String rout(){
        return "API está funcionando!";
    }

    @GetMapping("/listAll")
    public Iterable<ProductModel> listAll() {
        return ps.listAll();
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody ProductModel pm){
        return ps.register(pm);
    }
    

}
