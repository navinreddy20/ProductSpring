package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

//    public void addProduct(Product p){
////        products.add(p);
//
//        db.save(p);
//
//    }
//
    public List<Product> getAllProducts(){

        return db.findAll();
    }
//
//    public Product getProduct(String name){
//        for(Product p : products){
//            if(p.getName().equals(name))
//                return p;
//        }
//
//        return null;
//    }


}
