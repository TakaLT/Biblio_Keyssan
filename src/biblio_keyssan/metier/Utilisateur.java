//Source file: D:\\Biblio\\biblio\\metier\\Utilisateur.java

package biblio_keyssan.metier;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilisateur extends Personne 
{
   private Integer idUtilisateur;
   private String pwd;
   private String pseudonyme;
   private EmpruntEnCours empruntEnCours[];
   
//Constructeur
   public Utilisateur() 
   {
    
   }
   public Utilisateur(Integer idUtilisateur) {
	   	super();
		
	}
   
   
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe,Integer idUtilisateur) {
	super(nom, prenom, dateNaissance, sexe);
	this.setIdUtilisateur(idUtilisateur);
}
public Utilisateur(Integer idUtilisateur, String pwd, String pseudonyme, EmpruntEnCours[] empruntEnCours) {
		super();
		this.setIdUtilisateur(idUtilisateur);
		this.setPwd (pwd);
		this.setPseudonyme(pseudonyme);
		this.setEmpruntEnCours(empruntEnCours);
	}
//Getteur et Setteur  
  
   
   public Integer getIdUtilisateur() {
	return idUtilisateur;
	}
	
	public void setIdUtilisateur(Integer idUtilisateur) {
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
	
	/**
	* @return biblio.metier.EmpruntEnCours[ ]
	*/
	public EmpruntEnCours[ ] getEmpruntEnCours() {
		return empruntEnCours;
	}	
	public void setEmpruntEnCours(EmpruntEnCours[] empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}
	
//Methode
	/**
	* @return Integer
	*/
	public Integer getNbEmpruntsEnCours() {
		return null;
	}
	 /**
	    * @param ep
	    * @return Void
	    */
	   public void addEmpruntEnCours(EmpruntEnCours ep) {
		   
	   }  
	  
//Override
	   @Override
		public String toString() {
			return "Utilisateur ["+super.toString()+" getIdUtilisateur()=" + getIdUtilisateur() + ", getPwd()=" + getPwd() + ", getPseudonyme()="
					+ getPseudonyme() + ", getEmpruntEnCours()=" + Arrays.toString(getEmpruntEnCours())
					+ ", getNbEmpruntsEnCours()=" + getNbEmpruntsEnCours() + "]";
		}
   
}
