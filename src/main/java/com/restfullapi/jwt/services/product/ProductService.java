package com.restfullapi.jwt.services.product;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.restfullapi.jwt.exception.ResourceNotFoundException;
import com.restfullapi.jwt.models.product.Product;
import com.restfullapi.jwt.repositories.productRepository;

@Service
public class ProductService {

    @Autowired
    productRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public ResponseEntity<List<Product>> createProduct(Product product) {
        if (product.getProductName().isEmpty() || product.getProductName() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (product.getDescription().isEmpty() || product.getDescription() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        productRepository.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Product> findProductByID(Long id) {
        Product product = productRepository.findProductById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product Not Found"));

        return ResponseEntity.ok().body(product);
    }

}
