package biblio_keyssan.metier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntEnCours 
{
   private Date dateEmprunt;
   private Exemplaire exemplaire;
   private Utilisateur emprunteur;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//Constructeur
   
   public EmpruntEnCours()   {
    
   }
   
   
   public EmpruntEnCours(Exemplaire ex)    {
	   this.setExemplaire(ex);
   }
   public EmpruntEnCours(Exemplaire exemplaire, Utilisateur emprunteur, Date dateA) {
		this(exemplaire);
		this.dateEmprunt=dateA;
		this.emprunteur = emprunteur;
	}
   
	public EmpruntEnCours(Exemplaire exemplaire, Utilisateur emprunteur) {
		this(exemplaire);
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
		return "EmpruntEnCours [getExemplaire()=" + getExemplaire().hashCode() + ", getEmprunteur()=" + getEmprunteur().hashCode()
				+ ", getDateEmprunt()=" + sdf.format(getDateEmprunt()) + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Fin!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.finalize();
	}

}