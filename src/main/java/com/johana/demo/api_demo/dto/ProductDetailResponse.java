package com.johana.demo.api_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailResponse {

    private String productId;
    private String name;
    private String status;
    private String currency;
    private String openingDate;

}