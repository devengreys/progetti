package com.mestesso.JPA_DEMO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateAlien {

	private Alien a;
	public CreateAlien(Alien a ) {
		this.a = a;
	}
	
	public void Create() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println(a);
	}
}
