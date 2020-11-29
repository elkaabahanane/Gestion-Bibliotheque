package gestion;

public class Livre {
	private String auteur,titre;
	private double prix;
	private int id;
	

	//Constructor for Book
	public Livre(String auteur,String titre, double prix,int id) {
		this.auteur = auteur;
		this.titre=titre;
		this.prix=prix;
		this.id=id;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

