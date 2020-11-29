package gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	private static ArrayList<Employe> employees = new ArrayList<>();
	private static ArrayList<Livre> livres = new ArrayList<>();
	private static ArrayList<Etudiant> etudiants = new ArrayList<>();
	
	public static void afficherMenu() {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Veuillez entrer votre choix s'il vous plait");
	    System.out.println("1.Gestion des employés");
	    System.out.println("2.Gestion des étudiants");
	    System.out.println("3.Gestion des livres");
	    int nbre = Integer.parseInt(scan.nextLine());

	    switch(nbre) {
	    	case 1:
	    		gestionEmploye();
	    	break;
	    	case 2:
	    		gestionEtudiant();
	    	break;
	    	case 3:
	    		gestionLivre();
	    	break;
	    }
	}
	
	public static void confirmation() {
		Scanner clavier = new Scanner(System.in);

		System.out.println("Voulez-vous retourner au menu principale");
	    System.out.println("no / yes");
	       
	    String reponse = clavier.nextLine();
	    
		switch(reponse) {
			case "yes":
				afficherMenu();
	        break;
			case "no":
				System.out.println("Fin!!");
				System.exit(-1);
			break;
		}
	}
	
	public static void gestionEmploye() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Qu'est ce que vous voulez faire?");
	    System.out.println("1.Ajouter un employé");
	    System.out.println("2.Supprimer un employé");
	    System.out.println("3.Modifier un employé");
	    int nbre = Integer.parseInt(clavier.nextLine());
	    

	    switch(nbre) {
		    case 1:
			    ajouterEmploye();
			    confirmation();
			break;
		    case 2:
		    	supprimerEmploye();
			    confirmation();
			break;
		    case 3:
		    	modifierEmploye();
		    	confirmation();
	    }
	}
	
	public static void ajouterEmploye() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("veuillez entrer le nom de l'employé");
	    String nomEmploye = clavier.nextLine();
	    System.out.println("veuillez entrer le prenom de l'employé");
	    String prenomEmploye = clavier.nextLine();
	    System.out.println("veuillez entrer l'email de l'employé");
	    String emailEmploye = clavier.nextLine();
	    System.out.println("veuillez entrer l'id de l'employé");
	    int idEmploye = Integer.parseInt(clavier.nextLine());
	    System.out.println("veuillez entrer l'age de l'employé");
	    int ageEmploye = Integer.parseInt(clavier.nextLine());
	    System.out.println("veuillez entrer le salaire de l'employé");
	    double salaireEmploye = Integer.parseInt(clavier.nextLine());

	    Employe employee = new Employe(nomEmploye,prenomEmploye,emailEmploye,idEmploye,ageEmploye,salaireEmploye);
	    employees.add(employee);
	    
    	System.out.println(employee.getNom() + " " + employee.getPrenom() + " ajouter avec succes");
	}
	
	public static void supprimerEmploye() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous supprimer quelle employé? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (employees.size() > 0) {
			employees.remove(position);
			System.out.println("L'employe dans la position "+ position +" a été supprimer avec success");
		} else {
			System.out.println("La liste des employe est vide");
		}		
	}
	public static void modifierEmploye() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous modifier quel employe? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (employees.size() > 0) {
			System.out.println("Voulez-vous modifier quel champ?");
			System.out.println("1. Nom");
			System.out.println("2. Prénom");
			System.out.println("3. Email");
			System.out.println("4. ID");
			System.out.println("5. Age");
			System.out.println("6. Salaire");
			int champ = Integer.parseInt(clavier.nextLine());
			switch(champ) {
				case 1:
					System.out.println("Donner le nouveau Nom");
					String newNom = clavier.nextLine();
					etudiants.get(position).setNom(newNom);
					System.out.println("Modification faite avec succes");
					break;
				case 2:
					System.out.println("Donner le nouveau Prénom");
					String newPrenom = clavier.nextLine();
					etudiants.get(position).setPrenom(newPrenom);
					System.out.println("Modification faite avec succes");
					break;
				case 3:
					System.out.println("Donner le nouveau email");
					String newEmail = clavier.nextLine();
					etudiants.get(position).setEmail(newEmail);
					System.out.println("Modification faite avec succes");
					break;
				case 4:
					System.out.println("Donner le nouveau ID");
					int newID = Integer.parseInt(clavier.nextLine());
					etudiants.get(position).setId(newID);
					System.out.println("Modification faite avec succes");
					break;
				case 5:
					System.out.println("Donner le nouveau age");
					int newAge = Integer.parseInt(clavier.nextLine());
					etudiants.get(position).setAge(newAge);
					System.out.println("Modification faite avec succes");
					break;
				case 6:
					System.out.println("Donner le nouveau salaire");
					Double newSalaire = Double.parseDouble(clavier.nextLine());
					employees.get(position).setSalaire(newSalaire);
					System.out.println("Modification faite avec succes");
					break;

			}
		} else {
			System.out.println("La liste des employés est vide");
		}
		
	}
	
	public static void gestionEtudiant() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Qu'est ce que vous voulez faire?");
	    System.out.println("1.Ajouter un étudiant");
	    System.out.println("2.Supprimer un étudiant");
	    System.out.println("3.Modifier un étudiant");
	    int nbre = Integer.parseInt(clavier.nextLine());
	    
	    switch(nbre) {
		    case 1:
			    ajouterEtudiant();
			    confirmation();
			break;
		    case 2:
		    	supprimerEtudiant();
			    confirmation();
			break;
		    case 3:
		    	modifierEtudiant();
			    confirmation();
	    }
	}
	
	public static void ajouterEtudiant() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("veuillez entrer le nom de l'étudiant");
	    String nomEtudiant = clavier.nextLine();
	    System.out.println("veuillez entrer le prenom de l'étudiant");
	    String prenomEtudiant = clavier.nextLine();
	    System.out.println("veuillez entrer l'email de l'étudiant");
	    String emailEtudiant = clavier.nextLine();
	    System.out.println("veuillez entrer l'id de l'étudiant");
	    int idEtudiant = Integer.parseInt(clavier.nextLine());
	    System.out.println("veuillez entrer l'age de l'étudiant ");
	    int ageEtudiant = Integer.parseInt(clavier.nextLine());
	    System.out.println("veuillez entrer la branche de l'employé");
	    String brancheEtudiant = clavier.nextLine();

	    Etudiant etudiant = new Etudiant(nomEtudiant,prenomEtudiant,emailEtudiant,idEtudiant,ageEtudiant,brancheEtudiant);
	    etudiants.add(etudiant);
	    
    	System.out.println(etudiant.getNom() + " " + etudiant.getPrenom() + " ajouter avec succes");
	}
	
	public static void supprimerEtudiant() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous supprimer quelle étudiant? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (etudiants.size() > 0) {
			etudiants.remove(position);
			System.out.println("L'étudiant dans la position "+ position +" a été supprimer avec success");
		} else {
			System.out.println("La liste des etudiants est vide");
		}
		
	}
	
	public static void modifierEtudiant() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous modifier quel etudiant? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (etudiants.size() > 0) {
			System.out.println("Voulez-vous modifier quel champ?");
			System.out.println("1. Nom");
			System.out.println("2. Prénom");
			System.out.println("3. Email");
			System.out.println("4. ID");
			System.out.println("5. Age");
			System.out.println("6. Branche");
			int champ = Integer.parseInt(clavier.nextLine());
			switch(champ) {
				case 1:
					System.out.println("Donner le nouveau Nom");
					String newNom = clavier.nextLine();
					etudiants.get(position).setNom(newNom);
					System.out.println("Modification faite avec succes");
					break;
				case 2:
					System.out.println("Donner le nouveau Prénom");
					String newPrenom = clavier.nextLine();
					etudiants.get(position).setPrenom(newPrenom);
					System.out.println("Modification faite avec succes");
					break;
				case 3:
					System.out.println("Donner le nouveau email");
					String newEmail = clavier.nextLine();
					etudiants.get(position).setEmail(newEmail);
					System.out.println("Modification faite avec succes");
					break;
				case 4:
					System.out.println("Donner le nouveau ID");
					int newID = Integer.parseInt(clavier.nextLine());
					etudiants.get(position).setId(newID);
					System.out.println("Modification faite avec succes");
					break;
				case 5:
					System.out.println("Donner le nouveau age");
					int newAge = Integer.parseInt(clavier.nextLine());
					etudiants.get(position).setAge(newAge);
					System.out.println("Modification faite avec succes");
					break;
				case 6:
					System.out.println("Donner le nouveau branche");
					String newBranche = clavier.nextLine();
					etudiants.get(position).setBranche(newBranche);
					System.out.println("Modification faite avec succes");
					break;

			}
		} else {
			System.out.println("La liste des étudiants est vide");
		}
		
	}

	public static void gestionLivre() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Qu'est ce que vous voulez faire?");
	    System.out.println("1.Ajouter un livre");
	    System.out.println("2.Supprimer un livre");
	    System.out.println("3.Modifier un livre");
	    int nbre = Integer.parseInt(clavier.nextLine());

	    switch(nbre) {
		    case 1:
			    ajouterLivre();
			    confirmation();
			break;
		    case 2:
		    	supprimerLivre();
			    confirmation();
			break;
		    case 3:
		    	modifierLivre();
			    confirmation();
			break;
	    }
	}
	
	public static void ajouterLivre() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("veuillez entrer le nom de l'auteur");
	    String auteurLivre = clavier.nextLine();
	    System.out.println("veuillez entrer le titre de livre");
	    String titreLivre = clavier.nextLine();
	    System.out.println("veuillez entrer le prix de livre ");
	    double prixLivre = Double.parseDouble(clavier.nextLine());
	    System.out.println("veuillez entrer l'id de livre ");
	    int idLivre = Integer.parseInt(clavier.nextLine());

	    Livre livre =  new Livre(auteurLivre,titreLivre,prixLivre,idLivre);
	    livres.add(livre);

	    System.out.println(livre.getTitre() + " ajouter avec succes");
	}
	
	public static void supprimerLivre() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous supprimer quelle livre? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (livres.size() > 0) {
			livres.remove(position);
			System.out.println("Livre dans la position "+ position +" a été supprimer avec success");
		} else {
			System.out.println("La liste des livres est vide");
		}
		
	}
	
	public static void modifierLivre() {
		Scanner clavier = new Scanner(System.in);
		int position = -1;
		System.out.println("Voulez-vous modifier quelle livre? (entrez la position):");
		position = Integer.parseInt(clavier.nextLine());
		
		if (livres.size() > 0) {
			System.out.println("Voulez-vous modifier quelle champ?");
			System.out.println("1. Auteur");
			System.out.println("2. Titre");
			System.out.println("3. Prix");
			System.out.println("4. ID");
			int champ = Integer.parseInt(clavier.nextLine());
			
			switch(champ) {
				case 1:
					System.out.println("Donner la nouvelle auteur");
					String newAuteur = clavier.nextLine();
					livres.get(position).setAuteur(newAuteur);
					System.out.println("Modification faite avec succes");
					break;
				case 2:
					System.out.println("Donner la nouvelle titre");
					String newTitre = clavier.nextLine();
					livres.get(position).setTitre(newTitre);
					System.out.println("Modification faite avec succes");
					break;
				case 3:
					System.out.println("Donner la nouvelle prix");
					Double newPrix = Double.parseDouble(clavier.nextLine());
					livres.get(position).setPrix(newPrix);
					System.out.println("Modification faite avec succes");
					break;
				case 4:
					System.out.println("Donner la nouvelle ID");
					int newID = Integer.parseInt(clavier.nextLine());
					livres.get(position).setId(newID);
					System.out.println("Modification faite avec succes");
					break;
			}
		} else {
			System.out.println("La liste des livres est vide");
		}
		
	}
	
	public static void main(String[]args) {    
	    afficherMenu();
	}

}
