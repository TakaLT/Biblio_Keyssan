package biblio_keyssan.Test;

import biblio_keyssan.DAO.ExemplairesDao;
import biblio_keyssan.DAO.UtilisateursDao;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;

public class TestEmployeroisEmprunts {

		public static void main(String[] args) {
			//////////////////////////////////////////////////////////////////////////		
			//============ Creation d'un Data base des Exemplaires (DAO)
			ExemplairesDao DAO1 = new ExemplairesDao();
		
			// Creation des exemplaires				
			Exemplaire ex1 = new Exemplaire("25/05/2015","ISBN001") ;			
			DAO1.ajoutExemplaire(ex1);
			System.out.println(ex1.toString());
			
			Exemplaire ex2 = new Exemplaire("18/03/2012","ISBN002") ;
			DAO1.ajoutExemplaire(ex2);
			System.out.println(ex2.toString());
			
			Exemplaire ex3 = new Exemplaire("18/09/2014","ISBN003");			
			DAO1.ajoutExemplaire(ex3);
			System.out.println(ex3.toString());
			
			Exemplaire ex4 = new Exemplaire("20/03/2013","ISBN004") ;
			DAO1.ajoutExemplaire(ex4);
			System.out.println(ex4.toString());
	
				
			//=========== Cr�ation d'un Data Base des Utilisateurs 
			UtilisateursDao  UtilisateurDao1= new UtilisateursDao();
	
			//============ Creation d'un Adherent
		
			Employe em = new Employe("NomEmploye","PrenomEmploye","25/05/1980", "Femme" ,"pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
			System.out.println(em.toString());
			System.out.println();
	
			//=========== Ajouter dans la Data base des Utilisateurs : adherent et employé
			UtilisateurDao1.ajoutUtilisateur(em);

			
			//======== Creation d'un emprunt en cours pour l'adh�rent	
			EmpruntEnCours emp1 = new EmpruntEnCours(ex1, em);
			em.addEmpruntEnCours(emp1);
			ex1.setEmpruntEnCours(emp1);
			ex1.setStatus(EnumStatusExemplaire.PRETE);
			System.out.println(emp1);
	
			//======== Creation 2 ieme  emprunt en cours pour l'adhérent
			EmpruntEnCours emp2 = new EmpruntEnCours(ex2, em );
			em.addEmpruntEnCours(emp2);
			ex2.setEmpruntEnCours(emp2);
			ex2.setStatus(EnumStatusExemplaire.PRETE);
			System.out.println(emp2);
	
			//======== Creation 3 ieme  emprunt en cours pour l'adh�rent
			EmpruntEnCours emp3 = new EmpruntEnCours(ex3, em);
			em.addEmpruntEnCours(emp3);
			ex3.setEmpruntEnCours(emp3);
			ex3.setStatus(EnumStatusExemplaire.PRETE);
			System.out.println(emp3);

	
		//======== Creation 4 ieme  emprunt en cours pour l'adh�rent
			EmpruntEnCours emp4 = new EmpruntEnCours(ex4, em );
			em.addEmpruntEnCours(emp4);
			ex4.setEmpruntEnCours(emp4);
			ex4.setStatus(EnumStatusExemplaire.PRETE);
			System.out.println(emp3);



	}

}