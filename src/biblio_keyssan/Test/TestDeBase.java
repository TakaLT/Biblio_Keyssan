package biblio_keyssan.Test;

import java.text.Format;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

public class TestDeBase {

	public static void main(String[] args) {
		// Creation d'exemplaire
		Exemplaire ex1 = new Exemplaire(1, "25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		Exemplaire ex2 = new Exemplaire(2, "18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
		System.out.println(ex2.toString());
		Exemplaire ex3 = new Exemplaire(3, "18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN003") ;
		System.out.println(ex3.toString());
		
		//Creation DAO
		ExemplairesDao DAO1 = new ExemplairesDao();
		
		//Dans la base DAO
		DAO1.ajoutExemplaire(ex1);
		DAO1.ajoutExemplaire(ex2);
		DAO1.ajoutExemplaire(ex3);

		//Affchage DAO
		System.out.println("Affichage de la DAO"+DAO1.getExemplaireDB());
		//Recherche d'un exemplaire par la key
		System.out.println("Recherche dans la Dao de la key 2: "+DAO1.findByKey(2));
		
		
		//Creation d'un Adherent
		GregorianCalendar dt = new GregorianCalendar();
		dt.set(2000, 05, 20);
		String[]tel ={"0245986570"};
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent",dt, "Feminin", 1,tel);
		System.out.println(ad.toString());
		//Creation d'un employé
		GregorianCalendar dte = new GregorianCalendar();
		dte.set(1980,02, 15);
		Employe em = new Employe("NomEmploye","PrenomEmploye",dte, "Feminin", 1,"matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		//Recherche d'un Adherent par son Id
		
		
		//Recherche d'un employé par son Id
		
		//Creation d'un emprunt en cours pour un adhérent
		
		//Création d'un emprunt en cours pour un employé
		
	}

}
