package com.jsp.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.crud.dao.Product;
import com.jsp.crud.repository.ProductRepository;

@Service
public class productService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product updatedProduct) {
        Product existingProduct = productRepository.findById(productId).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(updatedProduct.getName());
            return productRepository.save(existingProduct);
        }

        return null;
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
