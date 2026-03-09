package com.sena.Cafeteria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Cafeteria.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}