package com.amazing.Shopping.Service;

import com.amazing.Shopping.data.entities.Categories;
import com.amazing.Shopping.data.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService
{


    private CategoryRepo repo;

    @Autowired
    public CategoryService(CategoryRepo repo) {
        this.repo = repo;
    }

    public void addCategoryToDb(Categories category) {
        try
        {
            repo.save(category);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
