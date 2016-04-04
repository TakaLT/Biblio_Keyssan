/***********************************************************************
 * Module:  EmpruntArchive.java
 * Author:  takalt
 * Purpose: Defines the Class EmpruntArchive
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;


public class EmpruntArchive {
   
   private Date dateRestitutionEff;   
   private Date dateEmprunt;     
   private Utilisateur emprunteur;   
   private Exemplaire exemplaire;
   
// Constructeur
   public EmpruntArchive() {
      
   }

	public EmpruntArchive(Date dateRestitutionEff, Date dateEmprunt, Utilisateur emprunteur, Exemplaire exemplaire) {
		super();
		this.setDateRestitutionEff(dateRestitutionEff);
		this.setDateEmprunt(dateEmprunt);
		this.setEmprunteur(emprunteur);
		this.setExemplaire(exemplaire);
	}
//Getteur et Setteur
	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}
	
	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}
	
	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
//Override
@Override
	public String toString() {
		return "EmpruntArchive [getDateRestitutionEff()=" + getDateRestitutionEff() + ", getDateEmprunt()="
				+ getDateEmprunt() + ", getEmprunteur()=" + getEmprunteur() + ", getExemplaire()=" + getExemplaire() + "]";
	}
   

}