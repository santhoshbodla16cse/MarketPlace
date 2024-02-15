package com.botan.marketplace.dto.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductRequestDTO {

    private String name;
    private  double price;
    private String description;
}
