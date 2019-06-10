/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author laure
 */
public class ErreurCleEtrangere extends Exception {

    /**
     * Creates a new instance of <code>ErreurCleSecondaire</code> without detail
     * message.
     */
    public ErreurCleEtrangere() {
    }

    /**
     * Constructs an instance of <code>ErreurCleSecondaire</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ErreurCleEtrangere(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return "Problème de clé étrangère."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
