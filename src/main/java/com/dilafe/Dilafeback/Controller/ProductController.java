package com.dilafe.Dilafeback.Controller;

import com.dilafe.Dilafeback.DTO.PageMapper;
import com.dilafe.Dilafeback.DTO.ResponsePagination;
import com.dilafe.Dilafeback.Entities.Product;
import com.dilafe.Dilafeback.Services.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    Logger logger = LogManager.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @RequestMapping(path = "api/products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        logger.info("---Ingresando a GETPRODUCTS---");
        return productService.getProducts();
    }

    /*@RequestMapping(path = "api/products/pagination", method = RequestMethod.GET)
    public ResponseEntity<Page<Product>> pagination(@RequestParam int page, @RequestParam int size){
        logger.info("---Ingresando a PAGINATION---");
        Pageable pageable = PageRequest.of(page,size);
        logger.info("CONTENT :: " + productService.productsPagination(pageable).getPageable());
        return new ResponseEntity<>(productService.productsPagination(pageable), HttpStatus.OK);
    }*/
    @RequestMapping(path = "api/products/pagination", method = RequestMethod.GET)
    public ResponsePagination<Product> pagination(@RequestParam int page, @RequestParam int size){

        logger.info("---Ingresando a PAGINATION---");

        Page<Product> productPage = productService.productsPagination(PageRequest.of(page, size));

        // Mapear la página a un DTO adecuado
        return PageMapper.mapPageToDTO(productPage);

    }

}
