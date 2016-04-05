/***********************************************************************
 * Module:  EmpruntArchive.java
 * Author:  takalt
 * Purpose: Defines the Class EmpruntArchive
 ***********************************************************************/

package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class EmpruntArchive {
   
   private Date dateRestitutionEff;   
   private Date dateEmprunt;     
   private Utilisateur emprunteur;   
   private Exemplaire exemplaire;
   
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
   
// Constructeur
   public EmpruntArchive() {
      
   }

	public EmpruntArchive(String dateRestitutionEff, String dateEmprunt, Utilisateur emprunteur, Exemplaire exemplaire) {
		super();
		try {
		this.setDateRestitutionEff(sdf.parse(dateRestitutionEff));
		this.setDateEmprunt(sdf.parse(dateEmprunt));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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