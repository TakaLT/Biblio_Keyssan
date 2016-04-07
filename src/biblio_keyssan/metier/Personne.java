package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Personne 
{
   private String nom;
   private String prenom;
   private Date dateNaissance;
   private String sexe;
   
   public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 //Constructeur 
 
   public Personne() {
    super();
   }
 
   public Personne(String nom, String prenom, String dateNaissance, String sexe) {
		super();
		this.setNom (nom);
		this.setPrenom (prenom);
		try {
			this.setDateNaissance(sdf.parse(dateNaissance));
		} catch (ParseException e) {
			e.printStackTrace();
		}
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
		return "Personne [Nom=" + getNom() + ",Prenom=" + getPrenom() + ", DateNaissance="
				+ sdf.format(getDateNaissance()) + ", Sexe=" + getSexe() + "]";
	}

}