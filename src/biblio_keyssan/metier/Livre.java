/***********************************************************************
 * Module:  Livre.java
 * Author:  takalt
 * Purpose: Defines the Class Livre
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;

/** Catalogue de livres
 * 
 * @pdOid b95846ab-8622-4814-93b0-ab5e240f93bc */
public class Livre {
   
   private String isbn;   
   private String titre;   
   private TypeDonneesAnnee anneeParution;   
   private Integer nbPages;   
   private Auteur[] auteur;   
   private Editeur editeur;   
   private Theme theme;
   
//Constructeur
   public Livre() {
      
   }

	public Livre(String isbn, String titre, TypeDonneesAnnee anneeParution, Integer nbPages, Auteur[] auteur,Editeur editeur, Theme theme) {
		super();
		this.setIsbn(isbn);
		this.setTitre(titre);
		this.setAnneeParution(anneeParution);
		this.setNbPages(nbPages);
		this.setAuteur(auteur);
		this.setEditeur(editeur);
		this.setTheme(theme);
	}
	//Getteur et Setteur
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public TypeDonneesAnnee getAnneeParution() {
		return anneeParution;
	}
	
	public void setAnneeParution(TypeDonneesAnnee anneeParution) {
		this.anneeParution = anneeParution;
	}
	
	public Integer getNbPages() {
		return nbPages;
	}
	
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	
	public Auteur[] getAuteur() {
		return auteur;
	}
	
	public void setAuteur(Auteur[] auteur) {
		this.auteur = auteur;
	}
	
	public Editeur getEditeur() {
		return editeur;
	}
	
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	
	public Theme getTheme() {
		return theme;
	}
	
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	//Override
	@Override
	public String toString() {
		return "Livre [isbn=" + getIsbn() + ", titre=" + getTitre() + ", anneeParution=" + getAnneeParution() + ", nbPages=" + getNbPages()	+ ", auteur=" + Arrays.toString(getAuteur()) + ", editeur=" + getEditeur() + ", theme=" + getTheme() + "]";
	}


//Methode
	

   

}