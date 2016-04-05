//Source file: D:\\Biblio\\biblio\\metier\\Exemplaire.java

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
   
   private static int noId=1;
   public SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//Constructeur
   public Exemplaire() {
		   super();
	   }
   public Exemplaire(String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire(noId++);
		try {
			this.setDateAchat(sdf.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status);
		this.setIsbn (isbn);
		
	}

//Getteur et Setteur

	public int getIdExemplaire() {
		return idExemplaire;
	}
	
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire= idExemplaire;
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
	
	public void setTheEmpruntEnCours(EmpruntEnCours theEmpruntEnCours) {
		this.theEmpruntEnCours = theEmpruntEnCours;
		this.setStatus(EnumStatusExemplaire.PRETE);
	}
//Override
@Override
	public String toString() {
		return "Exemplaire [IdExemplaire=" + getIdExemplaire() + ", DateAchat=" +sdf.format(getDateAchat())
				+ ", Status=" + getStatus() + ", Isbn=" + getIsbn() + ", EmpruntEnCours=" + getTheEmpruntEnCours()+ "]";
	}

}
