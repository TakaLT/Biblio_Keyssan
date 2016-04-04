//Source file: D:\\Biblio\\biblio\\metier\\Exemplaire.java

package biblio_keyssan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplaire 
{
   private Integer idExemplaire;
   private Date dateAchat;
   private EnumStatusExemplaire status;
   private String isbn;
   private Livre livre;
   public EmpruntEnCours theEmpruntEnCours;
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//Constructeur
   /**
    * @roseuid 5241490A0167
    */
   public Exemplaire() {
    
   }
   public Exemplaire(Integer idExemplaire,String dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.setIdExemplaire( idExemplaire);		
		try {
			this.setDateAchat(sdf.parse(dateAchat));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.setStatus(status);
		this.setIsbn ( isbn);
		
	}

	public Exemplaire(Integer idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn, Livre livre, EmpruntEnCours theEmpruntEnCours) {
		super();
		this.setIdExemplaire( idExemplaire);
		this.setDateAchat(dateAchat);
		this.setStatus(status);
		this.setIsbn ( isbn);
		this.setLivre(livre);
		this.setTheEmpruntEnCours(theEmpruntEnCours);
	}
//Getteur et Setteur

	public Integer getIdExemplaire() {
		return idExemplaire;
	}
	
	public void setIdExemplaire(Integer idExemplaire) {
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
	
	public void setTheEmpruntEnCours(EmpruntEnCours theEmpruntEnCours) {
		this.theEmpruntEnCours = theEmpruntEnCours;
	}
//Override
@Override
	public String toString() {
		return "Exemplaire [getIdExemplaire()=" + getIdExemplaire() + ", getDateAchat()=" +sdf.format(getDateAchat())
				+ ", getStatus()=" + getStatus() + ", getIsbn()=" + getIsbn() + ", getLivre()=" + getLivre()
				+ ", getTheEmpruntEnCours()=" + getTheEmpruntEnCours() + "]";
	}

}
