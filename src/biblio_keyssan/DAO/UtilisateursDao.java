package biblio_keyssan.DAO;

import java.util.HashMap;

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