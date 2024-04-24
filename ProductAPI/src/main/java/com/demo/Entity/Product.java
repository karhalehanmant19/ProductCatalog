package com.demo.Entity;

import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private String description;
 @Column(columnDefinition = "Double(10,2)")
 private double price;
 private List <String> categories; 
 private Map<String,String> attributes;
 private  Availability availability;
 private List <Rating> ratings;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", categories=" + categories + ", attributes=" + attributes + ", availability=" + availability
			+ ", ratings=" + ratings + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<String> getCategories() {
	return categories;
}
public void setCategories(List<String> categories) {
	this.categories = categories;
}
public Map<String, String> getAttributes() {
	return attributes;
}
public void setAttributes(Map<String, String> attributes) {
	this.attributes = attributes;
}
public Availability getAvailability() {
	return availability;
}
public void setAvailability(Availability availability) {
	this.availability = availability;
}
public List<Rating> getRatings() {
	return ratings;
}
public void setRatings(List<Rating> ratings) {
	this.ratings = ratings;
}
}
