package biblio_keyssan.metier;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Adherent extends Utilisateur 
{
   private String[] telephone = new String [1];
   private static int  nbMaxPrets = 3;
   private static int dureeMaxPrets = 15;
   
   
 //Constructeur

   public Adherent() {
	   super();
    
   }
   public Adherent(String[] telephone) {
		super();
		this.telephone = telephone;
	}

   public Adherent(String nom, String prenom, String dateNaissance, String sexe, String pwd, String pseudonyme , String telephone) {
		super(nom, prenom, dateNaissance, sexe ,pwd, pseudonyme );
		this.setTelephone( telephone);
	}
   
//Getteur et Setteur      
   public String[] getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone[0]=telephone;
	}
	public static int getNbMaxPrets() {
		return nbMaxPrets;
	}
	public static void setNbMaxPrets(int nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}
	public static int getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	public static void setDureeMaxPrets(int dureeMaxPrets) {
		Adherent.dureeMaxPrets = dureeMaxPrets;
	}
	
	
//Some other Methods	
   public Boolean isConditionsPretAcceptees() {
	   if(super.getEmpruntEnCours().size() >= getNbMaxPrets()){
			try {
				throw new BiblioException("Le nombre Max d'emprunt est attteint!!!");
			} catch (BiblioException e) {				
				e.printStackTrace();
			}
			return false;
		}else if (getNbExemplaireRetards() >= 1) {
			try {
				throw new BiblioException("Un Exmeplaire a depassé la durée limite d'emprunt!!");
			} catch (BiblioException e) {				
				e.printStackTrace();
			}
			return false;
		}
			return true;
}
	public int  getNbExemplaireRetards() {	
		
		int nBExemplaireRetard=0;
		Date dateToDay = new Date();
		//Control pour chaque exemplaire la date
		
		for (EmpruntEnCours emp : super.getEmpruntEnCours()) {	
					
			//====== Calculer la diff�rence entre les deux dates emprunt� et retour
			long diff = dateToDay.getTime() - emp.getDateEmprunt().getTime() ;
			
			//===== Convertir de milliseconds � jours
			diff = diff / 1000 / 60 / 60 / 24 ;
			//	System.out.println(diff);		
			int 	differ =Integer.parseInt(""+diff+"");
				
			
			if (differ >= getDureeMaxPrets()) {
					nBExemplaireRetard++;
				}
			}
			
		return nBExemplaireRetard;

   }
	
	public void addEmpruntEnCours(EmpruntEnCours ep) {
		boolean bo;
		bo = this.isConditionsPretAcceptees();
		if (bo==true) {
			super.addEmpruntEnCours(ep);
			
		} else {
			
			try {
				throw new BiblioException();
			} catch (BiblioException e) {
				e.printStackTrace();
			}
		}
	  
	}  
	
	
//Override
	@Override
	public String toString() {
			return "Adherent ["+super.toString()+"telephone=" + Arrays.toString(telephone) + "]";
	}

	
   
}