package com.amazing.Shopping.controller;

import com.amazing.Shopping.Service.CategoryService;
import com.amazing.Shopping.data.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoriesController
{


    private CategoryService service;

    @Autowired
    public CategoriesController(CategoryService service) {
        this.service = service;
    }

    @PostMapping("/add")
    private void addCategory(@RequestBody Categories category) throws Exception {
        if(category.getName()==null)
        {
            throw new Exception("Category name cannot be null");
        }
        service.addCategoryToDb(category);
    }
}
