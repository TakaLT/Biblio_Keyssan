package biblio_keyssan.DAO;

/***********************************************************************
 * Module:  ExemplairesDao.java
 * Author:  takalt
 * Purpose: Defines the Class ExemplairesDao
 ***********************************************************************/


import java.util.*;

import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;


public class ExemplairesDao {
<<<<<<< HEAD

 //  private HashMap<Integer, Exemplaire> exemplaireDB = new HashMap<Integer,Exemplaire>();  
   
   private ArrayList<Exemplaire> exemplaireDataBase = new ArrayList<Exemplaire>(); 
   
//====== Constructeur 

=======
   private HashMap<Integer, Exemplaire> exemplaireDB = new HashMap<Integer,Exemplaire>();  
   //private ArrayList<Exemplaire> exemplaireDB = new ArrayList<Exemplaire>();
//Constructeur 
>>>>>>> refs/remotes/origin/master
   public ExemplairesDao() {
<<<<<<< HEAD

	super();
	}
//====== Getteur et Setteur 
  /* public HashMap<Integer, Exemplaire> getExemplaireDB() {
=======
		super();
		}
//Getteur et Setteur 
   public HashMap<Integer,Exemplaire> getExemplaireDB() {
>>>>>>> refs/remotes/origin/master
		return exemplaireDB;
	}
<<<<<<< HEAD

  */ public ArrayList<Exemplaire> getExemplaireDB() {
	   return exemplaireDataBase;

=======

	public void setExemplaireDB(HashMap<Integer, Exemplaire> exemplaireDB) {
		this.exemplaireDB = exemplaireDB;
	}
   
	

//Methode
	
	
	public void createExemplaire(String dateAchat, String isbn ) {		
		
		Exemplaire emp= new Exemplaire( dateAchat, isbn) ;	
	}
	
	
	public void ajoutExemplaire(Exemplaire ex) {
	      
	     // exemplaireDB.add(ex);
		exemplaireDB.put(ex.getIdExemplaire(), ex);
	   }

   public Exemplaire findByKey(int id) {	
	  
	   return exemplaireDB.get(id);
	   
>>>>>>> refs/remotes/origin/master
   }

	/*public void setExemplaireDB(HashMap<Integer, Exemplaire> exemplaireDB) {
		this.exemplaireDB = exemplaireDB;
	}   */
  public void setExemplaireDB(ArrayList<Exemplaire> exemplaireDataBase) {
		this.exemplaireDataBase = exemplaireDataBase;
	}   

//===== Some other Methods
/*	public void ajoutExemplaire(Exemplaire ex) {
		//HashMap <KEY,Value>
		//ex.getIdExemplaire() = KEY
		//ex = Value	
		exemplaireDB.put(ex.getIdExemplaire(), ex);
	   }*/
  
	public void ajoutExemplaire(Exemplaire ex) {
	
		this.exemplaireDataBase.add(ex);
	}  
	
   public Exemplaire findByKey(int id) {	
	   
	   return exemplaireDataBase.get(id-1);
     }
   
   
   
}