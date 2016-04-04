/***********************************************************************
 * Module:  Editeur.java
 * Author:  takalt
 * Purpose: Defines the Class Editeur
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;


public class Editeur {   
   private String nomEditeur;   
   private String ville;
   
//Constructeur
   public Editeur() {
      
   }
   
	public Editeur(String nomEditeur, String ville) {
		super();
		this.setNomEditeur(nomEditeur);
		this.setVille(ville);
	}

//Getteur et Setteur
	public String getNomEditeur() {
		return nomEditeur;
	}
	
	
	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}
	
	
	public String getVille() {
		return ville;
	}
	
	
	public void setVille(String ville) {
		this.ville = ville;
	}	
	   
//Override
	@Override
	public String toString() {
		return "Editeur [getNomEditeur()=" + getNomEditeur() + ", getVille()=" + getVille() + "]";
	}
	
}