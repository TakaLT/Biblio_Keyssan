/***********************************************************************
 * Module:  UtilisateursDao.java
 * Author:  takalt
 * Purpose: Defines the Class UtilisateursDao
 ***********************************************************************/

package biblio_keyssan.DAO;

import java.util.*;

import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;


public class UtilisateursDao {
   //   private static Utilisateur[] utilisateurDB;
	private HashMap<Integer, Utilisateur> utilisateurDB = new HashMap<Integer,Utilisateur>();  
	   
	//Constructeur 
	   public UtilisateursDao() {
		super();
		}
	   
	//Getteur et Setteur 
	   public HashMap<Integer, Utilisateur> getExemplaireDB() {
			return utilisateurDB;
		}

		public void setExemplaireDB(HashMap<Integer, Utilisateur> utilisateurDB) {
			this.utilisateurDB = utilisateurDB;
		}
   
	   /** @param id
	    * @pdOid 28336ecf-41de-43d9-a567-62dd74929ba8 */
	   public Utilisateur findByKey(Integer id) {
	      
		   return utilisateurDB.get(id);
	   }

}