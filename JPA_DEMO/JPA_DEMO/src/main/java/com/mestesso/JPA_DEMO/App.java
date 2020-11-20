package com.mestesso.JPA_DEMO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Indirizzo indirizzo = new Indirizzo();
    	indirizzo.setVia("via Roma");
    	indirizzo.setCittà("Trieste");
    	indirizzo.setNumero(35);
    	CreateIndirizzo i = new CreateIndirizzo(indirizzo);
    	i.Create();
    	Cavallo c = new Cavallo();
    	c.setName("mario");
    	c.setRazza("purosangue");
    	
    	c.setIndirizzo(indirizzo);
    	System.out.println(indirizzo.toString() + " " + c.toString());
    	CreateCavallo c1 = new CreateCavallo(c);
    	c1.Create();
    	
    	/*
    	Alien a = new Alien();
    	a.setAid(8);
    	a.setAname("gesu");
    	a.setTech("cristo");
    	
    	
    	CreateAlien c = new CreateAlien(a);
    	c.Create();
    	
    	/*
    	RemoveAlien r = new RemoveAlien();
    	r.Remove(5);
    	*/
    	/*
    	UpdateAlien u = new UpdateAlien();
    	u.UpdateTech(4, "GG");
    	*/
    }
}
