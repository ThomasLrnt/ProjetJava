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
    private Trimestre T1, T2, T3;
    
    /** Constructeur par défaut :
     * 
     */
    public AnneeScolaire() {
      ID_annee = new String();
      T1 = new Trimestre();
      T3 = new Trimestre();
      T2 = new Trimestre();
    }

    
    /** Constructeur instanciant l'objet
     * 
     * @param ID_annee
     * @param T1
     * @param T2
     * @param T3 
     */
    public AnneeScolaire(String ID_annee, Trimestre T1, Trimestre T2, Trimestre T3) {
        this.ID_annee = ID_annee;
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
    }
    
    
    // Getters et Setters

    public String getID_annee() {
        return ID_annee;
    }

    public void setID_annee(String ID_annee) {
        this.ID_annee = ID_annee;
    }

    public Trimestre getT1() {
        return T1;
    }

    public void setT1(Trimestre T1) {
        this.T1 = T1;
    }

    public Trimestre getT2() {
        return T2;
    }

    public void setT2(Trimestre T2) {
        this.T2 = T2;
    }

    public Trimestre getT3() {
        return T3;
    }

    public void setT3(Trimestre T3) {
        this.T3 = T3;
    }

}
