package com.johana.demo.api_demo.dto;


import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseV2 {

    private String productId;
    private String name;
    private String status;
    private String currency;
    private BigDecimal availableBalance;

}
