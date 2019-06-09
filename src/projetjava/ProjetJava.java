/*
 * Sources : http://lotfi-chaari.net/ens/NFP121/Chap_Bases_donnees.pdf
 */
package projetjava;

// Importation des bibliothèques usuelles
import java.lang.*;
import java.util.*;
import java.sql.SQLException;
// Importation des ressources

// Importation des autres packages
import Control.*;
import Exceptions.*;
import Model.*;


/**
 * @author Thomas LAURENT, Pierre-Louis DE SOULTRAIT
 */
public class ProjetJava {

    /**
     * 
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Maj maMaj = new Maj();
        
        // test fonction ajoutAnnee
        maMaj.ajoutAnnee(2018);
        
    }
    
}
