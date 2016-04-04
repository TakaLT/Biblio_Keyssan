/***********************************************************************
 * Module:  Theme.java
 * Author:  takalt
 * Purpose: Defines the Class Theme
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;


public class Theme {
   
   private String code;  
   private String libelle;   
   private Theme themeParent;   
 //Constructeur  
   public Theme() {
      
   }
	public Theme(String code, String libelle, Theme themeParent) {
		super();
		this.setCode(code);
		this.setLibelle(libelle);
		this.setThemeParent(themeParent);
	}
//Getteur et Setteur
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Theme getThemeParent() {
		return themeParent;
	}
	public void setThemeParent(Theme themeParent) {
		this.themeParent = themeParent;
	}
//Override
	@Override
	public String toString() {
		return "Theme [getCode()=" + getCode() + ", getLibelle()=" + getLibelle() + ", getThemeParent()="
				+ getThemeParent() + "]";
	}
	

}