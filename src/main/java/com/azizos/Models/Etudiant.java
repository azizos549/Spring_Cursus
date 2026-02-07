package com.azizos.Models;

public class Etudiant {
   
	private int id , age;
	String nom , prenom ,mail,etat ;
	
	public Etudiant() {}
	public Etudiant(int id, int age , String nom , String prenom , String mail , String etat ) {
		this.id=id;
		this.age=age;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.etat=etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", age=" + age + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", etat=" + etat + "]";
	}
	
}
