package com.mestesso.JPA_DEMO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateIndirizzo {

	private Indirizzo i;
	public CreateIndirizzo(Indirizzo i ) {
		this.i = i;
	}
	
	public void Create() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(i);
		em.getTransaction().commit();
		System.out.println(i);
	}
}
