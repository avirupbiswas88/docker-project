package com.project.docker.domain;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productCode;
	private String releaseDate;
	private String description;
	private float price;
	private float starRating;
	private String imageUrl;
	
	@ElementCollection
    @CollectionTable(name="tags")
	private List<String> tags;
	
	
	public Product() {}
	
	public Product(String productName, String productCode, String releaseDate, String description,
			float price, float starRating, String imageUrl, List<String> tags) {
		super();
		//this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.description = description;
		this.price = price;
		this.starRating = starRating;
		this.imageUrl = imageUrl;
		this.tags = tags;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public float getStarRating() {
		return starRating;
	}
	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCode=" + productCode
				+ ", releaseDate=" + releaseDate + ", description=" + description + ", price=" + price + ", starRating="
				+ starRating + ", imageUrl=" + imageUrl + ", tags=" + tags + "]";
	}
	
	

}
