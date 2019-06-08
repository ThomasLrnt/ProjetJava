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
    public String ID_enseignant;
    public String ID_classe;
    public String ID_discipline;
    
    // Constructeur par défaut
    public Enseignant(){
        super();
        ID_enseignant = new String();
        ID_classe = new String();
        ID_discipline = new String();
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
    public Enseignant(String ID_enseignant, String ID_classe, String ID_discipline, String ID_personne, String nom, String prenom, String type) {
        super(ID_personne, nom, prenom, type);
        this.ID_enseignant = ID_enseignant;
        this.ID_classe = ID_classe;
        this.ID_discipline = ID_discipline;
    }
    
    
}
