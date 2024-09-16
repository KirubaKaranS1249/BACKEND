package com.demo.controller;

import com.demo.dto.Book;
import com.demo.service.BookService;

public class UpdateController {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(15);
		b.setName("Horror");
		b.setAuthor("Lawrance");
		b.setGenre("Movie");
		b.setPublicationyear(2018);
		BookService bs=new BookService();
		Book b1=bs.updateService(b);
		if(b1!=null) {
			System.out.println("Data updated");
		}
		else {
			System.out.println("Please check the code.");
		}
	}

}
