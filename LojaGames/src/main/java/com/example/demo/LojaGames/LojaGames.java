package com.example.demo.LojaGames;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LojaGames {

	@Entity
	@Table(name = "GameGen")
	public class TabelaGame {
		
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 15)
	private String Usuário;

	
	@NotNull
	@Size(min = 5, max = 10)
	private String Personagem;

	@NotNull
	@Size(min = 5, max = 10)
	private String Poderes;
	
	@Size(min = 5, max = 15)
	@NotNull
	private String PoderEspecial;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuário() {
		return Usuário;
	}

	public void setUsuário(String usuário) {
		Usuário = usuário;
	}

	public String getPersonagem() {
		return Personagem;
	}

	public void setPersonagem(String personagem) {
		Personagem = personagem;
	}

	public String getPoderes() {
		return Poderes;
	}

	public void setPoderes(String poderes) {
		Poderes = poderes;
	}

	public String getPoderEspecial() {
		return PoderEspecial;
	}

	public void setPoderEspecial(String poderEspecial) {
		PoderEspecial = poderEspecial;
	}

	
	}
}

