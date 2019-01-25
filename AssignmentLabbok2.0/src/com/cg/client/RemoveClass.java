package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Author;

public class RemoveClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Author author = manager.find(Author.class, 6);
		
		manager.remove(author);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
