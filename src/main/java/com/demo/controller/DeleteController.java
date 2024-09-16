package com.demo.controller;

import com.demo.dto.Book;
import com.demo.service.BookService;

public class DeleteController {

	public static void main(String[] args) {
		Book b=new Book();
		b.setId(15);
		BookService bs=new BookService();
		Book b1=bs.deleteService(b);
		if(b1!=null) {
			System.out.println("Data deleted...");
		}
		else {
			System.out.println("Please check the code.");
		}
	}

}
