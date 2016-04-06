package biblio_keyssan.metier;

public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
//Constructeur
<<<<<<< HEAD

   public Employe() {
    super();

=======

   public Employe() {
	   super();
>>>>>>> refs/remotes/origin/master
   }
   
<<<<<<< HEAD

   
	public Employe(String nom, String prenom, String dateNaissance, String sexe , String pwd, String pseudonyme ,String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe ,pwd, pseudonyme );

=======
	public Employe(String nom, String prenom, String dateNaissance, String sexe,String pwd, String pseudo, String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe,pwd,pseudo);
>>>>>>> refs/remotes/origin/master
		this.setCodeMatricule(codeMatricule);
		this.setCategorieEmploye(categorieEmploye);
<<<<<<< HEAD

	}

	

=======
	}	
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
			return "Employe ["+super.toString()+"CodeMatricule()=" + getCodeMatricule() + ", CategorieEmploye()=" + getCategorieEmploye()+ "]";

=======
		return "Employe ["+super.toString()+"CodeMatricule=" + getCodeMatricule() + ", CategorieEmploye=" + getCategorieEmploye()+ "]";
>>>>>>> refs/remotes/origin/master
	}
	

}