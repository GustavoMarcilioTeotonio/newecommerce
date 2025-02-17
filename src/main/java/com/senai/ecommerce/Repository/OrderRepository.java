package com.senai.ecommerce.Repository;

import com.senai.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Category, Long> {
}
