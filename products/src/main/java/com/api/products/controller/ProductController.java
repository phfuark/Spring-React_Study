package com.api.products.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProductController {

    @GetMapping("/")
    public String rout(){
        return "API está funcionando!";
    }
}
