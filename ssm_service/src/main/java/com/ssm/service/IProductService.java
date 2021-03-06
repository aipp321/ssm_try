package com.ssm.service;

import com.ssm.domain.Product;

import java.util.List;

public interface IProductService{
    public List<Product> findAll() throws Exception;
    public Product findById(String id) throws Exception;
    void save(Product product) throws Exception;
}
