package biblio_keyssan.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

<<<<<<< HEAD
//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


=======
import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
=======
>>>>>>> refs/remotes/origin/master
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
=======
		
			
		//Creation de la base DAO Exemplaires
		ExemplairesDao DAO1 = new ExemplairesDao();		
		//Appel de la methode find 
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
				
		// Creation d'un exemplaire
		Exemplaire ex1 = new Exemplaire( "25/05/2015", "ISBN001") ;
		System.out.println(ex1.toString());
>>>>>>> refs/remotes/origin/master
=======
		
			
		//Creation de la base DAO Exemplaires
		ExemplairesDao DAO1 = new ExemplairesDao();		
		//Appel de la methode find 
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
				
		// Creation d'un exemplaire
		Exemplaire ex1 = new Exemplaire( "25/05/2015", "ISBN001") ;
		System.out.println(ex1.toString());
>>>>>>> refs/remotes/origin/master
		DAO1.ajoutExemplaire(ex1);
<<<<<<< HEAD
<<<<<<< HEAD
		//Recherche de l'exemplaire
		System.out.println("Recherche dans la Dao de la key 1 : "+DAO1.findByKey(1));
		System.out.println();
		
		Exemplaire ex2 = new Exemplaire("18/03/2012","ISBN002") ;
		
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		//Recherche de l'exemplaire
		System.out.println("Recherche dans la Dao de la key 2 : "+DAO1.findByKey(2));
			
		System.out.println();
=======
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
=======
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
<<<<<<< HEAD
<<<<<<< HEAD
		//=========== Cr�ation d'un Data Base des Utilisateurs 
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
		//System.out.println(UtilisateurDao1.findByKey(1001));
=======
		//Creation de'un deuxieme exemplaire
		Exemplaire ex2 = new Exemplaire( "18/03/2012","ISBN002") ;
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		System.out.println("Recherche dans la exemplaireDao de la key 2: "+DAO1.findByKey(2));
=======
		//Creation de'un deuxieme exemplaire
		Exemplaire ex2 = new Exemplaire( "18/03/2012","ISBN002") ;
		System.out.println(ex2.toString());
		DAO1.ajoutExemplaire(ex2);
		System.out.println("Recherche dans la exemplaireDao de la key 2: "+DAO1.findByKey(2));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Creation de la base Utilisateurs
		UtilisateursDao DAO2 =new UtilisateursDao();		
		System.out.println("Recherche dans la UtilisateurDao de la key 1000: "+DAO2.findByKey(1000));
>>>>>>> refs/remotes/origin/master
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Creation de la base Utilisateurs
		UtilisateursDao DAO2 =new UtilisateursDao();		
		System.out.println("Recherche dans la UtilisateurDao de la key 1000: "+DAO2.findByKey(1000));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
<<<<<<< HEAD
		//============ Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Femme","pwd","psd","058956585");
		System.out.println(ad.toString());		
		UtilisateurDao1.ajoutUtilisateur(ad);
		System.out.println("Recherche de l'adherent avec id 1000 : "+UtilisateurDao1.findByKey(1000));
		System.out.println();
		
		//=========== Creation d'un employ�
		Employe em = new Employe("NomEmploye","PrenomEmploye","25/05/1980", "Femme" ,"pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
=======
		//Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","09/05/2000", "Feminin","pwd","pseudo","0245986570");
		System.out.println(ad.toString());
		DAO2.ajoutUtilisateur(ad);
		System.out.println("Recherche dans la UtilisateurDao de la key 1000: "+DAO2.findByKey(1000));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Creation d'un employé
		Employe em = new Employe("NomEmploye","PrenomEmploye","15/03/1980", "Feminin","pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
=======
>>>>>>> refs/remotes/origin/master
		System.out.println(em.toString());
<<<<<<< HEAD
<<<<<<< HEAD
		
		UtilisateurDao1.ajoutUtilisateur(em);
		System.out.println("Recherche de l'employé avec id 1001 : "+UtilisateurDao1.findByKey(1001));
		System.out.println();


=======
		DAO2.ajoutUtilisateur(em);
		System.out.println("Recherche dans la utilisateurDao de la key 1001: "+DAO2.findByKey(1001));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
		//Creation d'un emprunt en cours
		//Emprunt d'un exemplaire à la date du jour
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dtToDay = new Date();
		//Premier Emprunt pour un adherent
		EmpruntEnCours emC1 = new EmpruntEnCours(ex1,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC1);
		//ajout d'un emprunt a un exemplaire changement de status
		ex1.setTheEmpruntEnCours(emC1);
		System.out.println(ad.toString());
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
<<<<<<< HEAD
		//======== Creation d'un emprunt en cours pour un adh�rent

		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad );
		ad.addEmpruntEnCours(emp1);
		ex1.setEmpruntEnCours(emp1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
=======
		//Deuxieme emprunt pour un employé
		EmpruntEnCours emC2 = new EmpruntEnCours(ex2,sdf.format(dtToDay),em);
		//ajout d'un emprunt en cours a un adherent
		em.addEmpruntEnCours(emC2);
		//ajout d'un emprunt a un exemplaire
		ex2.setTheEmpruntEnCours(emC2);
		System.out.println(em.toString());
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
<<<<<<< HEAD
		
		System.out.println("===========================");
=======
		DAO2.ajoutUtilisateur(em);
		System.out.println("Recherche dans la utilisateurDao de la key 1001: "+DAO2.findByKey(1001));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
		//Creation d'un emprunt en cours
		//Emprunt d'un exemplaire à la date du jour
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dtToDay = new Date();
		//Premier Emprunt pour un adherent
		EmpruntEnCours emC1 = new EmpruntEnCours(ex1,sdf.format(dtToDay),ad);
		//ajout d'un emprunt en cours a un adherent
		ad.addEmpruntEnCours(emC1);
		//ajout d'un emprunt a un exemplaire changement de status
		ex1.setTheEmpruntEnCours(emC1);
		System.out.println(ad.toString());
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
<<<<<<< HEAD
	
=======
		//Deuxieme emprunt pour un employé
		EmpruntEnCours emC2 = new EmpruntEnCours(ex2,sdf.format(dtToDay),em);
		//ajout d'un emprunt en cours a un adherent
		em.addEmpruntEnCours(emC2);
		//ajout d'un emprunt a un exemplaire
		ex2.setTheEmpruntEnCours(emC2);
		System.out.println(em.toString());
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
>>>>>>> refs/remotes/origin/master
		
<<<<<<< HEAD

		
		//======= Affichage des emprunt en cours
		System.out.println(emp1);
		System.out.println(emp2);
		
		//===========Affichage emprunt par personne
		System.out.println("Nombre d'emprunt pour l'adherent 1000 : "+ad.getNbEmpruntsEnCours());
		System.out.println("Nombre de'emprunt pour l'employe 1001 : "+em.getNbEmpruntsEnCours());
	
=======
		//Affichage des emprunts en cours 
		System.out.println(emC1);
		System.out.println(emC2);

>>>>>>> refs/remotes/origin/master
=======
		//Affichage des emprunts en cours 
		System.out.println(emC1);
		System.out.println(emC2);

>>>>>>> refs/remotes/origin/master
		
	}
	
}