package biblio_keyssan.Test;

import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntArchive;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;

public class TestRetour {

	public static void main(String[] args) {
		//Creation d'un adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","09/05/2000", "Feminin","pwd","pseudo","0245986570");
		System.out.println(ad.toString());
		//Creation d'un exemplaire prete
		Exemplaire ex1 = new Exemplaire( "25/05/2015", EnumStatusExemplaire.PRETE,"ISBN001") ;
		System.out.println(ex1.toString());
		
		//Creation d'un emprunt 
		EmpruntEnCours em= new EmpruntEnCours(ex1,"01/04/2016",ad);
		System.out.println(em.toString());
		System.out.println(ad);
		System.out.println();
		//Retour de l'exemplaire
		//Enregistrement du retour à la date du jour ex 05/04/2016
		//Changement du status de l'exemplaire
		ex1.setStatus(EnumStatusExemplaire.DISPONIBLE);
		System.out.println(ex1.toString());
		//Enregistrement dans l'archive
		EmpruntArchive emA = new EmpruntArchive("05/04/2016", "01/04/2016", ad, ex1);
		//Utilisateur perd l'exemplaire
		//ad.setEmpruntEnCours();
		//Emprunt en cours suppression
		em=null;
		System.out.println(ad);
		
	}

}
