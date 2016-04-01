//Source file: D:\\Biblio\\biblio\\metier\\Utilisateur.java

package biblio.metier;


public class Utilisateur extends Personne 
{
   private Integer idUtilisateur;
   private String pwd;
   private String pseudonyme;
   private EmpruntEnCours empruntEnCours[];
   
   /**
    * @roseuid 5241490A01F4
    */
   public Utilisateur() 
   {
    
   }
   
   /**
    * @param ep
    * @return Void
    * @roseuid 4CA4A34E02FD
    */
   public Void addEmpruntEnCours(EmpruntEnCours ep) 
   {
    return null;
   }
   
   /**
    * @return biblio.metier.EmpruntEnCours[ ]
    * @roseuid 4CA4A2C2006D
    */
   public EmpruntEnCours[ ] getEmpruntEnCours() 
   {
    return null;
   }
   
   /**
    * @return Integer
    * @roseuid 49423A15037A
    */
   public Integer getNbEmpruntsEnCours() 
   {
    return null;
   }
}
