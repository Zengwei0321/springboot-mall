package com.example.springbootmall.rowmapper;

import com.example.springbootmall.constant.ProductCategory;
import com.example.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));


        String categoryString = resultSet.getString("category");
        ProductCategory category = ProductCategory.valueOf(categoryString); //特殊用法 改為Enum
        product.setCategory(category);

        //product.setCategory(ProductCategory.valueOf(resultSet.getString("category"))); //跟上面一樣


        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock((resultSet.getInt("stock")));
        product.setDescription(resultSet.getString("description"));
        return product;
    }
}
