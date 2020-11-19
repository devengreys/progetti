package com.mestesso.JPA_DEMO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateAlien {

	public UpdateAlien() {
	}
	
	public void UpdateTech(int aid,String tech) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Alien a = em.find(Alien.class, aid);
		a.setTech(tech);
		em.getTransaction().commit();
		emf.close();
		em.close();
		System.out.println("Alien updated");
	}
}