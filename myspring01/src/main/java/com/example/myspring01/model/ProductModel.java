package com.example.myspring01.model;

import com.example.myspring01.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductModel extends CrudRepository<Product, Integer> {

}
