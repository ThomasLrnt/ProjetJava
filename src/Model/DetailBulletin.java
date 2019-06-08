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
    public String ID_bulletin;
    public String ID_enseignant;
    public String appreciation;
    
    // Constructeur par défaut
    public DetailBulletin(){
        ID_detail = new String();
        ID_bulletin = new String();
        ID_enseignant = new String();
        appreciation = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_detail
     * @param ID_bulletin
     * @param ID_enseignant
     * @param appreciation 
     */
    public DetailBulletin(String ID_detail, String ID_bulletin, String ID_enseignant, String appreciation) {
        this.ID_detail = ID_detail;
        this.ID_bulletin = ID_bulletin;
        this.ID_enseignant = ID_enseignant;
        this.appreciation = appreciation;
    }
    
    
    
    
}
