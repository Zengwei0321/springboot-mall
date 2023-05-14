package com.example.springbootmall.constant;

import java.util.Calendar;

public class Mytest {
    public static void main(String[] args) {
            ProductCategory category = ProductCategory.FOOD;
            String s = category.name();
            System.out.println(s);

            String s2 = "CAR";
            ProductCategory category1 = ProductCategory.valueOf(s2);
    }
}
