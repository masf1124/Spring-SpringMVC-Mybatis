package org.fkit.domain;

public class Book {
	public Book() {
		super();
	}
	
	private Integer id;
	private String name;
	private String author;
	
	
	public Book(Integer id,String name,String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "author:" + author+" book name:"+name + "  id:"+id;
	}
}
