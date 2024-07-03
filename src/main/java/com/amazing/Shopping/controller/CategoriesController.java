package com.amazing.Shopping.controller;

import com.amazing.Shopping.Service.CategoryService;
import com.amazing.Shopping.data.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/categories")
public class CategoriesController
{

    private CategoryService service;

    @Autowired
    public CategoriesController( CategoryService service) {
        this.service = service;
    }

    @GetMapping("/service")
    public String controllerCheck()
    {
        return "Service is up and running";
    }

    @GetMapping("/get")
    public List<Category> getAllCategories()
    {
        return service.getCategoriesFromDB();
    }

    @PostMapping("/add")
    private Category addCategory(@RequestBody Category category) throws Exception {
        if(category.getName()==null)
        {
            throw new Exception("Category name cannot be null");
        }
        return service.addCategoryToDb(category);
    }
}
