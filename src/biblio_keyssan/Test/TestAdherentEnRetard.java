package biblio_keyssan.Test;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.EmpruntEnCours;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;
import biblio_keyssan.metier.Utilisateur;

public class TestAdherentEnRetard {
	
	public static void main(String[] args) {
		//Preparation 
		//====== Creation d'un exemplaire
		
		Exemplaire ex1 = new Exemplaire("25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		
		//====== Creation d'un adherent
		Adherent ad = new Adherent("NomAdherent","PrenomAdherent","05/02/1985", "Feminin", "passwordAdherent","pseudoAdherent","0245986570");
		
		//===== Emprunt d'un exemplaire	

		System.out.println("nombre de jours"+ad.getNbJoursRetards());
		
		System.out.println(ad.isConditionsPretAcceptees());
	
	//
		

	}

}
