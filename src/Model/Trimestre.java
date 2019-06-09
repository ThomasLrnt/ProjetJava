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
public class Trimestre {
    // Déclaration des attributs
    public int ID_trimestre;
    public int numero;
    public int debut;
    public int fin;
    public int ID_annee;
    
    // Constructeur par défaut
    public Trimestre(){
        ID_trimestre = 0;
        numero = 0;
        debut = 0;
        fin = 0;
        ID_annee = 0;
        
    }
    
    /** Constructeur instanciant l'objet
     * 
     * @param ID_trimestre
     * @param numero
     * @param debut
     * @param fin
     * @param ID_annee 
     */
    public Trimestre(int ID_trimestre, int numero, int debut, int fin, int ID_annee) {
        this.ID_trimestre = ID_trimestre;
        this.numero = numero;
        this.debut = debut;
        this.fin = fin;
        this.ID_annee = ID_annee;
    }
    
    // Getters et Setters

    public int getID_trimestre() {
        return ID_trimestre;
    }

    public void setID_trimestre(int ID_trimestre) {
        this.ID_trimestre = ID_trimestre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getID_annee() {
        return ID_annee;
    }

    public void setID_annee(int ID_annee) {
        this.ID_annee = ID_annee;
    }
    
    
}
