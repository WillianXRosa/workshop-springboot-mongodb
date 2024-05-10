package com.nelioalves.workshopmongo.domain;

public class User {
	
	private String id;
	private String nome;
	private String email;
	
	
	
	public User(String id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
