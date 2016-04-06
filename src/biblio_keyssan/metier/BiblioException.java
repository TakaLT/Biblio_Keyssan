/***********************************************************************
 * Module:  BiblioException.java
 * Author:  takalt
 * Purpose: Defines the Class BiblioException
 ***********************************************************************/

package biblio_keyssan.metier;

import java.util.*;


public class BiblioException extends Exception {
   
   public BiblioException() {
      super("Impossible d'emprunter un livre !");
   }

   public BiblioException(String message) {
      super(message);
	   
   }

}

   