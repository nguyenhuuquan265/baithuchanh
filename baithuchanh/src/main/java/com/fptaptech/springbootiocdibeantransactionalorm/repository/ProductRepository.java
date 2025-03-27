package com.fptaptech.springbootiocdibeantransactionalorm.repository;

import com.fptaptech.springbootiocdibeantransactionalorm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
