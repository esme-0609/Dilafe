package com.dilafe.Dilafeback.DTO;

import com.dilafe.Dilafeback.Entities.Product;
import org.springframework.data.domain.Page;

public class PageMapper {
    public static <T> ResponsePagination<Product> mapPageToDTO(Page<Product> page) {
        return new ResponsePagination<>(
                page.getContent(),
                page.getTotalElements(),
                page.getTotalPages(),
                page.getNumber(),
                page.getSize(),
                page.isFirst(),
                page.isLast(),
                page.hasNext(),
                page.hasPrevious()
        );
    }
}
