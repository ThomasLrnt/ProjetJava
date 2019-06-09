/*
 * 
 */
package projetjava;

// Importation des bibliothèques usuelles
import java.lang.*;
import java.util.*;
// Importation des ressources

// Importation des autres packages
import Control.*;
import Exceptions.*;
import Model.*;
import java.sql.SQLException;

/**
 * @author Thomas LAURENT, Pierre-Louis DE SOULTRAIT
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        // Connexion à la base de donnée
        String dbName = "gestion_ecole";
        String userName = "root";
        String password = "";
        
        Connexion Connect;
        
        Connect = new Connexion(dbName,userName,password);
    }
    
}
