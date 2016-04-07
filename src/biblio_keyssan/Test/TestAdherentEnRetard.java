package biblio_keyssan.Test;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;

public class TestAdherentEnRetard {
	
	public static void main(String[] args) {
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

		

	}

}
