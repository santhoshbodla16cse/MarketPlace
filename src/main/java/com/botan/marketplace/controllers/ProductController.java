package com.botan.marketplace.controllers;

import com.botan.marketplace.dto.requests.ProductRequestDTO;
import com.botan.marketplace.dto.responses.ProductResponseDTO;
import com.botan.marketplace.models.Product;
import com.botan.marketplace.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "getAllProducts")
    public ProductResponseDTO getAllProducts(){
        return ProductResponseDTO.builder()
                .productList(productService.getAllProducts())
                .build();
    }


    @PostMapping(value = "/addAProduct")
    public Product addproduct(@RequestBody ProductRequestDTO productRequestDTO){
        log.info("I entered here");
        return productService.addAProduct(productRequestDTO);
    }
}
