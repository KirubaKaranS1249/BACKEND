package com.demo.controller;

import com.demo.dto.Book;
import com.demo.service.BookService;

public class SaveController {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(29);
		b.setName("Python");
		b.setAuthor("IDK");
		b.setGenre("Tech");
		b.setPublicationyear(1991);
		BookService bs=new BookService();
		Book b1=bs.saveService(b);
		if(b1!=null) {
			System.out.println("Data saved...");
		}
		else {
			System.out.println("Please check the code.");
		}
		
	}

}
