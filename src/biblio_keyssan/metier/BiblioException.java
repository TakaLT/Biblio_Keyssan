/***********************************************************************
 * Module:  BiblioException.java
 * Author:  takalt
 * Purpose: Defines the Class BiblioException
 ***********************************************************************/

package biblio_keyssan.metier;



public class BiblioException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public BiblioException() {
	      super("Impossible d'emprunter un livre !");
	}
	
	 public BiblioException(String message) {
      super(message);
	   
   }

}

   