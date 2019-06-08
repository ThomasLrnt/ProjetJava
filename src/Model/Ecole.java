/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

// Importation des autres classes
import Control.*;
import Model.*;

// Importation de bibliothèques

/**
 *
 * @author Thomas LAURENT, Pierre-Louis DESOULTRAIT, Martin DESCOTTES
 */
public class Ecole {
    
    // Déclaration des attributs
    public String ID_ecole;
    public String NomEcole;
    
    // Constructeur par défaut
    public Ecole(){
        ID_ecole = new String();
        NomEcole = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_ecole
     * @param NomEcole 
     */
    public Ecole(String ID_ecole, String NomEcole) {
        this.ID_ecole = ID_ecole;
        this.NomEcole = NomEcole;
    }
    
    
    
    
}
