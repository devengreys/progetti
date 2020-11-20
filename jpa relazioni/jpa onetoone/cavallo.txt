package com.mestesso.JPA_DEMO;

import java.io.Serializable;
import javax.persistence.*;

import com.sun.istack.NotNull;

/**
 * Entity implementation class for Entity: Cavallo
 *
 */
@Entity
@Table(name = "cavallo")
public class Cavallo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id;
	private String name;
	private String razza;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "indirizzo")
	private Indirizzo indirizzo;
	
	public Cavallo(){
		
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRazza(String razza) {
		this.razza = razza;
	}
	
	public String getRazza() {
		return razza;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Cavallo [id=" + id + ", name=" + name + ", razza=" + razza + ", indirizzo=" + indirizzo + "]";
	}

	
	
	
	
}
