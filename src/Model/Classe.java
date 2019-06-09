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
public class Classe {
    // Déclaration des attributs
    public int ID_classe;
    public String nom;
    public int ID_ecole;
    public int ID_niveau; 
    public int ID_annee;
    
    // Constructeur par défaut
    public Classe(){
        ID_classe = 0;
        nom  = new String();
        ID_ecole = 0;
        ID_niveau  = 0;
        ID_annee  = 0;
    }

   /** Constructeur instanciant l'objet
    * 
    * @param ID_classe
    * @param nom
    * @param ID_ecole
    * @param ID_niveau
    * @param ID_annee 
    */
    public Classe(int ID_classe, String nom, int ID_ecole, int ID_niveau, int ID_annee) {
        this.ID_classe = ID_classe;
        this.nom = nom;
        this.ID_ecole = ID_ecole;
        this.ID_niveau = ID_niveau;
        this.ID_annee = ID_annee;
    }
    
    
        // Getters et setters

    public int getID_classe() {
        return ID_classe;
    }

    public void setID_classe(int ID_classe) {
        this.ID_classe = ID_classe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getID_ecole() {
        return ID_ecole;
    }

    public void setID_ecole(int ID_ecole) {
        this.ID_ecole = ID_ecole;
    }

    public int getID_niveau() {
        return ID_niveau;
    }

    public void setID_niveau(int ID_niveau) {
        this.ID_niveau = ID_niveau;
    }

    public int getID_annee() {
        return ID_annee;
    }

    public void setID_annee(int ID_annee) {
        this.ID_annee = ID_annee;
    }

    
    
    
}
