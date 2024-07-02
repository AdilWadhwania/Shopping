package com.amazing.Shopping.controller;

import com.amazing.Shopping.data.entities.Categories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoriesController
{


    @PostMapping("/add")
    private void addCategory(@RequestBody Categories category)
    {

    }
}
