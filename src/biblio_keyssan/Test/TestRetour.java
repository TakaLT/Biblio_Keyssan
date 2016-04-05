package biblio_keyssan.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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
		//
		
		Exemplaire ex1 = new Exemplaire(1, "25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		Exemplaire ex2 = new Exemplaire(2, "18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
		System.out.println(ex2.toString());
		
		
		
		//=========== Cr�ation d'un Data Base des Utilisateurs 
		UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
		
		//============ Creation d'un Adherent
		GregorianCalendar dt = new GregorianCalendar();
		dt.set(2000, 05, 20);
		String[] tel = {"0245986570"};
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent",dt, "Femme",1000, tel);
		System.out.println(ad.toString());
		System.out.println();
		
		//=========== Ajouter dans la Data base des Utilisateurs : adherent et employ�
		UtilisateurDao1.ajoutUtilisateur(ad);
		System.out.println(ad.getIdUtilisateur());
		System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
		
		//======== Creation d'un emprunt en cours pour l'adh�rent
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar dateA = new GregorianCalendar();
		System.out.println(sdf.format(dateA.getTime()));
		Date dtToday = dateA.getTime();
		
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , dtToday);
		ad.addEmpruntEnCours(emp1);
		ex1.setEmpruntEnCours(emp1);
		ex1.setStatus(EnumStatusExemplaire.PRETE);
		
		//======== Creation 2 ieme  emprunt en cours pour l'adh�rent
		EmpruntEnCours emp2 = new EmpruntEnCours(ex2, ad , dtToday);
		ad.addEmpruntEnCours(emp2);
		ex2.setEmpruntEnCours(emp2);
		ex2.setStatus(EnumStatusExemplaire.PRETE);
		
		
		
		//======= isConditionPretAcceptees()
		System.out.println(ad.isConditionsPretAcceptees());
				
			
		//Retour de l'exemplaire
		//Enregistrement du retour à la date du jour ex 05/04/2016
		//Changement du status de l'exemplaire
		ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);		
		System.out.println(ex1.toString());
		//Enregistrement dans l'archive
		EmpruntArchive emA = new EmpruntArchive(sdf.parse("05/04/2016"),sdf.parse("01/04/2016"), ad, ex1);
		System.out.println("Emprunt archive "+emA);
		//liberation de l'objet emprunt en cours
		System.out.println(ad);
		//utilisateur perd la reference de l'ojet emprunt en cours
		System.out.println(ex1);
		System.out.println(ad.getNbEmpruntsEnCours());
		System.out.println(emp1.toString());
		ad.removeEmpruntEnCours(emp1);
		
		System.out.println(ad.getEmpruntEnCours());
		//ad.setEmpruntEnCours(null);
		System.out.println(ad.getEmpruntEnCours());
		//ex1.setEmpruntEnCours(null);
		System.out.println(ad.getNbEmpruntsEnCours());
		//System.out.println(emp1.toString());
				
	/*	for (int i = 0; i < 10000; i++) {		
			
			
			EmpruntEnCours i1 = new EmpruntEnCours(ex1, ad , dtToday);
			ad.addEmpruntEnCours(i1);
			ex1.setEmpruntEnCours(i1);
			ex1.setStatus(EnumStatusExemplaire.PRETE);
			
			ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);	
			EmpruntArchive i2 = new EmpruntArchive(sdf.parse("05/04/2016"),sdf.parse("01/04/2016"), ad, ex1);
			ad.removeEmpruntEnCours(i1);
		}
		
		System.out.println(emp1.toString());*/

	}

}
