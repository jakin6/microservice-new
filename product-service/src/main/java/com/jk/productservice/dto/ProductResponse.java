package com.jk.productservice.dto;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
