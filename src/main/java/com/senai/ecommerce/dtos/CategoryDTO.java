package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    List<ProductDTO> products;

    public CategoryDTO(long id, String name) {
    }

    public void setProducts(List<Product> products) {
        this.products = products.stream().map(product -> new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getImgUrl(), product.getCategories())).toList();
    }

}
