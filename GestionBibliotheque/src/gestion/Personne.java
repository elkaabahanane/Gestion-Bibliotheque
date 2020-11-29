package gestion;

public class Personne {
	private String nom,prenom,email;
	private int id,age;
	
    //Constructor for person	
	public Personne (String nom,String prenom,String email,int id, int age){
		this.nom =nom;
		this.prenom = prenom;
		this.email=email;
		this.id=id;
		this.age=age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
}
