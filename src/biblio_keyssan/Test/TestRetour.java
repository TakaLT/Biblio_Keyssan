package biblio_keyssan.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio_keyssan.DAO.EmpruntArchiveDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntArchive;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;

public class TestRetour {

	public static void main(String[] args) throws ParseException {
		//////////////////////////////////////////////////////////////////////////
		// Creation des exemplaires
				
		Exemplaire ex1 = new Exemplaire("25/05/2015","ISBN001") ;
		System.out.println(ex1.toString());
		Exemplaire ex2 = new Exemplaire("18/03/2012","ISBN002") ;
		System.out.println(ex2.toString());
			
		
		//=========== Cr�ation d'un Data Base des Utilisateurs 
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
		
		//============ Creation d'un Adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Femme","pwd","psd","058956585");
		System.out.println(ad.toString());
		System.out.println();
		
		//=========== Ajouter dans la Data base des Utilisateurs : adherent et employ�
		UtilisateurDao1.ajoutUtilisateur(ad);
		
		//======== Creation d'un emprunt en cours pour l'adh�rent
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dtToday = new Date();
		
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , "02/04/2016");
		ad.addEmpruntEnCours(emp1);
		ex1.setEmpruntEnCours(emp1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
		
		//======== Creation 2 ieme  emprunt en cours pour l'adh�rent
		EmpruntEnCours emp2 = new EmpruntEnCours(ex2, ad ,"02/04/2016");
		ad.addEmpruntEnCours(emp2);
		ex2.setEmpruntEnCours(emp2);
		ex2.setStatus(EnumStatusExemplaire.PRETE);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		//Nombre d'emprunt avant le retour
		System.out.println(ad.getNbEmpruntsEnCours());
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////	
		//Retour de l'exemplaire
		//Ajout a la base DAO
		EmpruntArchiveDao eaDao = new EmpruntArchiveDao();
		
		
		//Enregistrement du retour à la date du jour
		//Changement du status de l'exemplaire
		
		ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);		
		System.out.println(ex1.toString());
		//Enregistrement dans l'archive
		EmpruntArchive emA = new EmpruntArchive(emp1);	
		System.out.println("Emprunt archive "+emA);		
		
		//Ajout de l'emprunt archivé dans la DAO
		System.out.println("Nombre d'emprunt en cours d'archivage: "+eaDao.getEmpruntArchiveDataBase().size());
		eaDao.ajoutEmpruntArchive(emA);
		System.out.println("Nombre d'emprunt en cours d'archivage: "+eaDao.getEmpruntArchiveDataBase().size());
		
		System.out.println();
		//Destruction de l'objet emprunt en cours
		//affichage de l'adherent et de l'exemplaire
		System.out.println("Colllection d'empunt en cours :"+ad.getEmpruntEnCours());	
		System.out.println(ex1.getTheEmpruntEnCours());
		
		System.out.println(ad.getNbEmpruntsEnCours());
		//utilisateur perd la reference de l'ojet emprunt en cours		
		
		System.out.println(emp1.toString());
		
		
		//Suppresion de l'emprunt en cours
		ad.removeEmpruntEnCours(emp1);
		System.out.println("Colllection d'empunt en cours : "+ad.getEmpruntEnCours());	
		
		
		//Suppression des pointeurs sur l'emprunt en cours		
		//ad.setEmpruntEnCours(null);
		//ex1.setEmpruntEnCours(null);
		

		//Declenchement du garbage collector
		for (int i = 0; i < 10000; i++) {				
			
			EmpruntEnCours i1 = new EmpruntEnCours(ex1, ad );
			ad.addEmpruntEnCours(i1);
			ex1.setEmpruntEnCours(i1);
			ex1.setStatus(EnumStatusExemplaire.PRETE);
			
			ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);	
			EmpruntArchive i2 = new EmpruntArchive(i1);
			ad.removeEmpruntEnCours(i1);
		}
		
		//System.out.println(emp1.toString());

	}

}
