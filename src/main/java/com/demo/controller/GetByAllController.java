package com.demo.controller;

import java.util.List;

import com.demo.dto.Book;
import com.demo.service.BookService;

public class GetByAllController {

	public static void main(String[] args) {
		BookService bs=new BookService();
		List<Book> list=bs.getByAll();
		if(list!=null) {
			for(Book b1:list) {
				System.out.println("Book name is : "+b1.getName());
				System.out.println("Book id is : "+b1.getId());
				System.out.println("Book author is : "+b1.getAuthor());
				System.out.println("Book gener is : "+b1.getGenre());
				System.out.println("Book publication year is : "+b1.getPublicationyear());
				System.out.println("-------------------------------");
			}
		}else {
			System.out.println("");
		}
	}

}
