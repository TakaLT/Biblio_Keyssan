package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplaire 
{
   private int idExemplaire;
   private Date dateAchat;
   private EnumStatusExemplaire status;
   private String isbn;
   public EmpruntEnCours theEmpruntEnCours;
<<<<<<< HEAD
<<<<<<< HEAD
   public SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
   
   private static int noIUniqueEx=1;
=======
   
   public static int noId=1;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
>>>>>>> refs/remotes/origin/master
=======
   
   public static int noId=1;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
>>>>>>> refs/remotes/origin/master
//Constructeur
   public Exemplaire() {
<<<<<<< HEAD
<<<<<<< HEAD
	   super();
   }
=======
		   super();
	   }
>>>>>>> refs/remotes/origin/master
=======
		   super();
	   }
>>>>>>> refs/remotes/origin/master
   public Exemplaire(String dateAchat, String isbn) {
		super();
<<<<<<< HEAD
<<<<<<< HEAD
		this.setIdExemplaire(noIUniqueEx++);		
=======
=======
		this.setIdExemplaire(noId++);
		try {
			this.setDateAchat(sdf.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status.DISPONIBLE);
		this.setIsbn (isbn);
		
	}
   public Exemplaire(String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
>>>>>>> refs/remotes/origin/master
		this.setIdExemplaire(noId++);
		try {
			this.setDateAchat(sdf.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
		this.setStatus(status.DISPONIBLE);
		this.setIsbn (isbn);
		
	}
   public Exemplaire(String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire(noId++);
>>>>>>> refs/remotes/origin/master
		try {
			this.setDateAchat(sdf1.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status.DISPONIBLE);
		this.setIsbn ( isbn);
=======
		this.setStatus(status);
		this.setIsbn (isbn);
>>>>>>> refs/remotes/origin/master
		
	}
<<<<<<< HEAD
   public Exemplaire(String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire(idExemplaire++);		
		try {
			this.setDateAchat(sdf1.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
=======

//Getteur et Setteur
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
		this.setStatus(status);
		this.setIsbn (isbn);
		
	}

//Getteur et Setteur
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/master
=======
>>>>>>> refs/remotes/origin/master
	public int getIdExemplaire() {
		return idExemplaire;
	}
	
	public void setIdExemplaire(int idExemplaire) {
<<<<<<< HEAD
<<<<<<< HEAD
		this.idExemplaire = idExemplaire;
=======
		this.idExemplaire= idExemplaire;
>>>>>>> refs/remotes/origin/master
=======
		this.idExemplaire= idExemplaire;
>>>>>>> refs/remotes/origin/master
	}
	
	public Date getDateAchat() {
		return dateAchat;
	}
	
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	
	public EnumStatusExemplaire getStatus() {
		return status;
	}
	
	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public EmpruntEnCours getTheEmpruntEnCours() {
		return theEmpruntEnCours;
	}
	
<<<<<<< HEAD
	public void setEmpruntEnCours(EmpruntEnCours EmpruntEnCours) {
		this.theEmpruntEnCours = EmpruntEnCours;
=======
	public void setTheEmpruntEnCours(EmpruntEnCours theEmpruntEnCours) {
		this.theEmpruntEnCours = theEmpruntEnCours;
		this.setStatus(EnumStatusExemplaire.PRETE);
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
=======
>>>>>>> refs/remotes/origin/master
	}
//Override
@Override
	public String toString() {
<<<<<<< HEAD
<<<<<<< HEAD
		return "Exemplaire [IdExemplaire=" + getIdExemplaire() + ", DateAchat="+sdf1.format(getDateAchat()) +", Status=" + getStatus() + ", Isbn=" + getIsbn() +  ", EmpruntEnCours=" + getTheEmpruntEnCours() + "]";
=======
		return "Exemplaire [IdExemplaire=" + getIdExemplaire() + ", DateAchat=" +sdf.format(getDateAchat())
				+ ", Status=" + getStatus() + ", Isbn=" + getIsbn() + ", EmpruntEnCours=" + getTheEmpruntEnCours()+ "]";
>>>>>>> refs/remotes/origin/master
=======
		return "Exemplaire [IdExemplaire=" + getIdExemplaire() + ", DateAchat=" +sdf.format(getDateAchat())
				+ ", Status=" + getStatus() + ", Isbn=" + getIsbn() + ", EmpruntEnCours=" + getTheEmpruntEnCours()+ "]";
>>>>>>> refs/remotes/origin/master
	}

}