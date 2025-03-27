package com.fptaptech.springbootiocdibeantransactionalorm.config;

import com.fptaptech.springbootiocdibeantransactionalorm.entity.Category;
import com.fptaptech.springbootiocdibeantransactionalorm.entity.Product;
import com.fptaptech.springbootiocdibeantransactionalorm.repository.CategoryRepository;
import com.fptaptech.springbootiocdibeantransactionalorm.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CommandLineRunner dataLoader(CategoryRepository categoryRepository,
                                        ProductRepository productRepository){
        return args -> {
            Category electronics = new Category("Electronics", "Cac loai thiết bị điện");
            Category books = new Category("Books","Sách giấy in");
            //Product product = new Product("sasung",12,"new",electronics);
            productRepository.save(new Product("iPhone",12,"new",electronics));
            productRepository.save(new Product("HW",12,"new",electronics));
            productRepository.save(new Product("SamSung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));
            productRepository.save(new Product("sasung",12,"new",electronics));

        };
    }

}

