package com.example.springbootmall.Service.impl;

import com.example.springbootmall.Dao.ProductDao;
import com.example.springbootmall.Service.ProductService;
import com.example.springbootmall.dto.ProductRequest;
import com.example.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
