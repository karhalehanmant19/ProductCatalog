package com.demo.Service;

import java.util.List;

import com.demo.Entity.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(int ProductId);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProduct(int productId);
	

}
