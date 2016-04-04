//Source file: D:\\Biblio\\biblio\\metier\\EmpruntEnCours.java

package biblio_keyssan.metier;

import java.util.Date;

public class EmpruntEnCours 
{
   private Date dateEmprunt;
   private Exemplaire exemplaire;
   private Utilisateur emprunteur;
//Constructeur
   /**
    * @roseuid 5241490A01C5
    */
   public EmpruntEnCours() 
   {
    
   }
   
   /**
    * @param ex
    * @roseuid 4CE01EEB035B
    */
   public EmpruntEnCours(Exemplaire ex)    {
	   this.setExemplaire(ex);
   }
   
   /**
    * @param ex
    * @param d
    * @roseuid 4CE0090902CE
    */
   public EmpruntEnCours(Exemplaire ex, Date d) {
	   this(ex);
	   this.setDateEmprunt(d);
   }
   
	public EmpruntEnCours(Date dateEmprunt, Exemplaire exemplaire, Utilisateur emprunteur) {
		this(exemplaire, dateEmprunt);
		this.emprunteur = emprunteur;
	}

//Getteur et Setteur
   
   /**
    * @param d
    * @return Void
    * @roseuid 4CA4A51A038A
    */
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
		return "EmpruntEnCours [getExemplaire()=" + getExemplaire() + ", getEmprunteur()=" + getEmprunteur()
				+ ", getDateEmprunt()=" + getDateEmprunt() + "]";
	}
}
