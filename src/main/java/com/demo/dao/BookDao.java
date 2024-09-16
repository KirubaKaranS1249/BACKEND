package com.demo.dao;

import java.util.List;

import com.demo.dto.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BookDao {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("kiruba");
	public Book saveDao(Book b) {
		EntityManager em=e.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if(b!=null) {
			et.begin();
			em.persist(b);
			et.commit();
			
		}
		return b;
		
	}
	
	public Book updateDao(Book b1) {
		EntityManager em=e.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b2=em.find(Book.class,b1.getId());
		if(b2!=null) {
			et.begin();
			em.merge(b1);
			et.commit();
		}
		
		return b2;
	}
	
	public Book deleteDao(Book b2) {
		EntityManager em=e.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b3=em.find(Book.class,b2.getId());
		if(b3!=null) {
			et.begin();
			em.remove(b3);
			et.commit();
			
		}
		return b3;
	}
	
	public Book getById(Book b) {
		EntityManager em=e.createEntityManager();
		Book b1=em.find(Book.class,b.getId());
		return b1;
	}
	public List <Book> getByAll(){
		EntityManager em=e.createEntityManager();
		Query query=em.createQuery("select a from Book a");
		List<Book> li=query.getResultList();
		return query.getResultList();
	}

}
