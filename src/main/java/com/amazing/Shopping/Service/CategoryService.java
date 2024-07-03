package com.amazing.Shopping.Service;

import com.amazing.Shopping.data.entities.Category;
import com.amazing.Shopping.data.repository.CategoryRepo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@NoArgsConstructor
@Data
public class CategoryService
{


    private CategoryRepo repo;

    @Autowired
    public CategoryService(CategoryRepo repo) {
        this.repo = repo;
    }

    public Category addCategoryToDb(Category category) {
        try
        {
            return repo.save(category);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    public List<Category> getCategoriesFromDB()
    {
        try
        {
            return repo.findAll();
        }
        catch (Exception e)
        {
            throw  e;
        }
    }

}
