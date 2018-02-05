/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.exceptions;

/**
 *
 * @author Fiorald Ismaili
 */
public class LocationsControlException extends Exception {

    String message="Location Error, something went wrong in the Inventory";
   
    public LocationsControlException() {
    }

    public LocationsControlException(String message) {
        super(message);
    }

    public LocationsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocationsControlException(Throwable cause) {
        super(cause);
    }

    public LocationsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
}
