package biblio_keyssan.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) {
	//////////////////////////////////////////////////////////////////////////
	// Creation des exemplaires
	//
	
	Exemplaire ex1 = new Exemplaire("25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
	System.out.println(ex1.toString());
	Exemplaire ex2 = new Exemplaire("18/03/2012", EnumStatusExemplaire.DISPONIBLE,"ISBN002") ;
	System.out.println(ex2.toString());
	Exemplaire ex3 = new Exemplaire("18/09/2014", EnumStatusExemplaire.DISPONIBLE,"ISBN003") ;
	System.out.println(ex3.toString());
	Exemplaire ex4 = new Exemplaire("20/03/2013", EnumStatusExemplaire.DISPONIBLE,"ISBN004") ;
	System.out.println(ex4.toString());
	
	
	
	//=========== Cr�ation d'un Data Base des Utilisateurs 
	UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
	
	//============ Creation d'un Adherent
	GregorianCalendar dt = new GregorianCalendar();
	dt.set(2000, 05, 20);
	String[] tel = {"0245986570"};
	Utilisateur ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Femme","pwd","psd","058956585");
	System.out.println(ad.toString());
	System.out.println();
	
	//=========== Ajouter dans la Data base des Utilisateurs : adherent et employ�
	UtilisateurDao1.ajoutUtilisateur(ad);
	System.out.println(ad.getIdUtilisateur());
	System.out.println("Affichage de la DAO"+UtilisateurDao1.getutilisateurDB());
			
	//======== Creation d'un emprunt en cours pour l'adh�rent
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	
	Date dtToday = new Date();
	
	EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , sdf.format(dtToday));
	ad.addEmpruntEnCours(emp1);
	ex1.setEmpruntEnCours(emp1);
	ex1.setStatus(EnumStatusExemplaire.PRETE);
	
	//======== Creation 2 ieme  emprunt en cours pour l'adh�rent
	EmpruntEnCours emp2 = new EmpruntEnCours(ex2, ad , sdf.format(dtToday));
	ad.addEmpruntEnCours(emp2);
	ex2.setEmpruntEnCours(emp2);
	ex2.setStatus(EnumStatusExemplaire.PRETE);
	
	//======== Creation 3 ieme  emprunt en cours pour l'adh�rent
	EmpruntEnCours emp3 = new EmpruntEnCours(ex3, ad , sdf.format(dtToday));
	ad.addEmpruntEnCours(emp3);
	ex3.setEmpruntEnCours(emp3);
	ex3.setStatus(EnumStatusExemplaire.PRETE);
	
	//======= isConditionPretAcceptees()
	System.out.println(ad.isConditionsPretAcceptees());
	
	//======== Creation 4 ieme  emprunt en cours pour l'adh�rent
	EmpruntEnCours emp4 = new EmpruntEnCours(ex4, ad , sdf.format(dtToday));
	ad.addEmpruntEnCours(emp4);
	ex4.setEmpruntEnCours(emp4);
	ex4.setStatus(EnumStatusExemplaire.PRETE);
	
	
	//======= isConditionPretAcceptees()
	System.out.println(ad.isConditionsPretAcceptees());
	
	//======= BiblioException
	}

}