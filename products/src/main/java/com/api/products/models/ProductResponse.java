package com.api.products.models;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class ProductResponse {
    private String message;

    // Explicit Getter and Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
