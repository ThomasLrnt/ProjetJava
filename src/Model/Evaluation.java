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
public class Evaluation {
    // Déclaration des attributs
    public String ID_evaluation;
    public String ID_detail;
    public int note;
    public String appreciation;
    
    // Constructeur par défaut
    public Evaluation(){
        ID_evaluation = new String();
        ID_detail = new String();
        note = 0;
        appreciation = new String();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_evaluation
     * @param ID_detail
     * @param note
     * @param appreciation 
     */
    public Evaluation(String ID_evaluation, String ID_detail, int note, String appreciation) {
        this.ID_evaluation = ID_evaluation;
        this.ID_detail = ID_detail;
        this.note = note;
        this.appreciation = appreciation;
    }
    
    
    
}
