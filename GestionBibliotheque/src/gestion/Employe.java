package gestion;

public class Employe extends Personne{
	private double salaire;
	
    //Constructor for Employee	
	public Employe (String nom,String prenom,String email,int id, int age,double salaire){
		super(nom, prenom, email,id,age);
		this.salaire= salaire;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}}
