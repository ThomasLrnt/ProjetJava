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
import java.util.*;

/**
 *
 * @author Thomas LAURENT, Pierre-Louis DESOULTRAIT, Martin DESCOTTES
 */
public class Bulletin {
     
    // Déclaration des attributs
    public String ID_bulletin;
    public String ID_trimestre;
    public String ID_inscription;
    public ArrayList<String> Appreciation;
    
    // Constructeur par défaut
    public Bulletin() {
        ID_bulletin = new String();
        ID_trimestre = new String();
        ID_inscription = new String();
        Appreciation = new ArrayList();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_bulletin
     * @param ID_trimestre
     * @param ID_inscription
     * @param Appreciation 
     */
    public Bulletin(String ID_bulletin, String ID_trimestre, String ID_inscription, ArrayList<String> Appreciation) {
        this.ID_bulletin = ID_bulletin;
        this.ID_trimestre = ID_trimestre;
        this.ID_inscription = ID_inscription;
        this.Appreciation = Appreciation;
    }   
    
    
    // Getters et setters

    public String getID_bulletin() {
        return ID_bulletin;
    }

    public void setID_bulletin(String ID_bulletin) {
        this.ID_bulletin = ID_bulletin;
    }

    public String getID_trimestre() {
        return ID_trimestre;
    }

    public void setID_trimestre(String ID_trimestre) {
        this.ID_trimestre = ID_trimestre;
    }

    public String getID_inscription() {
        return ID_inscription;
    }

    public void setID_inscription(String ID_inscription) {
        this.ID_inscription = ID_inscription;
    }

    public ArrayList<String> getAppreciation() {
        return Appreciation;
    }

    public void setAppreciation(ArrayList<String> Appreciation) {
        this.Appreciation = Appreciation;
    }
    
    
    
    
}
