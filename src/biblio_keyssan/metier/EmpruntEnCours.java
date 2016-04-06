package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntEnCours 
{
<<<<<<< HEAD
	private Date dateEmprunt;
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");	
	Date dtToday = new Date();
=======
   private Date dateEmprunt;
   private Exemplaire exemplaire;
   private Utilisateur emprunteur;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
>>>>>>> refs/remotes/origin/master
//Constructeur
<<<<<<< HEAD
=======
   
   public EmpruntEnCours() {
	   super();
   }
>>>>>>> refs/remotes/origin/master
   
<<<<<<< HEAD
   public EmpruntEnCours() {
	   super();    
   }   
   
   public EmpruntEnCours(Exemplaire ex)    {
	   this.setExemplaire(ex);
=======
   public EmpruntEnCours(Exemplaire ex)  {
	   	this.setExemplaire(ex);
>>>>>>> refs/remotes/origin/master
   }
<<<<<<< HEAD
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
 
=======
   
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
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
   
//Getteur et Setteur 
=======

//Getteur et Setteur
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
		return "EmpruntEnCours [Exemplaire=" + getExemplaire().getIdExemplaire()+ ", Emprunteur=" + getEmprunteur().getIdUtilisateur()+ ",DateEmprunt="+ sdf.format(getDateEmprunt()) + "]";
=======
		return "EmpruntEnCours [Exemplaire=" + getExemplaire().getIdExemplaire() + ", Emprunteur=" + getEmprunteur().getIdUtilisateur()+ ", DateEmprunt=" + sdf.format(getDateEmprunt()) +"]";
>>>>>>> refs/remotes/origin/master
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Fin!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		super.finalize();
	
	}

}