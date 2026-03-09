package com.sena.Cafeteria.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.Product;
import com.sena.Cafeteria.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product save(Product product){
        return repository.save(product);
    }
}
