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
   private Livre livre;
   public EmpruntEnCours theEmpruntEnCours;
   public SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
//Constructeur

   public Exemplaire() {
    
   }
   public Exemplaire(int idExemplaire,String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire( idExemplaire);		
		try {
			this.setDateAchat(sdf1.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status);
		this.setIsbn ( isbn);
		
	}

	public Exemplaire(int idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn, Livre livre, EmpruntEnCours theEmpruntEnCours) {
		super();
		this.setIdExemplaire( idExemplaire);
		this.setDateAchat(dateAchat);
		this.setStatus(status);
		this.setIsbn ( isbn);
		this.setLivre(livre);
		this.setEmpruntEnCours(theEmpruntEnCours);
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
	
	public Livre getLivre() {
		return livre;
	}
	
	public void setLivre(Livre livre) {
		this.livre = livre;
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
		return "Exemplaire [getIdExemplaire()=" + getIdExemplaire() + ", getDateAchat()="/*+sdf1.format(getDateAchat())*/ +", getStatus()=" + getStatus() + ", getIsbn()=" + getIsbn() + ", getLivre()=" + getLivre()
				+ ", getTheEmpruntEnCours()=" + getTheEmpruntEnCours() + "]";
	}

}