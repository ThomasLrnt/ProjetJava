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
public class Inscription {
    // Déclaration des attributs
    public String ID_inscription;
    public String ID_classe;
    public String ID_personne;
    
    public Inscription(){
        ID_inscription = new String();
        ID_classe = new String();
        ID_personne = new String();
    }

    /** Constructeur instanciant la classe
     * 
     * @param ID_inscription
     * @param ID_classe
     * @param ID_personne 
     */
    public Inscription(String ID_inscription, String ID_classe, String ID_personne) {
        this.ID_inscription = ID_inscription;
        this.ID_classe = ID_classe;
        this.ID_personne = ID_personne;
    }
    
    
    
}
