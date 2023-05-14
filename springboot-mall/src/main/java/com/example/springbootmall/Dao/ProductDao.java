package com.example.springbootmall.Dao;

import com.example.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
