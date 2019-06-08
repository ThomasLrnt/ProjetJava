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
    public Classe classe;
    public Personne personne;
    
    public Inscription(){
        ID_inscription = new String();
        classe = new Classe();
        personne = new Personne();
    }

    /** Constructeur instanciant la classe
     * 
     * @param ID_inscription
     * @param classe
     * @param personne 
     */
    public Inscription(String ID_inscription, Classe classe, Personne personne) {
        this.ID_inscription = ID_inscription;
        this.classe = classe;
        this.personne = personne;
    }
    
    
    
}
