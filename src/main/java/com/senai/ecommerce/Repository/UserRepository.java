package com.senai.ecommerce.Repository;

import com.senai.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
