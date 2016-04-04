package biblio_keyssan.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

public class TestDeBase {

	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////////
		//Creation d'un BDD
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
		System.out.println();
		/////////////////////////////////////////////////////////////////////////
		//Affchage DAO
		System.out.println("Affichage de la DAO"+DAO1.getExemplaireDB());
		//Recherche d'un exemplaire par la key
		System.out.println("Recherche dans la Dao de la key 2: "+DAO1.findByKey(2));
		
		System.out.println();
		
		//Creation d'un Adherent
		GregorianCalendar dt = new GregorianCalendar();
		dt.set(2000, 05, 20);
		String[]tel ={"0245986570"};
		Utilisateur ad = new Adherent("NomAdherent","PrenomAdherent",dt, "Feminin",1000, tel);
		System.out.println(ad.toString());
		System.out.println();
		//Creation d'un employé
		
		GregorianCalendar dte = new GregorianCalendar();
		dte.set(1980,02, 15);
		Utilisateur em = new Employe("NomEmploye","PrenomEmploye",dte, "Feminin" ,1002,"matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		System.out.println();
		//Création d'un Adherent par son Id
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();	
		
		//Introduit dans la base de Utilisateur adherent et employé
		UtilisateurDao1.ajoutUtilisateur(ad);
		System.out.println(ad.getIdUtilisateur());
		System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
		UtilisateurDao1.ajoutUtilisateur(em);
		System.out.println(em.getIdUtilisateur());
		System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
		
		
		//Recherche d'un Adherent par son Id
		System.out.println();
		System.out.println(UtilisateurDao1.findByKey(1000));
		
		
		//Recherche d'un employé par son Id
		System.out.println(UtilisateurDao1.findByKey(1002));	
		
		//Creation d'un emprunt en cours pour un adhérent
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar dateA = new GregorianCalendar();
		
		System.out.println(sdf.format(dateA.getTime()));
		Date dtToday = dateA.getTime();
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , dtToday);
		ad.addEmpruntEnCours(emp1);
		
		System.out.println(ad.getEmpruntEnCours());
		System.out.println(ad.getNbEmpruntsEnCours());
		
		//Création d'un emprunt en cours pour un employé
		EmpruntEnCours emp2 = new EmpruntEnCours(ex2, em , dtToday);
		em.addEmpruntEnCours(emp2);
		
		System.out.println(em.getEmpruntEnCours());
		System.out.println(em.getNbEmpruntsEnCours());
		
	}

}
