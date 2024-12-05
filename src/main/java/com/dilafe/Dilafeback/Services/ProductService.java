package com.dilafe.Dilafeback.Services;

import com.dilafe.Dilafeback.Entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Page<Product> productsPagination(Pageable pageable);
}
