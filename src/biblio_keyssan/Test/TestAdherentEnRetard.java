package biblio_keyssan.Test;

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
		//Creation d'un exemplaire
		Exemplaire ex1 = new Exemplaire(1, "25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
		System.out.println(ex1.toString());
		//Creation d'un adherent
		GregorianCalendar dt = new GregorianCalendar();
		dt.set(2000, 05, 20);
		String[]tel ={"0245986570"};
		Utilisateur ad = new Adherent("NomAdherent","PrenomAdherent",dt, "Feminin",1000, tel);
		
		//Emprunt d'un exemplaire
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//date d'aujourd'hui
		GregorianCalendar dateA = new GregorianCalendar();
		
		System.out.println(sdf.format(dateA.getTime()));
		Date dtToday = dateA.getTime();
		EmpruntEnCours emp1 = new EmpruntEnCours(ex1, ad , dtToday);
		ad.addEmpruntEnCours(emp1);
		System.out.println(ad.getEmpruntEnCours());
		System.out.println(ad.getNbEmpruntsEnCours());
		
		//Retour de l'exemplaire
		GregorianCalendar dateR = new GregorianCalendar();
		dateR.set(2016, 03, 25);
		System.out.println(sdf.format(dateR.getTime()));
		
		//Comparaison des dates
		
		//
		

	}

}
