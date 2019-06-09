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
    public int ID_bulletin;
    public int ID_trimestre;
    public int ID_inscription;
    public ArrayList<String> Appreciation;
    
    // Constructeur par défaut
    public Bulletin() {
        ID_bulletin = 0;
        ID_trimestre = 0;
        ID_inscription = 0;
        Appreciation = new ArrayList();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_bulletin
     * @param ID_trimestre
     * @param ID_inscription
     * @param Appreciation 
     */
    public Bulletin(int ID_bulletin, int ID_trimestre, int ID_inscription, ArrayList<String> Appreciation) {
        this.ID_bulletin = ID_bulletin;
        this.ID_trimestre = ID_trimestre;
        this.ID_inscription = ID_inscription;
        this.Appreciation = Appreciation;
    }   
    
    
    // Getters et setters

    public int getID_bulletin() {
        return ID_bulletin;
    }

    public void setID_bulletin(int ID_bulletin) {
        this.ID_bulletin = ID_bulletin;
    }

    public int getID_trimestre() {
        return ID_trimestre;
    }

    public void setID_trimestre(int ID_trimestre) {
        this.ID_trimestre = ID_trimestre;
    }

    public int getID_inscription() {
        return ID_inscription;
    }

    public void setID_inscription(int ID_inscription) {
        this.ID_inscription = ID_inscription;
    }

    public ArrayList<String> getAppreciation() {
        return Appreciation;
    }

    public void setAppreciation(ArrayList<String> Appreciation) {
        this.Appreciation = Appreciation;
    }
    
    
    
    
}
