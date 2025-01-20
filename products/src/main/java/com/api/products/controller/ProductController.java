package com.api.products.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.products.models.ProductModel;
import com.api.products.models.ProductResponse;
import com.api.products.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        return ps.registerOrChange(pm, "Register");
    }

    @PutMapping("/change")
    public ResponseEntity<?> change(@RequestBody ProductModel pm){
        return ps.registerOrChange(pm, "Change");
    }

    @DeleteMapping("/remove/{code}")
    public ResponseEntity<ProductResponse> remove(@PathVariable long code){
        return ps.remove(code);
    }
}
