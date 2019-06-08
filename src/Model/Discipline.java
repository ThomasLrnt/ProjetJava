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
public class Discipline {
    // Déclaration des attributs
    public String ID_discipline;
    public String nom;
    
    // Constructeur par défaut
    public Discipline(){
       ID_discipline = new String();
       nom = new String();
    }

    /** Cosntructeur instanciant l'objet
     * 
     * @param ID_discipline
     * @param nom 
     */
    public Discipline(String ID_discipline, String nom) {
        this.ID_discipline = ID_discipline;
        this.nom = nom;
    }
    
    
    
}
