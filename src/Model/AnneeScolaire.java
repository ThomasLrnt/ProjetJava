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
public class AnneeScolaire {
    // Déclaration des attributs
    public String ID_annee;
    
    /** Constructeur par défaut :
     * 
     */
    public AnneeScolaire() {
      ID_annee = new String();  
    }
    
    /** Constructeur instanciant l'objet
     * 
     * @param ID_annee 
     */
    public AnneeScolaire(String ID_annee) {
        this.ID_annee = ID_annee;
    }
    
    
}
