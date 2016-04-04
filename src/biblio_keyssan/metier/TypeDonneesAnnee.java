/***********************************************************************
 * Module:  TypeDonneesAnnee.java
 * Author:  takalt
 * Purpose: Defines the Class TypeDonneesAnnee
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;


public class TypeDonneesAnnee {
	private int anneeParution;
	
//Constructeur
	public TypeDonneesAnnee(int i) {
		this.setAnneeParution(i);
	}

	public int getAnneeParution() {
		return this.anneeParution;
	}

	public void setAnneeParution(int anneeParution) {
		if (anneeParution > 0)
			this.anneeParution = anneeParution;
				
	}

	@Override
	public String toString() {
		return ""+this.getAnneeParution()+"" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.getAnneeParution();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeDonneesAnnee tDA = (TypeDonneesAnnee) obj;
		if (this.getAnneeParution() != tDA.getAnneeParution())
			return false;
		return true;
	}
   
   

}