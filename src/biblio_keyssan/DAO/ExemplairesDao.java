package biblio_keyssan.DAO;

import java.util.*;
import biblio_keyssan.metier.Exemplaire;


public class ExemplairesDao {
 //  private HashMap<Integer, Exemplaire> exemplaireDB = new HashMap<Integer,Exemplaire>();  
   
   private ArrayList<Exemplaire> exemplaireDataBase = new ArrayList<Exemplaire>(); 
   
//====== Constructeur 
   public ExemplairesDao() {
	super();
	}
//====== Getteur et Setteur 
  /* public HashMap<Integer, Exemplaire> getExemplaireDB() {
		return exemplaireDB;
	}
  */ public ArrayList<Exemplaire> getExemplaireDB() {
	   return exemplaireDataBase;
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