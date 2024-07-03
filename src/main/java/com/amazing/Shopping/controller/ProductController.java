package com.amazing.Shopping.controller;

import com.amazing.Shopping.Service.ProductService;
import com.amazing.Shopping.data.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController
{

    private ProductService service;

    @Autowired
    public ProductController(ProductService s) {
        this.service = s;
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product, @RequestParam(name = "id",required = true) Long id) throws Exception {
        if(product.getProductName()==null)
        {
            throw new Exception("Category name cannot be null");
        }
        service.addProduct(product,id);
    }
}
