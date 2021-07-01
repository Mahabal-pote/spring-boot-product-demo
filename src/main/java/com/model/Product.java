package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity

@Table
public class Product
{
@Id
//@GeneratedValue(strategy=GenerationType.TABLE)
@Column
@Min(1000000) 	
@Max(99999999)
private Long skuid;

@Column(nullable = false)
@Size(min=3,max=50)
private String name;

@Column(nullable = false)
@Size(min=3,max=50)
private String brand;

@Column(nullable = false)
private int size;

@Column
@Min(1) 	
@Max(99999999)
private int prize;

@Column
private String url;

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}


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


@Override
public String toString() {
	return "Product [skuid=" + skuid + ", name=" + name + ", brand=" + brand + ", size=" + size + ", prize=" + prize
			+ "]";
}


}