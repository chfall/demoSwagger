package com.demoswaggerd.crudswagger.service;

import com.demoswaggerd.crudswagger.model.Product;
import com.demoswaggerd.crudswagger.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product) {
        //return repository.save(product);
        return repository.save(product);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Optional<Product> getById(Long id) {
        return repository.findById(id);
    }

    public Product update(Long id, Product details) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit introuvable : " + id));
        product.setName(details.getName());
        product.getPrice();
        product.setPrice(details.getPrice());
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

