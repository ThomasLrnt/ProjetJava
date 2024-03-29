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
public class Niveau {
    // Déclaration des attributs
    public int ID_niveau;
    public String nom;
    
    // Constructeur par défaut
    public Niveau(){
        ID_niveau = 0;
        nom = new String();
    }
    
    /** Constructeur instanciant l'objet
     * 
     * @param ID_niveau
     * @param nom 
     */
    public Niveau(int ID_niveau, String nom) {
        this.ID_niveau = ID_niveau;
        this.nom = nom;
    }
    
    // Getters et Setters

    public int getID_niveau() {
        return ID_niveau;
    }

    public void setID_niveau(int ID_niveau) {
        this.ID_niveau = ID_niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
