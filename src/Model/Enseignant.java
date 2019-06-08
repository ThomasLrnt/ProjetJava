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
    public Classe classe;
    public Discipline discipline;
    
    // Constructeur par défaut
    public Enseignant(){
        super();
        ID_enseignant = new String();
        classe = new Classe();
        discipline = new Discipline();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_enseignant
     * @param classe
     * @param discipline
     * @param ID_personne
     * @param nom
     * @param prenom
     * @param type 
     */
    public Enseignant(String ID_enseignant, Classe classe, Discipline discipline, String ID_personne, String nom, String prenom, String type) {
        super(ID_personne, nom, prenom, type);
        this.ID_enseignant = ID_enseignant;
        this.classe = classe;
        this.discipline = discipline;
    }
    
}
