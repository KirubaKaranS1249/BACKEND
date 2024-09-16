package com.demo.controller;

import com.demo.dto.Book;
import com.demo.service.BookService;

public class GetByIdController {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(27);
		BookService bs=new BookService();
		Book b1=bs.getById(b);
		if(b1!=null) {
			System.out.println("Book name is : "+b1.getName());
			System.out.println("Book id is : "+b1.getId());
			System.out.println("Book author is : "+b1.getAuthor());
			System.out.println("Book gener is : "+b1.getGenre());
			System.out.println("Book publication year is : "+b1.getPublicationyear());
		}
		else {
			System.out.println("Book object is not present.");
		}
	}

}
