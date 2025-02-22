package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.Category;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    @Size(min = 2, max = 100, message = "O campo nome precisa ter entre 2 e 100 caracteres")
    @NotBlank(message = "O campo não pode star vazio")
    private String name;
    @Size(min = 10, message = "O campo descrição não pode estar vazio")
    private String description;
    @NotNull(message = "O campo preço não pode ser vazio")
    @Positive(message = "O campo preço precisa ser positivo")
    private double price;
    private String imgUrl;
    @NotEmpty(message = "O campo categorias não pode estar vazio")
    private List<CategoryDTO> categories;

    public void setCategories(Set<Category> categories) {
        this.categories = categories.stream().map(category -> new CategoryDTO(category.getId(), category.getName())).toList();
    }



}
