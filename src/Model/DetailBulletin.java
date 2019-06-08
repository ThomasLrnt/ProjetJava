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
public class DetailBulletin {
    // Déclaration des attributs
    public String ID_detail;
    public Bulletin bulletin;
    public Enseignant enseignant;
    public String appreciation;
    
    // Constructeur par défaut
    public DetailBulletin(){
        ID_detail = new String();
        bulletin = new Bulletin();
        enseignant = new Enseignant();
        appreciation = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_detail
     * @param bulletin
     * @param enseignant
     * @param appreciation 
     */
    public DetailBulletin(String ID_detail, Bulletin bulletin, Enseignant enseignant, String appreciation) {
        this.ID_detail = ID_detail;
        this.bulletin = bulletin;
        this.enseignant = enseignant;
        this.appreciation = appreciation;
    }
    
    
    
    
}
