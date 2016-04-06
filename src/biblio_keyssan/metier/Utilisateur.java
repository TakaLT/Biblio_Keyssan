package biblio_keyssan.metier;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
=======
>>>>>>> refs/remotes/origin/master
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public abstract class  Utilisateur extends Personne 
{
<<<<<<< HEAD
   public  int idUtilisateur;
=======
   private  int idUtilisateur;
>>>>>>> refs/remotes/origin/master
   private String pwd;
   private String pseudonyme;
<<<<<<< HEAD
   private ArrayList<EmpruntEnCours>  empruntEnCours = new ArrayList<EmpruntEnCours>();
=======
   private ArrayList<EmpruntEnCours> empruntEnCours = new ArrayList<EmpruntEnCours>();
>>>>>>> refs/remotes/origin/master
   
<<<<<<< HEAD
   private static int noIdUniqueUt=1000;
=======
   private static int noIdu=1000;
>>>>>>> refs/remotes/origin/master
//Constructeur
<<<<<<< HEAD
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
=======
   public Utilisateur() {
	   super();
   }
   public Utilisateur(String nom, String prenom, String dateNaissance, String sexe,String pwd, String pseudo) {
		super(nom, prenom, dateNaissance, sexe);
		this.setIdUtilisateur(noIdu++);
		this.setPwd (pwd);
		this.setPseudonyme(pseudo);
	}

//Getteur et Setteur     
   public int getIdUtilisateur() {
	return idUtilisateur;
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
	
=======

>>>>>>> refs/remotes/origin/master
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}	
	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
		
	}
	
//Methode
<<<<<<< HEAD
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
	   ///////////////////////////////////////////////////////en prevision de prochaine demande
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

=======
		public int getNbEmpruntsEnCours() {
			return this.getEmpruntEnCours().size();
		}
	
		public void addEmpruntEnCours(EmpruntEnCours ep) {
			  this.empruntEnCours.add(ep);
		}
	   
//Polymorphe
	  
		
	   public int  getNbJoursRetards()  {
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
	   }
>>>>>>> refs/remotes/origin/master
	  
//Override
	   @Override
		public String toString() {
<<<<<<< HEAD
			return "Utilisateur ["+super.toString()+" IdUtilisateur=" + getIdUtilisateur() + ", Password=" + getPwd() + ", Pseudonyme="
					+ getPseudonyme() + "]";
=======
			return "Utilisateur ["+super.toString()+" IdUtilisateur=" + getIdUtilisateur() + ", Pwd=" + getPwd() + ", Pseudonyme="
					+ getPseudonyme() + ", NbEmpruntsEnCours=" + getNbEmpruntsEnCours() + "]";
>>>>>>> refs/remotes/origin/master
		}
   
}