/*
 * Classe permettant la mise à jour des données
 */
package Control;

// Importation des autres classes
import Control.*;
import Control.Connexion;
import Model.*;
import java.sql.SQLException;


// Importation de bibliothèques
import java.util.*;

/**
 *
 * @author Thomas LAURENT, Pierre-Louis DESOULTRAIT, Martin DESCOTTES
 */
public class Maj {
    // Pour la connexion à la base de donnée
    final String dbName = "gestion_ecole";
    final String userName = "root";
    final String password = "";
    // Objet type connexion -> lien avec la base de donnée
    
    // Méthodes de Modification d'une année scolaire
    public void ajoutAnnee(String id) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO annee_scolaire (id) VALUES ("+id+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    // Méthodes de Modification d'une Ecole
    
    // Méthodes de Modification d'un Trimestre
    
    // Méthodes de Modification d'un Niveau
    
    // Méthodes de Modification d'une discipline
    
    // Méthodes de Modification d'une personne
    
    // Méthodes de Modification d'un enseignant
    
    // Méthodes de Modification d'une inscription
    
    // Méthodes de Modification d'un bulletin
    
    // Méthodes de Modification d'un detail de Bulletin
    
    // Méthodes de Modification d'une evaluation

    
}
