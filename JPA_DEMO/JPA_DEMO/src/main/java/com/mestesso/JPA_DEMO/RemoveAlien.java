package com.mestesso.JPA_DEMO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveAlien {

	public RemoveAlien( ) {
	}
	
	public void Remove(int aid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Alien a = em.find(Alien.class, aid);
		em.remove(a);
		em.getTransaction().commit();
		emf.close();
		em.close();
		System.out.println("Alien removed");
	}
}