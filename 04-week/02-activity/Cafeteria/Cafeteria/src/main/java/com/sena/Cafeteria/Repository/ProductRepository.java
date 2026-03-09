package com.sena.Cafeteria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}