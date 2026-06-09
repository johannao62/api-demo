package com.johana.demo.api_demo.controller;

import com.johana.demo.api_demo.dto.ProductDetailRequest;
import com.johana.demo.api_demo.dto.ProductDetailResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Map<String,Object> getProduct(
            @PathVariable String id){

        return Map.of(
                "productId",id,
                "name","Cuenta Ahorros",
                "status","ACTIVE");
    }

    @PostMapping("/query-detail")
    public ProductDetailResponse queryDetail(
            @RequestHeader("X-Correlation-ID") String correlationId,
            @RequestHeader("X-Channel") String channel,
            @Valid @RequestBody ProductDetailRequest request){

        return ProductDetailResponse.builder()
                .productId(request.getProductId())
                .name("Cuenta Ahorros")
                .status("ACTIVE")
                .currency("COP")
                .openingDate("2024-01-10")
                .build();
    }
}