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
    public int ID_ecole;
    public String NomEcole;
    
    // Constructeur par défaut
    public Ecole(){
        ID_ecole = 0;
        NomEcole = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_ecole
     * @param NomEcole 
     */
    public Ecole(int ID_ecole, String NomEcole) {
        this.ID_ecole = ID_ecole;
        this.NomEcole = NomEcole;
    }
    
    
    // Getters et setters

    public int getID_ecole() {
        return ID_ecole;
    }

    public void setID_ecole(int ID_ecole) {
        this.ID_ecole = ID_ecole;
    }

    public String getNomEcole() {
        return NomEcole;
    }

    public void setNomEcole(String NomEcole) {
        this.NomEcole = NomEcole;
    }

    
    
}
