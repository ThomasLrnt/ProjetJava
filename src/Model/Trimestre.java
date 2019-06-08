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
    public String ID_trimestre;
    public int numero;
    public int debut;
    public int fin;
    public String ID_annee;
    
    // Constructeur par défaut
    public Trimestre(){
        ID_trimestre = new String();
        numero = 0;
        debut = 0;
        fin = 0;
        ID_annee = new String();
        
    }
    
    /** Constructeur instanciant l'objet
     * 
     * @param ID_trimestre
     * @param numero
     * @param debut
     * @param fin
     * @param ID_annee 
     */
    public Trimestre(String ID_trimestre, int numero, int debut, int fin, String ID_annee) {
        this.ID_trimestre = ID_trimestre;
        this.numero = numero;
        this.debut = debut;
        this.fin = fin;
        this.ID_annee = ID_annee;
    }
    
}
