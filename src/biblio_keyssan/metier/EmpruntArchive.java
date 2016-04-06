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
   

   
   private SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
   
   private Date dtrestitution = new Date(); 


// Constructeur
   public EmpruntArchive() {
      
   }
   public EmpruntArchive(EmpruntEnCours em) {
		super();
		this.setDateRestitutionEff(dtrestitution);
		this.setDateEmprunt(em.getDateEmprunt());
		this.setEmprunteur(em.getEmprunteur());
		this.setExemplaire(em.getExemplaire());
	}
   public EmpruntArchive( Date dateEmprunt, Utilisateur emprunteur, Exemplaire exemplaire) {
		super();
		this.setDateRestitutionEff(dtrestitution);
		this.setDateEmprunt(dateEmprunt);
		this.setEmprunteur(emprunteur);
		this.setExemplaire(exemplaire);
	}

	public EmpruntArchive(String dateRestitutionEff, String dateEmprunt, Utilisateur emprunteur, Exemplaire exemplaire) {
		super();
		try {
		this.setDateRestitutionEff(sdf1.parse(dateRestitutionEff));
		this.setDateEmprunt(sdf1.parse(dateEmprunt));
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
		return "EmpruntArchive [DateRestitution=" + sdf1.format(getDateRestitutionEff()) + ", DateEmprunt="
				+ sdf1.format(getDateEmprunt()) + ", tEmprunteur=" + getEmprunteur().getIdUtilisateur() + ", Exemplaire=" + getExemplaire().getIdExemplaire() + "]";
	}
   

}