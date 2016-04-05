package biblio_keyssan.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;
import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;

public class TestDeBase {

	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////////
		// Creation des exemplaires
		//
		
		Exemplaire ex1 = new Exemplaire("25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		Exemplaire ex2 = new Exemplaire("18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
		System.out.println(ex2.toString());
		Exemplaire ex3 = new Exemplaire("18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN003") ;
		System.out.println(ex3.toString());
		
		//============ Creation d'un Data base des Exemplaires (DAO)
		ExemplairesDao DAO1 = new ExemplairesDao();
		
		//============ Ajouter des exemplaires Dans la base DAO
		DAO1.ajoutExemplaire(ex1);
		DAO1.ajoutExemplaire(ex2);
		DAO1.ajoutExemplaire(ex3);
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////
		//Affchage DAO
		//
		System.out.println("Affichage de la DAO"+DAO1.getExemplaireDB());
		//Recherche d'un exemplaire par la key
		System.out.println("Recherche dans la Dao de la key 2: "+DAO1.findByKey(2));
		
		System.out.println();
		
		//============ Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Femme","pwd","psd","058956585");
		System.out.println(ad.toString());
		System.out.println();
		
		//=========== Creation d'un employ�

		Employe em = new Employe("NomEmploye","PrenomEmploye","25/05/1980", "Femme" ,"pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		System.out.println();
		
		//=========== Cr�ation d'un Data Base des Utilisateurs 
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();	
		
		//=========== Ajouter dans la Data base des Utilisateurs : adherent et employ�
		UtilisateurDao1.ajoutUtilisateur(ad);
		System.out.println(ad.getIdUtilisateur());
		System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
		UtilisateurDao1.ajoutUtilisateur(em);
		System.out.println(em.getIdUtilisateur());
		System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
		
		
		//======== Recherche d'un Adherent par son Id
		System.out.println();
		System.out.println(UtilisateurDao1.findByKey(1000));
		
		
		//======== Recherche d'un employ� par son Id
		System.out.println(UtilisateurDao1.findByKey(1002));	
		
		//======== Creation d'un emprunt en cours pour un adh�rent
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
	
		Date dtToday = new Date();
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , sdf.format(dtToday));
		ad.addEmpruntEnCours(emp1);
		ex1.setEmpruntEnCours(emp1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
		
		//System.out.println(ad.getEmpruntEnCours().toArray());
		//System.out.println(ad.getNbEmpruntsEnCours());
		//System.out.println(emp1.toString());
		System.out.println("===========================");
		//System.out.println(ex1.toString());
		
//		//======== Creation d'un deuxi�me emprunt en cours pour un adh�rent
//		
//		
//		dt.set(1990, 01, 26);
//		String[] tel1 = {"0161769890"};
//		Utilisateur ad2 = new Adherent("NomAdherent","PrenomAdherent",dt, "Homme",1003, tel1);
//		System.out.println(ad2.toString());
//		System.out.println();
//		
//		//======== Creation d'un emprunt en cours pour le deuxi�me adh�rent
//		
//		EmpruntEnCours emp2 = new EmpruntEnCours(ex2, ad2, dtToday);
//		ad2.addEmpruntEnCours(emp2);
//		ex2.setEmpruntEnCours(emp2);
//		ex2.setStatus(EnumStatusExemplaire.PRETE);
//		
//		//System.out.println(ad.getEmpruntEnCours().toArray());
//	
		
		//======= Cr�ation d'un emprunt en cours pour un employ�
		EmpruntEnCours emp3 = new EmpruntEnCours(ex3, em , sdf.format(dtToday));
		em.addEmpruntEnCours(emp3);
		ex3.setEmpruntEnCours(emp3);
		
		
//		for (Exemplaire exx  : DAO1.getExemplaireDB()) {
//		    System.out.println(exx);
//		System.out.println(ad.getEmpruntEnCours());
//		System.out.println(ad.getNbEmpruntsEnCours());
		
//		System.out.println(em.getEmpruntEnCours());
//		System.out.println(em.getNbEmpruntsEnCours());
		
	}
	
}