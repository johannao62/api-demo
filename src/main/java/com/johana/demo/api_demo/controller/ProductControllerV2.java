package com.johana.demo.api_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johana.demo.api_demo.dto.ProductResponseV2;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v2/products")
public class ProductControllerV2 {

    @GetMapping("/{id}")
    public ProductResponseV2 getProduct(
            @PathVariable String id){

        return ProductResponseV2.builder()
                .productId(id)
                .name("Cuenta Ahorros")
                .status("ACTIVE")
                .currency("COP")
                .availableBalance(new BigDecimal("5000000"))
                .build();
    }
}