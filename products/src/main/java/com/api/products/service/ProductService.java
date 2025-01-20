package com.api.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.products.models.ProductModel;
import com.api.products.models.ProductResponse;
import com.api.products.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository pr;

    @Autowired
    private ProductResponse prr;
    
    // List All
    public Iterable<ProductModel> listAll(){
        return pr.findAll();
    }

    // Register or Change a product
    public ResponseEntity<?> registerOrChange(ProductModel pm, String action){
        if(pm.getName().equals("")){
            prr.setMessage("Nome de produto inválido!");
            return new ResponseEntity<ProductResponse>(prr, HttpStatus.BAD_REQUEST);
        }else if(pm.getBrand().equals("")){
            prr.setMessage("Nome de marca inválido!");
            return new ResponseEntity<ProductResponse>(prr, HttpStatus.BAD_REQUEST);
        } else{
            if(action.equals("Change")){
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.OK);
            } else{
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.CREATED);
            }
        }
    }   


    //Delete

    public ResponseEntity<ProductResponse> remove(long code){
        pr.deleteById(code);

        prr.setMessage("Produto deletado com sucesso!");
        return new ResponseEntity<ProductResponse>(prr, HttpStatus.OK);
    }

}
