package biblio_keyssan.metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Utilisateur extends Personne 
{
   public int idUtilisateur;
   private String pwd;
   private String pseudonyme;
   private ArrayList<EmpruntEnCours>  empruntEnCours = new ArrayList<EmpruntEnCours>();
   

   
   
//Constructeur
   public Utilisateur()   {
    super(); 
   }  
   public Utilisateur(int idUtilisateur) {
	   super(); 
	   this.setIdUtilisateur(idUtilisateur);   		
	}
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe,int idUtilisateur) {
	   super(nom, prenom, dateNaissance, sexe); 
	   this.setIdUtilisateur(idUtilisateur); 
	}
   
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe) {
	   super(nom, prenom, dateNaissance, sexe); 
	  // this.idUtilisateur++;
	}
   
   public Utilisateur(String nom, String prenom, GregorianCalendar dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme, ArrayList<EmpruntEnCours> empruntEnCours) {
		this(nom, prenom, dateNaissance, sexe, idUtilisateur);
		this.setPwd (pwd);
		this.setPseudonyme(pseudonyme);
		this.setEmpruntEnCours(empruntEnCours);
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
		   for (int i = 0; i < empruntEnCours.size(); i++) {
			   if (empruntEnCours.equals(ep)) {
				index=i;
			}
			   
		}
		   this.empruntEnCours.remove(index);
		   //mise a null de l'exemplaire
		   //ep.getExemplaire().setEmpruntEnCours(null);
		   ep.setEmprunteur(null);
		   ep.setExemplaire(null);
		   //suppression de l'emprunt pour l'adherent
			
					  
		} 
	   
//Polymorphe
	   public Boolean isConditionsPretAcceptees() 
	   {
		/*if(getNbJoursRetards() >= 15) {
			try {
					throw new BiblioException("Un Exmeplaire a depassé la durée limite d'empreint!!");
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
				return false;
			}*/
				return true;
	}
		public int  getNbJoursRetards() 
	   {
		//====== date d'aujourd'hui
			//Adherent ad= this()
			//EmpruntEnCours emp = this.getEmpruntEnCours();
			
			GregorianCalendar dateA = new GregorianCalendar();
			
	//		System.out.println(sdf.format(dateA.getTime()));
			//Date dtToday = dateA.getTime();
			Date dtToday = new Date();
			EmpruntEnCours emp1 = new EmpruntEnCours();
			
	///		System.out.println(this.getEmpruntEnCours());
	//		System.out.println(this.getNbEmpruntsEnCours());
			
			//====== Retour de l'exemplaire
			GregorianCalendar dateR = new GregorianCalendar();
			dateR.set(2016, 03, 7);
			Date dateRetour = dateR.getTime();
	//		System.out.println(sdf.format(dateR.getTime()));
			
			//====== Calculer la diff�rence entre les deux dates emprunt� et retour
			long diff = dateRetour.getTime() - dtToday.getTime() ;
			
			//int diff2=;
			//===== Convertir de milliseconds � jours
			diff = diff / 1000 / 60 / 60 / 24 ;
	//		System.out.println(diff);		
			int diff2=Integer.parseInt(""+diff+"");
	    return  diff2;
	   }
	  
//Override
	   @Override
		public String toString() {
			return "Utilisateur ["+super.toString()+" getIdUtilisateur()=" + getIdUtilisateur() + ", getPwd()=" + getPwd() + ", getPseudonyme()="
					+ getPseudonyme() + ", getEmpruntEnCours()="+getEmpruntEnCours().toArray()+", getNbEmpruntsEnCours()=" + getNbEmpruntsEnCours() + "]";
		}
   
}