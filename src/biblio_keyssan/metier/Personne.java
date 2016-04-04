//Source file: D:\\Biblio\\biblio\\metier\\Personne.java

package biblio_keyssan.metier;

import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.GregorianCalendar;

public class Personne 
{
   private String nom;
   private String prenom;
   private GregorianCalendar dateNaissance;
   private String sexe;
   
   public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 //Constructeur 
 
   public Personne() {
    super();
   }
 
   public Personne(String nom, String prenom, GregorianCalendar dateNaissance, String sexe) {
		super();
		this.setNom (nom);
		this.setPrenom (prenom);
		this.setDateNaissance(dateNaissance);
		this.setSexe(sexe);
	}
//Getteur et setteur	
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
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(GregorianCalendar dateNaissance2) {
		this.dateNaissance = dateNaissance2;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
//Override
	@Override
	public String toString() {
		return "Personne [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getDateNaissance()="
				+ sdf.format(getDateNaissance().getTime()) + ", getSexe()=" + getSexe() + "]";
	}

}
