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
		//HashMap <KEY,Value>
		//ex.getIdExemplaire() = KEY
		//ex = Value	      
	      exemplaireDB.put(ex.getIdExemplaire(), ex);
	   }

   public Exemplaire findByKey(Integer id) {	   
	   return exemplaireDB.get(id);
   }
   
   
}