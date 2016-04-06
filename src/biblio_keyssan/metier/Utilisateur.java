package biblio_keyssan.metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public abstract class  Utilisateur extends Personne 
{
   public  int idUtilisateur;
   private String pwd;
   private String pseudonyme;
   private ArrayList<EmpruntEnCours>  empruntEnCours = new ArrayList<EmpruntEnCours>();
   
   private static int noIdUniqueUt=1000;
//Constructeur
   public Utilisateur()   {
	   super(); 
   }  
   public Utilisateur(String nom, String prenom, String dateNaissance, String sexe, String pwd, String pseudonyme ) {
	   super(nom, prenom, dateNaissance, sexe); 
	   this.setIdUtilisateur(noIdUniqueUt++); 
	   this.setPwd (pwd);
	   this.setPseudonyme(pseudonyme);
	   
	}
 
//Getteur et Setteur      
   public int getIdUtilisateur() {
	return idUtilisateur;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	 
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPseudonyme() {
		return pseudonyme;
	}
	
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}	
	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
		
	}
	
//Methode
	public int getNbEmpruntsEnCours() {
		return this.empruntEnCours.size();
	}

	public void addEmpruntEnCours(EmpruntEnCours ep) {
		  this.empruntEnCours.add(ep);
	}  
	   
	public void removeEmpruntEnCours(EmpruntEnCours ep) {
	   int index = 0;
	  //reccuperation de l'exemplaire dans la list pour le supprimer
	   for (int i = 0; i < empruntEnCours.size(); i++) {
		   if (empruntEnCours.equals(ep)) {
				index=i;
			}
			   
		}
		   this.empruntEnCours.remove(index);
		
		  ep.setEmprunteur(null);
		  ep.setExemplaire(null);	
		  ep=null;
	}
	
	
	   
//Polymorphe
	   public Boolean isConditionsPretAcceptees()  {
			return true;
	   }
		
	  /* public int  getNbJoursRetards()  {
		//====== date d'aujourd'hui		
			Date dtToday = new Date();
	
		//====== Retour de l'exemplaire a une date 
			GregorianCalendar dateR = new GregorianCalendar();
			dateR.set(2016, 03, 7);
			Date dateRetour = dateR.getTime();

			
			//====== Calculer la diff�rence entre les deux dates emprunt� et retour
			long diff = dateRetour.getTime() - dtToday.getTime() ;

			//===== Convertir de milliseconds à jours
			diff = diff / 1000 / 60 / 60 / 24 ;
	
			int differ=Integer.parseInt(""+diff+"");
			
	    return  differ;
	   }*/
	  
//Override
	   @Override
		public String toString() {
			return "Utilisateur ["+super.toString()+" IdUtilisateur=" + getIdUtilisateur() + ", Password=" + getPwd() + ", Pseudonyme="
					+ getPseudonyme() + "]";
		}
   
}