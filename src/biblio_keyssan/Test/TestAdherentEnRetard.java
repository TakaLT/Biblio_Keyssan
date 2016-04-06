package biblio_keyssan.Test;

<<<<<<< HEAD
<<<<<<< HEAD
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

=======
import java.text.SimpleDateFormat;
import java.util.Date;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
>>>>>>> refs/remotes/origin/master
=======
import java.text.SimpleDateFormat;
import java.util.Date;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
>>>>>>> refs/remotes/origin/master

public class TestAdherentEnRetard {
	
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
		//////////////////////////////////////////////////////////////////////////
		//============ Creation d'un Data base des Exemplaires (DAO)
		ExemplairesDao DAO1 = new ExemplairesDao();
		//System.out.println("Recherche dans la Dao de la key 1 : "+DAO1.findByKey(1));
		
		
		// ============ Creation de la Dao exemplaire
		Exemplaire ex1 = new Exemplaire("25/05/2015","ISBN001") ;
		System.out.println(ex1.toString());
		//ajout  de l'exemplaire
		DAO1.ajoutExemplaire(ex1);
		//Recherche de l'exemplaire
		System.out.println("Recherche dans la Dao de la key 1 : "+DAO1.findByKey(1));
		System.out.println();
		
		
		Exemplaire ex2 = new Exemplaire("18/03/2012","ISBN002") ;
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		//Recherche de l'exemplaire
		System.out.println("Recherche dans la Dao de la key 2 : "+DAO1.findByKey(2));		
		System.out.println();
		
		//=========== Cr�ation d'un Data Base des Utilisateurs 
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
		//System.out.println(UtilisateurDao1.findByKey(1001));
		
		//============ Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Femme","pwd","psd","058956585");
		System.out.println(ad.toString());
		System.out.println();
		UtilisateurDao1.ajoutUtilisateur(ad);
		System.out.println("Recherche de l'adherent avec id 1000 : "+UtilisateurDao1.findByKey(1000));
		System.out.println();
		
		//======== Creation d'un emprunt en cours pour un adh�rent
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad ,"22/03/2016");
		System.out.println(emp1);
		//System.out.println(ad.isConditionsPretAcceptees());
		//System.out.println(ad.getNbExemplaireRetards());
		
		//======= Ajout de l'emprunt a l'adherent
		ad.addEmpruntEnCours(emp1);
		ex1.setEmpruntEnCours(emp1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);

		//======== Creation d'un emprunt en cours pour un adh�rent

/*		EmpruntEnCours emp2 = new EmpruntEnCours(ex2, ad);
		ad.addEmpruntEnCours(emp2);
		ex2.setEmpruntEnCours(emp2);
		ex2.setStatus(EnumStatusExemplaire.PRETE);*/

=======
		
		//Creation de la base DAO Exemplaires
		ExemplairesDao DAO1 = new ExemplairesDao();
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		
		// Creation d'exemplaire
		Exemplaire ex1 = new Exemplaire( "25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		DAO1.ajoutExemplaire(ex1);
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		
		//Deuxieme exemplaire
		Exemplaire ex2 = new Exemplaire( "18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		System.out.println("Recherche dans la exemplaireDao de la key 2: "+DAO1.findByKey(2));
		
		/*Exemplaire ex3 = new Exemplaire( "18/01/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN003") ;
		System.out.println(ex3.toString());
		DAO1.ajoutExemplaire(ex3);
		System.out.println("Recherche dans la Dao de la key 3: "+DAO1.findByKey(3));*/
				
		//Creation de la base Utilisateurs
		UtilisateursDao DAO2 =new UtilisateursDao();
		System.out.println("Recherche dans la UtilisateurDao de la key 1: "+DAO2.findByKey(1000));
				
		//Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","09/05/2000", "Feminin","pwd","pseudo","0245986570");
		System.out.println(ad.toString());
		DAO2.ajoutUtilisateur(ad);
		System.out.println("Recherche dans la UtilisateurDao de la key 1: "+DAO2.findByKey(1000));
		
		//Creation d'un employé
		Employe em = new Employe("NomEmploye","PrenomEmploye","15/03/1980", "Feminin","pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		DAO2.ajoutUtilisateur(em);
		System.out.println("Recherche dans la utilisateurDao de la key 2: "+DAO2.findByKey(1001));
				
		//Emprunt d'un exemplaire a la date du jour
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dtToDay = new Date();
		//Premier Emprunt pour un adherent
		EmpruntEnCours emC1 = new EmpruntEnCours(ex1,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC1);
		//ajout d'un emprunt a un exemplaire changement de status
		ex1.setTheEmpruntEnCours(emC1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
		System.out.println(ad.toString());
		
		EmpruntEnCours emC2 = new EmpruntEnCours(ex2,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC2);
		//ajout d'un emprunt a un exemplaire changement de status
		ex2.setTheEmpruntEnCours(emC2);
		ex2.setStatus(EnumStatusExemplaire.PRETE);
		System.out.println(ad.toString());
		
		
				
				
>>>>>>> refs/remotes/origin/master
=======
		
		//Creation de la base DAO Exemplaires
		ExemplairesDao DAO1 = new ExemplairesDao();
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		
		// Creation d'exemplaire
		Exemplaire ex1 = new Exemplaire( "25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		DAO1.ajoutExemplaire(ex1);
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		
		//Deuxieme exemplaire
		Exemplaire ex2 = new Exemplaire( "18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		System.out.println("Recherche dans la exemplaireDao de la key 2: "+DAO1.findByKey(2));
		
		/*Exemplaire ex3 = new Exemplaire( "18/01/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN003") ;
		System.out.println(ex3.toString());
		DAO1.ajoutExemplaire(ex3);
		System.out.println("Recherche dans la Dao de la key 3: "+DAO1.findByKey(3));*/
				
		//Creation de la base Utilisateurs
		UtilisateursDao DAO2 =new UtilisateursDao();
		System.out.println("Recherche dans la UtilisateurDao de la key 1: "+DAO2.findByKey(1000));
				
		//Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","09/05/2000", "Feminin","pwd","pseudo","0245986570");
		System.out.println(ad.toString());
		DAO2.ajoutUtilisateur(ad);
		System.out.println("Recherche dans la UtilisateurDao de la key 1: "+DAO2.findByKey(1000));
		
		//Creation d'un employé
		Employe em = new Employe("NomEmploye","PrenomEmploye","15/03/1980", "Feminin","pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		DAO2.ajoutUtilisateur(em);
		System.out.println("Recherche dans la utilisateurDao de la key 2: "+DAO2.findByKey(1001));
				
		//Emprunt d'un exemplaire a la date du jour
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dtToDay = new Date();
		//Premier Emprunt pour un adherent
		EmpruntEnCours emC1 = new EmpruntEnCours(ex1,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC1);
		//ajout d'un emprunt a un exemplaire changement de status
		ex1.setTheEmpruntEnCours(emC1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
		System.out.println(ad.toString());
		
		EmpruntEnCours emC2 = new EmpruntEnCours(ex2,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC2);
		//ajout d'un emprunt a un exemplaire changement de status
		ex2.setTheEmpruntEnCours(emC2);
		ex2.setStatus(EnumStatusExemplaire.PRETE);
		System.out.println(ad.toString());
		
		
				
				
>>>>>>> refs/remotes/origin/master

	}

}
