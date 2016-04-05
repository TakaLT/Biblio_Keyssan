package biblio_keyssan.metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilisateur extends Personne 
{
   public int idUtilisateur;
   private String pwd;
   private String pseudonyme;
   private ArrayList<EmpruntEnCours>  empruntEnCours = new ArrayList<EmpruntEnCours>();
   

   
   
//Constructeur
   public Utilisateur()   {
    super(); 
   }  
   public Utilisateur(int idUtilisateur) {
	   super(); 
	   this.setIdUtilisateur(idUtilisateur);   		
	}
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe,int idUtilisateur) {
	   super(nom, prenom, dateNaissance, sexe); 
	   this.setIdUtilisateur(idUtilisateur); 
	}
   
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe) {
	   super(nom, prenom, dateNaissance, sexe); 
	  // this.idUtilisateur++;
	}
   
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme, ArrayList<EmpruntEnCours> empruntEnCours) {
		this(nom, prenom, dateNaissance, sexe, idUtilisateur);
		this.setPwd (pwd);
		this.setPseudonyme(pseudonyme);
		this.setEmpruntEnCours(empruntEnCours);
	}
//Getteur et Setteur  
  
    
   public int getIdUtilisateur() {
	return idUtilisateur;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	 
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPseudonyme() {
		return pseudonyme;
	}
	
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}	
	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}
	
//Methode

	public int getNbEmpruntsEnCours() {
		return this.empruntEnCours.size();
	}

	   public void addEmpruntEnCours(EmpruntEnCours ep) {
		  this.empruntEnCours.add(ep);
	   }  
	  
//Override
	   @Override
		public String toString() {
			return "Utilisateur ["+super.toString()+" getIdUtilisateur()=" + getIdUtilisateur() + ", getPwd()=" + getPwd() + ", getPseudonyme()="
					+ getPseudonyme() + ", getEmpruntEnCours()="+getEmpruntEnCours().toArray()+", getNbEmpruntsEnCours()=" + getNbEmpruntsEnCours() + "]";
		}
   
}