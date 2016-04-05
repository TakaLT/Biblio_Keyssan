package biblio_keyssan.metier;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Adherent extends Utilisateur 
{
   private String[] telephone;
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

   public Adherent(String nom, String prenom, GregorianCalendar dateNaissance, String sexe ,int idUtilisateur, String[] telephone) {
		super(nom, prenom, dateNaissance, sexe,idUtilisateur);
		this.telephone = telephone;
	}
   
//Getteur et Setteur      
   public String[] getTelephone() {
		return telephone;
	}
	public void setTelephone(String[] telephone) {
		this.telephone = telephone;
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
	
   public Boolean isConditionsPretAcceptees() 
   {
	if(super.getEmpruntEnCours().size() > getNbMaxPrets() ){
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
	public int  getNbJoursRetards() 
   {
	//====== date d'aujourd'hui
		//Adherent ad= this()
		//EmpruntEnCours emp = this.getEmpruntEnCours();
		
		GregorianCalendar dateA = new GregorianCalendar();
		
		System.out.println(sdf.format(dateA.getTime()));
		//Date dtToday = dateA.getTime();
		Date dtToday = new Date();
		EmpruntEnCours emp1 = new EmpruntEnCours();
		
		System.out.println(this.getEmpruntEnCours());
		System.out.println(this.getNbEmpruntsEnCours());
		
		//====== Retour de l'exemplaire
		GregorianCalendar dateR = new GregorianCalendar();
		dateR.set(2016, 03, 7);
		Date dateRetour = dateR.getTime();
		System.out.println(sdf.format(dateR.getTime()));
		
		//====== Calculer la diff�rence entre les deux dates emprunt� et retour
		long diff = dateRetour.getTime() - dtToday.getTime() ;
		
		//int diff2=;
		//===== Convertir de milliseconds � jours
		diff = diff / 1000 / 60 / 60 / 24 ;
		System.out.println(diff);		
		int diff2=Integer.parseInt(""+diff+"");
    return  diff2;
   }
//Override
	@Override
	public String toString() {
		return "Adherent ["+super.toString()+"telephone=" + Arrays.toString(telephone) + ", isConditionsPretAcceptees()="
				+ isConditionsPretAcceptees() + ", getNbjoursRetards()="
				+ getNbJoursRetards() + "]";
	}

	
   
}