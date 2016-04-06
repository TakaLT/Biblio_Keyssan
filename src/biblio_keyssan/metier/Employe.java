package biblio_keyssan.metier;

public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
//Constructeur

   public Employe() {
    super();

   }
   

   
	public Employe(String nom, String prenom, String dateNaissance, String sexe , String pwd, String pseudonyme ,String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe ,pwd, pseudonyme );

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
			return "Employe ["+super.toString()+"CodeMatricule()=" + getCodeMatricule() + ", CategorieEmploye()=" + getCategorieEmploye()+ "]";

	}
	

}