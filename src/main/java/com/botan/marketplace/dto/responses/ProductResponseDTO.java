package com.botan.marketplace.dto.responses;

import com.botan.marketplace.models.Product;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductResponseDTO {
    private List<Product> productList;
}
