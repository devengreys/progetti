package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtenteResource {

	@Autowired
	UtenteRepository repo;
	
	@GetMapping("utenti")
	public List<Utente> getUtenti(){
		List<Utente> utenti = repo.findAll();
		return utenti;
	}
	
	@PostMapping("deleteUtenti")
	public void deleteUtenti() {
		repo.deleteAllInBatch();
	}
	
	@PostMapping("setUtenteUsername/{id}/{username}")
	public void setUtenteUsername(@PathVariable int id,@PathVariable String username) {
		Utente u = new Utente();
		u = repo.findById(id).get();
		u.setUsername(username);
		repo.save(u);
	}
	@PostMapping("deleteUtente/{id}")
	public void deleteUtente(@PathVariable int id) {
		repo.deleteById(id);
	}
}
