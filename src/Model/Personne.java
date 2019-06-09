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
public class Personne {
    // Déclaration des attributs
    public int ID_personne;
    public String nom;
    public String prenom;
    public String type;
    
    // Constructeur par défaut
    public Personne(){
        ID_personne = 0;
        nom = new String();
        prenom = new String();
        type = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_personne
     * @param nom
     * @param prenom
     * @param type 
     */
    public Personne(int ID_personne, String nom, String prenom, String type) {
        this.ID_personne = ID_personne;
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
    }
    
    // Getters et Setters

    public int getID_personne() {
        return ID_personne;
    }

    public void setID_personne(int ID_personne) {
        this.ID_personne = ID_personne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
