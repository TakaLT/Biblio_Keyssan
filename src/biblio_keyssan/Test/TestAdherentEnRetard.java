package biblio_keyssan.Test;

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

public class TestAdherentEnRetard {
	
	public static void main(String[] args) {
		
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
		
		
				
				

	}

}
