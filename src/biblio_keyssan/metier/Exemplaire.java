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
   public SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
   
   private static int noIUniqueEx=1;
//Constructeur
   public Exemplaire() {
	   super();
   }
   public Exemplaire(String dateAchat, String isbn) {
		super();
		this.setIdExemplaire(noIUniqueEx++);		
		try {
			this.setDateAchat(sdf1.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status.DISPONIBLE);
		this.setIsbn ( isbn);
		
	}
   public Exemplaire(String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire(idExemplaire++);		
		try {
			this.setDateAchat(sdf1.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		this.setStatus(status);
		this.setIsbn ( isbn);
		
	}

//Getteur et Setteur
	public int getIdExemplaire() {
		return idExemplaire;
	}
	
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
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
	
	public void setEmpruntEnCours(EmpruntEnCours EmpruntEnCours) {
		this.theEmpruntEnCours = EmpruntEnCours;
	}
//Override
@Override
	public String toString() {
		return "Exemplaire [IdExemplaire=" + getIdExemplaire() + ", DateAchat="+sdf1.format(getDateAchat()) +", Status=" + getStatus() + ", Isbn=" + getIsbn() +  ", EmpruntEnCours=" + getTheEmpruntEnCours() + "]";
	}

}