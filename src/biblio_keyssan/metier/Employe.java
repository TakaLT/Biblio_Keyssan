//Source file: D:\\Biblio\\biblio\\metier\\Employe.java

package biblio_keyssan.metier;

import java.util.GregorianCalendar;

public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
//Constructeur
   /**
    * @roseuid 5241490A002F
    */
   public Employe() 
   {
    
   }
   
	public Employe(String nom, String prenom, GregorianCalendar dateNaissance, String sexe, Integer idUtilisateur,String codeMatricule, EnumCategorieEmploye categorieEmploye) {
	super(nom, prenom, dateNaissance, sexe, idUtilisateur);
	this.setCodeMatricule(codeMatricule);
	this.setCategorieEmploye(categorieEmploye);
}

	public Employe(String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super();
		this.setCodeMatricule(codeMatricule);
		this.setCategorieEmploye(categorieEmploye);
	}
//Getteur et Setteur
	public String getCodeMatricule() {
		return codeMatricule;
	}
	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}
	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}
	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}
//Override
	@Override
	public String toString() {
		return "Employe ["+super.toString()+"getCodeMatricule()=" + getCodeMatricule() + ", getCategorieEmploye()=" + getCategorieEmploye()
				+ "]";
	}
	

}
