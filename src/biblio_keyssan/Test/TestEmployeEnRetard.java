package biblio_keyssan.Test;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import biblio_keyssan.metier.Adherent;
import biblio_keyssan.metier.Employe;
import biblio_keyssan.metier.EnumCategorieEmploye;
import biblio_keyssan.metier.EnumStatusExemplaire;
import biblio_keyssan.metier.Exemplaire;

public class TestEmployeEnRetard {

	public static void main(String[] args) {
		//Preparation 
				//====== Creation d'un exemplaire
				
				Exemplaire ex1 = new Exemplaire("25/05/2015", EnumStatusExemplaire.DISPONIBLE,"ISBN001") ;
				System.out.println(ex1.toString());
				
				//====== Creation d'un employé
				
				GregorianCalendar dt = new GregorianCalendar();
				dt.set(2000, 05, 20);
				String[]tel ={"0245986570"};
				Employe emp = new Employe("NomEmploye","PrenomEmploye","25/05/1980", "Femme" ,"pwd","pseudo","matr1",EnumCategorieEmploye.BIBLIOTHECAIRE);
				
				//===== Emprunt d'un exemplaire
				
				System.out.println("nombre de jours"+emp.getNbJoursRetards());
				
				System.out.println(emp.isConditionsPretAcceptees());
			

	}

}
