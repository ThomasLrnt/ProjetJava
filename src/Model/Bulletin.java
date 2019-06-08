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
    public Trimestre trimestre;
    public ArrayList Appreciation;
    
    // Constructeur par défaut
    public Bulletin() {
        ID_bulletin = new String();
        trimestre = new Trimestre();
        Appreciation = new ArrayList();
    }

    /** Constructeur instanciant l'objet
     * 
     * @param ID_bulletin
     * @param trimestre
     * @param Appreciation 
     */
    public Bulletin(String ID_bulletin, Trimestre trimestre, ArrayList Appreciation) {
        this.ID_bulletin = ID_bulletin;
        this.trimestre = trimestre;
        this.Appreciation = Appreciation;
    }
    
    
    
}
