package com.example.springbootmall.Service;

import com.example.springbootmall.dto.ProductRequest;
import com.example.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
