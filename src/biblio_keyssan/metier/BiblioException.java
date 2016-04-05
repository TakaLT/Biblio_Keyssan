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
   
   /** @param message
    * @pdOid b0661fa6-7c56-417c-8a5f-e58cf4183318 */
   public BiblioException(String message) {
      super(message);
	   
   }

}

   