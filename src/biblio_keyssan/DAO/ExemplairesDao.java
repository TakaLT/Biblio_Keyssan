/***********************************************************************
 * Module:  ExemplairesDao.java
 * Author:  takalt
 * Purpose: Defines the Class ExemplairesDao
 ***********************************************************************/

package biblio_keyssan.DAO;

import java.util.*;
import biblio_keyssan.metier.Exemplaire;


public class ExemplairesDao {
   private HashMap<Integer, Exemplaire> exemplaireDB = new HashMap<Integer,Exemplaire>();  
   //private ArrayList<Exemplaire> exemplaireDB = new ArrayList<Exemplaire>();
//Constructeur 
   public ExemplairesDao() {
		super();
		}
//Getteur et Setteur 
   public HashMap<Integer,Exemplaire> getExemplaireDB() {
		return exemplaireDB;
	}

	public void setExemplaireDB(HashMap<Integer, Exemplaire> exemplaireDB) {
		this.exemplaireDB = exemplaireDB;
	}
   
	

//Methode
	public void ajoutExemplaire(Exemplaire ex) {
	      
	     // exemplaireDB.add(ex);
		exemplaireDB.put(ex.getIdExemplaire(), ex);
	   }

   public Exemplaire findByKey(int id) {	
	  /* Exemplaire findEx = null;
	   for (Exemplaire exemplaire : exemplaireDB) {
		if(exemplaire.getIdExemplaire()==id )
			findEx = exemplaire;
			
	   }
	   return findEx;*/
	   return exemplaireDB.get(id);
	   
   }
   
   
}