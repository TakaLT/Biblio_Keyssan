package biblio_keyssan.metier;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Adherent extends Utilisateur 
{
<<<<<<< HEAD

   private String[] telephone = new String [1];
   private static int  nbMaxPrets = 3;

   private static int dureeMaxPrets = 15;
 //Constructeur

=======
   private String[] telephone = new String[1];
   private static int nbMaxPrets = 3;
   private static int dureeMaxPrets = 15;
   
   
   //Constructeur
>>>>>>> refs/remotes/origin/master
   public Adherent() {
	   super();
    
   }
   public Adherent(String[] telephone) {
		super();
		this.telephone = telephone;
	}
<<<<<<< HEAD

   public Adherent(String nom, String prenom, String dateNaissance, String sexe, String pwd, String pseudonyme , String telephone) {
		super(nom, prenom, dateNaissance, sexe ,pwd, pseudonyme );
		this.setTelephone( telephone);

=======
   public Adherent(String nom, String prenom, String dateNaissance, String sexe, String pwd,String pseudo,String telephone) {
		super(nom, prenom, dateNaissance, sexe,pwd, pseudo);
		this.setTelephone(telephone);
>>>>>>> refs/remotes/origin/master
	}
   
//Getteur et Setteur      
   public String[] getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
<<<<<<< HEAD

		this.telephone[0]=telephone;

=======
		this.telephone[0] = telephone;
>>>>>>> refs/remotes/origin/master
	}
	public static int getNbMaxPrets() {
		return nbMaxPrets;
	}
	public static void setNbMaxPrets(int nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}
<<<<<<< HEAD

	public static int getDureeMaxPrets() {

=======
	public static  int getDureeMaxPrets() {
>>>>>>> refs/remotes/origin/master
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

<<<<<<< HEAD

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
	

=======
//Methode
	public Boolean isConditionsPretAcceptees() {
		if(super.getNbEmpruntsEnCours() > getNbMaxPrets() ){
			try {
				throw new BiblioException("Le nombre Max d'emprunt est attteint!!!");
			} catch (BiblioException e) {				
				e.printStackTrace();
			}
			return false;
		}else if (getNbJoursRetards() >=  getDureeMaxPrets()) {
			try {
				throw new BiblioException("Un Exmeplaire a depassé la durée limite d'empreint!!");
			} catch (BiblioException e) {				
				e.printStackTrace();
			}
			return false;
		}
			return true;
	}
		public int  getNbRetards() {
			
			Date dtToday = new Date();
					
			//====== Retour de l'exemplaire
			GregorianCalendar dateR = new GregorianCalendar();
			dateR.set(2016, 03,30);
			Date dateRetour = dateR.getTime();
					
			//====== Calculer la diff�rence entre les deux dates emprunt� et retour
			long diff = dateRetour.getTime() - dtToday.getTime() ;
			
			//===== Convertir de milliseconds � jours
			diff = diff / 1000 / 60 / 60 / 24 ;
			//	System.out.println(diff);		
				int diff2=Integer.parseInt(""+diff+"");
			
			return  diff2;
	   }
   
		 

>>>>>>> refs/remotes/origin/master
//Override
	@Override
	public String toString() {
<<<<<<< HEAD

			return "Adherent ["+super.toString()+"telephone=" + Arrays.toString(telephone) + "]";

=======
		return "Adherent ["+super.toString()+"Telephone=" + Arrays.toString(getTelephone()) + ", NbRetards=" + getNbRetards() + "]";
>>>>>>> refs/remotes/origin/master
	}

	
   
}