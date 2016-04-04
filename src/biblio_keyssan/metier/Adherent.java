//Source file: D:\\Biblio\\biblio\\metier\\Adherent.java

package biblio_keyssan.metier;

import java.util.Arrays;
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
	   if(super.getEmpruntEnCours().size() >= getNbMaxPrets()){
			try {
				throw new BiblioException("Le nombre d'emprunt est attteint!!!");
			} catch (BiblioException e) {
				
				e.printStackTrace();
			}
			return false;
		}
			return true;
   }
    public Integer getNbRetards() 
   {
    return null;
   }
//Override
	@Override
	public String toString() {
		return "Adherent ["+super.toString()+"telephone=" + Arrays.toString(telephone) + ", isConditionsPretAcceptees()="
				+ isConditionsPretAcceptees() + ", getNbRetards()="
				+ getNbRetards() + "]";
	}

	
   
}
