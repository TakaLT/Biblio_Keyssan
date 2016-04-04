//Source file: D:\\Biblio\\biblio\\metier\\Adherent.java

package biblio_keyssan.metier;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Adherent extends Utilisateur 
{
   private String[] telephone;
   private static Integer nbMaxPrets = 3;
   private static Integer dureeMaxPrets = 15;
   
   
   //Constructeur
   /**
    */
   public Adherent() {
	   super();
    
   }
   public Adherent(String[] telephone) {
		super();
		this.telephone = telephone;
	}
   public Adherent(String nom, String prenom, GregorianCalendar dateNaissance, String sexe, Integer idUtilisateur,String[] telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur);
		this.telephone = telephone;
	}
   
//Getteur et Setteur   
   
   
   public String[] getTelephone() {
		return telephone;
	}
	public void setTelephone(String[] telephone) {
		this.telephone = telephone;
	}
	public static Integer getNbMaxPrets() {
		return nbMaxPrets;
	}
	public static void setNbMaxPrets(Integer nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}
	public static Integer getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	public static void setDureeMaxPrets(Integer dureeMaxPrets) {
		Adherent.dureeMaxPrets = dureeMaxPrets;
	}

   /**
    * @return Boolean
    */
   public Boolean isConditionsPretAcceptees() 
   {
    return null;
   }
   
   /**
    * @return Integer
    */
   public Integer getNbRetards() 
   {
    return null;
   }
//Override
	@Override
	public String toString() {
		return "Adherent ["+super.toString()+"Telephone=" + Arrays.toString(getTelephone()) + ", isConditionsPretAcceptees="
				+ isConditionsPretAcceptees() + ", NbRetards=" + getNbRetards() + ", EmpruntEnCours="
				+ Arrays.toString(getEmpruntEnCours()) + ", NbEmpruntsEnCours=" + getNbEmpruntsEnCours() + "]";
	}
   
}
