package gestion;

public class Etudiant extends Personne{
	private String branche;
	
    //Constructor for Student	
	public Etudiant (String nom,String prenom,String email,int id, int age, String branche){
		super(nom, prenom, email,id,age);
		this.branche= branche;
	}
	public String getBranche() {
		return branche;
	}
	public void setBranche(String branche) {
		this.branche = branche;
	}
}


