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
    	Alien a = new Alien();
    	a.setAid(8);
    	a.setAname("gesu");
    	a.setTech("cristo");
    	/*
    	CreateAlien c = new CreateAlien(a);
    	c.Create();
    	*/
    	/*
    	RemoveAlien r = new RemoveAlien();
    	r.Remove(5);
    	*/
    	UpdateAlien u = new UpdateAlien();
    	u.UpdateTech(4, "GG");
    	
    }
}
