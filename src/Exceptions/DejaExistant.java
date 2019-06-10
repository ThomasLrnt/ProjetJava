/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Thomas LAURENT, Pierre-Louis DESOULTRAIT, Martin DESCOTTES
 */
public class DejaExistant extends Exception {

    /**
     * Creates a new instance of <code>DejaExistant</code> without detail
     * message.
     */
    public DejaExistant() {
        super();
    }

    /**
     * Constructs an instance of <code>DejaExistant</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DejaExistant(String msg) {
        super(msg);
    }
    
    @Override
    public String getMessage() {
        return "L'objet est déja présent dans la table"; //To change body of generated methods, choose Tools | Templates.
    }
}
