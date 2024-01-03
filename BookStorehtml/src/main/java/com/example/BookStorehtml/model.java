package com.example.BookStorehtml;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookRegister")
public class model {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	
	public int id;
	public String name;
	public String author;
	public String price;
	public model(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public model() {
		super();
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(String price) {
		this.price=price;
	}
	public String getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	
	

}
