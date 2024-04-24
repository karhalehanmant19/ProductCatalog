package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Product;
import com.demo.Service.ProductService;

@RestController
public class MyController {
	@Autowired
	private ProductService productservice;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return this.productservice.getAllProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable int productId) {
	    return this.productservice.getProductById(productId);
	}

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return this.productservice.addProduct(product);
	}
	
	@PutMapping("/products/{productId}")
    public Product updateProduct(@PathVariable int productId, @RequestBody Product product) {
        product.setId(productId);
        return this.productservice.updateProduct(product);
    }
	
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
	    this.productservice.deleteProduct(productId);
	}


	


}
