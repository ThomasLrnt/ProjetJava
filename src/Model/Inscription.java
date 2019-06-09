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
    public int ID_inscription;
    public int ID_classe;
    public int ID_personne;
    
    public Inscription(){
        ID_inscription = 0;
        ID_classe = 0;
        ID_personne = 0;
    }

    /** Constructeur instanciant la classe
     * 
     * @param ID_inscription
     * @param ID_classe
     * @param ID_personne 
     */
    public Inscription(int ID_inscription, int ID_classe, int ID_personne) {
        this.ID_inscription = ID_inscription;
        this.ID_classe = ID_classe;
        this.ID_personne = ID_personne;
    }
    
    // Getters et Setters

    public int getID_inscription() {
        return ID_inscription;
    }

    public void setID_inscription(int ID_inscription) {
        this.ID_inscription = ID_inscription;
    }

    public int getID_classe() {
        return ID_classe;
    }

    public void setID_classe(int ID_classe) {
        this.ID_classe = ID_classe;
    }

    public int getID_personne() {
        return ID_personne;
    }

    public void setID_personne(int ID_personne) {
        this.ID_personne = ID_personne;
    }
    
    
    
}
