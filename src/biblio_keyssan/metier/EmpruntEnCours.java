package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntEnCours 
{
	private Date dateEmprunt;
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");	
	Date dtToday = new Date();
//Constructeur
   
   public EmpruntEnCours() {
	   super();    
   }   
   
   public EmpruntEnCours(Exemplaire ex)    {
	   this.setExemplaire(ex);
   }
  public EmpruntEnCours(Exemplaire exemplaire, Utilisateur emprunteur) {
		this(exemplaire);
		this.setEmprunteur(emprunteur);
		this.setDateEmprunt(dtToday);
	} 
  public EmpruntEnCours(Exemplaire exemplaire, Utilisateur emprunteur, String dateA) {
		this(exemplaire,emprunteur );
		try {
			this.setDateEmprunt(sdf.parse(dateA));
		} catch (ParseException e) {
			e.printStackTrace();
		}		
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
		return "EmpruntEnCours [Exemplaire=" + getExemplaire().getIdExemplaire()+ ", Emprunteur=" + getEmprunteur().getIdUtilisateur()+ ",DateEmprunt="+ sdf.format(getDateEmprunt()) + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Fin!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.finalize();
	}

}