package com.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.Entity.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	private List<Product> productList;
	public ProductServiceImpl() {
		this.productList= new ArrayList<>();
		
	}
	@Override
	public List<Product> getAllProducts() {
		
		return this.productList;
	}

	@Override
	public Product getProductById(int ProductId) {
		for(Product product : productList) {
			if(product.getId()== ProductId) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		int newProductId=productList.isEmpty()? 1 : productList.get(productList.size()-1).getId()+1;
		product.setId(newProductId);
		productList.add(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		for(int i=0; i < productList.size(); i++) {
			if(productList.get(i).getId()==product.getId()) {
				productList.set(i, product);
				return product;
			}
		}
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		productList.removeIf(product -> product.getId()== productId);
		
	}

}
