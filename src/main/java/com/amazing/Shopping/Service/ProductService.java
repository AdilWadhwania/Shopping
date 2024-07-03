package com.amazing.Shopping.Service;

import com.amazing.Shopping.data.entities.Product;
import com.amazing.Shopping.data.repository.CategoryRepo;
import com.amazing.Shopping.data.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{

    private ProductRepo repo;

    private CategoryRepo cat_repo;
    @Autowired
    public ProductService(ProductRepo repo,CategoryRepo repos) {
        this.repo = repo;
        this.cat_repo=repos;

    }

    public void addProduct(Product product, long cat_id)
    {
        try
        {
            product.setCategory(cat_repo.findById(cat_id).get());
            repo.save(product);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
