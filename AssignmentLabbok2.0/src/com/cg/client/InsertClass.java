package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Author;

public class InsertClass {
public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Author author = new Author();
		author.setFirstName("Rowling");
		author.setMiddleName("Kipling");
		author.setLastName("Jerry");
		author.setPhoneNo(9176656056l);
		manager.persist(author);
		
		Author author1 = new Author();
		author1.setFirstName("Rana");
		author1.setMiddleName("");
		author1.setLastName("Dagupathy");
		author1.setPhoneNo(9172156045l);
		manager.persist(author1);
		

		Author author2 = new Author();
		author2.setFirstName("Muthu");
		author2.setMiddleName("Rama");
		author2.setLastName("Narayanan");
		author2.setPhoneNo(9840288660l);
		manager.persist(author2);
		
		Author author3 = new Author();
		author3.setFirstName("Santhosh");
		author3.setMiddleName("Raghu");
		author3.setLastName("Sriram");
		author3.setPhoneNo(9444627446l);
		manager.persist(author3);
		
		Author author4 = new Author();
		author4.setFirstName("Nihal");
		author4.setMiddleName("Rajasekaran");
		author4.setLastName("Sekhar");
		author4.setPhoneNo(9962677842l);
		manager.persist(author4);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
}
