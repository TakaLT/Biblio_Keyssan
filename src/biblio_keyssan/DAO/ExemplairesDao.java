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
   
//Constructeur 
   public ExemplairesDao() {
	super();
	}
//Getteur et Setteur 
   public HashMap<Integer, Exemplaire> getExemplaireDB() {
		return exemplaireDB;
	}

	public void setExemplaireDB(HashMap<Integer, Exemplaire> exemplaireDB) {
		this.exemplaireDB = exemplaireDB;
	}
   
	

//Methode
	public void ajoutExemplaire(Exemplaire ex) {
	      
	      exemplaireDB.put(ex.getIdExemplaire(), ex);
	   }

	/** @param id
    * @pdOid 57c46119-a2af-4dd2-8b89-5ae68518f33c */
   public Exemplaire findByKey(Integer id) {	   
	   return exemplaireDB.get(id);
   }
   
   
}