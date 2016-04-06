package biblio_keyssan.DAO;

import java.util.ArrayList;

import biblio_keyssan.metier.EmpruntArchive;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

public class EmpruntArchiveDao {
	 private ArrayList<EmpruntArchive> empruntArchiveDataBase = new ArrayList<EmpruntArchive>(); 
	 
	 //Constructeur	 
	  public EmpruntArchiveDao() {
		super();
	}

	public EmpruntArchiveDao(ArrayList<EmpruntArchive> empruntArchiveDataBase) {
		super();
		this.empruntArchiveDataBase = empruntArchiveDataBase;
	}
	 
	//Getteur et Setteur
	public ArrayList<EmpruntArchive> getEmpruntArchiveDataBase() {
		return empruntArchiveDataBase;
	}

	public void setEmpruntArchiveDataBase(
			ArrayList<EmpruntArchive> empruntArchiveDataBase) {
		this.empruntArchiveDataBase = empruntArchiveDataBase;
	}
	
	//Methode 
	public void ajoutEmpruntArchive(EmpruntArchive ea) {			
			this.empruntArchiveDataBase.add(ea);
		}  
 

	public EmpruntArchive findByKey(int id) {	   
		   return empruntArchiveDataBase.get(id);
	   }

}
