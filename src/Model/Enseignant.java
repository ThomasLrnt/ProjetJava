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
public class Enseignant extends Personne {
    public int ID_enseignant;
    public int ID_classe;
    public int ID_discipline;
    public int ID_personne;
    
    // Constructeur par défaut
    public Enseignant(){
        super();
        ID_enseignant = 0;
        ID_classe = 0;
        ID_discipline = 0;
    }

    public Enseignant(int ID_enseignant, int ID_classe, int ID_discipline, int ID_personne) {
        this.ID_enseignant = ID_enseignant;
        this.ID_classe = ID_classe;
        this.ID_discipline = ID_discipline;
        this.ID_personne = ID_personne;
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_enseignant
     * @param ID_classe
     * @param ID_discipline
     * @param ID_personne
     * @param nom
     * @param prenom
     * @param type 
     */
    public Enseignant(int ID_enseignant, int ID_classe, int ID_discipline, int ID_personne, String nom, String prenom, String type) {
        super(ID_personne, nom, prenom, type);
        this.ID_enseignant = ID_enseignant;
        this.ID_classe = ID_classe;
        this.ID_discipline = ID_discipline;
        this.ID_personne = ID_personne;
    }

    
    // Getters et Setters

    public int getID_enseignant() {
        return ID_enseignant;
    }

    public void setID_enseignant(int ID_enseignant) {
        this.ID_enseignant = ID_enseignant;
    }

    public int getID_classe() {
        return ID_classe;
    }

    public void setID_classe(int ID_classe) {
        this.ID_classe = ID_classe;
    }

    public int getID_discipline() {
        return ID_discipline;
    }

    public void setID_discipline(int ID_discipline) {
        this.ID_discipline = ID_discipline;
    }

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
