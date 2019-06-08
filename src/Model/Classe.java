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
    public String ID_classe;
    public String nom;
    public String ID_ecole;
    public String ID_niveau; 
    public String ID_annee;
    
    // Constructeur par défaut
    public Classe(){
        ID_classe = new String();
        nom  = new String();
        ID_ecole = new String();
        ID_niveau  = new String();
        ID_annee  = new String();
    }
    
   /** Constructeur instanciant l'objet
    * 
    * @param ID_classe
    * @param nom
    * @param ID_ecole
    * @param ID_niveau
    * @param ID_annee 
    */
    public Classe(String ID_classe, String nom, String ID_ecole, String ID_niveau, String ID_annee) {
        this.ID_classe = ID_classe;
        this.nom = nom;
        this.ID_ecole = ID_ecole;
        this.ID_niveau = ID_niveau;
        this.ID_annee = ID_annee;
    }
    
}
