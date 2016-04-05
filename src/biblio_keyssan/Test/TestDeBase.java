package biblio_keyssan.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

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
		
			
		//Creation de la base DAO Exemplaires
		ExemplairesDao DAO1 = new ExemplairesDao();		
		//Appel de la methode find 
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
				
		// Creation d'un exemplaire
		Exemplaire ex1 = new Exemplaire( "25/05/2015", "ISBN001") ;
		System.out.println(ex1.toString());
		DAO1.ajoutExemplaire(ex1);
		System.out.println("Recherche dans la Dao de la key 1: "+DAO1.findByKey(1));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
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
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","09/05/2000", "Feminin","pwd","pseudo","0245986570");
		System.out.println(ad.toString());
		DAO2.ajoutUtilisateur(ad);
		System.out.println("Recherche dans la UtilisateurDao de la key 1000: "+DAO2.findByKey(1000));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Creation d'un employé
		Employe em = new Employe("NomEmploye","PrenomEmploye","15/03/1980", "Feminin","pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
		System.out.println(em.toString());
		DAO2.ajoutUtilisateur(em);
		System.out.println("Recherche dans la utilisateurDao de la key 1001: "+DAO2.findByKey(1001));
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
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
		
		//Deuxieme emprunt pour un employé
		EmpruntEnCours emC2 = new EmpruntEnCours(ex2,sdf.format(dtToDay),em);
		//ajout d'un emprunt en cours a un adherent
		em.addEmpruntEnCours(emC2);
		//ajout d'un emprunt a un exemplaire
		ex2.setTheEmpruntEnCours(emC2);
		System.out.println(em.toString());
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////////////");
		
		//Affichage des emprunts en cours 
		System.out.println(emC1);
		System.out.println(emC2);

		
	}

}
