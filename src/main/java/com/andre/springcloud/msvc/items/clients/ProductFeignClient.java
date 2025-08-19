package com.andre.springcloud.msvc.items.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.andre.springcloud.msvc.items.models.Product;

@FeignClient (name = "msvc-products", url = "http://localhost:8001")
public interface ProductFeignClient {

    @GetMapping("/api/products")
    List<Product> findAll();

     @GetMapping("/api/products/{id}")
     Product detail(@PathVariable Long id);

    
}
