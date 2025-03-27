package com.fptaptech.springbootiocdibeantransactionalorm.repository;

import com.fptaptech.springbootiocdibeantransactionalorm.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
