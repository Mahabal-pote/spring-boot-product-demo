package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductPojo{
	private Long skuid;
	@NotNull(message="FirstName cannot be null") 	
	@Size(min=3,max =50, message="FirstName cannot be less than 2 characters") 	
	private String name;
	private String brand;
	@Min(2)
	@Max(4)
	private int size;
	private int prize;
	private String url;
	
	public Long getSkuid() {
		return skuid;
	}

	public void setSkuid(Long skuid) {
		this.skuid = skuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ProductPojo [skuid=" + skuid + ", name=" + name + ", brand=" + brand + ", size=" + size + ", prize="
				+ prize + ", url=" + url + "]";
	}

}