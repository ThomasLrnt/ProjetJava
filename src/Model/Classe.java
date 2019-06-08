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
    public Ecole ecole;
    public Niveau niveau; 
    public AnneeScolaire annee;
    
    // Constructeur par défaut
    public Classe(){
        ID_classe = new String();
        nom  = new String();
        ecole = new Ecole();
        niveau  = new Niveau();
        annee  = new AnneeScolaire();
    }
    
   /** Constructeur instanciant l'objet
    * 
    * @param ID_classe
    * @param nom
    * @param ecole
    * @param niveau
    * @param annee 
    */
    public Classe(String ID_classe, String nom, Ecole ecole, Niveau niveau, AnneeScolaire annee) {
        this.ID_classe = ID_classe;
        this.nom = nom;
        this.ecole = ecole;
        this.niveau = niveau;
        this.annee = annee;
    }
    
    
}
