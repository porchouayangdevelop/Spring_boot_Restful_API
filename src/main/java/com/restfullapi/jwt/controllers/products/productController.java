package com.restfullapi.jwt.controllers.products;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.restfullapi.jwt.models.product.*;
import com.restfullapi.jwt.services.product.ProductService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Validated
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class productController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);

    }

    @PostMapping("/create")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return new ResponseEntity<>("created product successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Product> findProductByID(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findProductByID(id)).getBody();

    }

}
