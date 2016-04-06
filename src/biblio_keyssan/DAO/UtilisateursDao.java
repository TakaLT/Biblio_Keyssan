package biblio_keyssan.DAO;

/***********************************************************************
 * Module:  UtilisateursDao.java
 * Author:  takalt
 * Purpose: Defines the Class UtilisateursDao
 ***********************************************************************/



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
	   public HashMap<Integer, Utilisateur> getutilisateurDB() {
			return utilisateurDB;
		}

		public void setutilisateurDB(HashMap<Integer, Utilisateur> utilisateurDB) {
			this.utilisateurDB = utilisateurDB;
		}

		public void ajoutUtilisateur(Utilisateur ut) {
			utilisateurDB.put(ut.idUtilisateur, ut);
			
		}
	   public Utilisateur findByKey(Integer id) {

	      
		   return utilisateurDB.get(id);
	   }

}