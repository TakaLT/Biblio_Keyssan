//Source file: D:\\Biblio\\biblio\\metier\\EmpruntEnCours.java

package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntEnCours 
{
   private Date dateEmprunt;
   private Exemplaire exemplaire;
   private Utilisateur emprunteur;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//Constructeur
   
   public EmpruntEnCours() {
	   super();
   }
   
   public EmpruntEnCours(Exemplaire ex)  {
	   	this.setExemplaire(ex);
   }
   
   public EmpruntEnCours(Exemplaire ex, String date) {
	   this(ex);
	   try {
		this.setDateEmprunt(sdf.parse(date));
	} catch (ParseException e) {
		e.printStackTrace();
	}
   }
   
	public EmpruntEnCours(Exemplaire exemplaire,String dateEmprunt,  Utilisateur emprunteur) {
		this(exemplaire, dateEmprunt);
		this.emprunteur = emprunteur;
	}

//Getteur et Setteur
   public void setDateEmprunt(Date d) {
	   this.dateEmprunt = d;
   }

	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}
	
	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
//Override
	@Override
	public String toString() {
		return "EmpruntEnCours [Exemplaire=" + getExemplaire().getIdExemplaire() + ", Emprunteur=" + getEmprunteur().getIdUtilisateur()+ ", DateEmprunt=" + sdf.format(getDateEmprunt()) +"]";
	}
}
