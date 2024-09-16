package com.demo.service;

import java.util.List;

import com.demo.dao.BookDao;
import com.demo.dto.Book;

import jakarta.persistence.EntityManager;

public class BookService {
	BookDao bd=new BookDao();
	public Book saveService(Book b) {
		return bd.saveDao(b);
	}
	
	public Book updateService(Book b1) {
		
		return bd.updateDao(b1);	
	}
	
	public Book deleteService(Book b2) {
		return bd.deleteDao(b2);	
	}
	
	public Book getById(Book b) {
		return bd.getById(b);
		
	}
	
	public List<Book> getByAll(){
		return bd.getByAll();
		 
	}
}
