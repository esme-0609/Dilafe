package com.dilafe.Dilafeback.Services.Impl;

import com.dilafe.Dilafeback.Entities.Product;
import com.dilafe.Dilafeback.Repository.ProductRepository;
import com.dilafe.Dilafeback.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> productsPagination(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
