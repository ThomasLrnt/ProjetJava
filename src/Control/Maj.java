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
    
    /** Méthodes de Modification d'une année scolaire
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutAnnee(int id) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO annee_scolaire ('id') VALUES ("+id+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'une Ecole
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutEcole(int id, String nom) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO ecole ('id','nom') VALUES ("+id+","+nom+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'un Trimestre
     * 
     * @param id
     * @param num
     * @param debut
     * @param fin
     * @param id_annee
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutTrimestre(int id, int num, int debut, int fin, int id_annee) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO trimestre ('id', 'numero', 'debut', 'fin', 'id_annee_scolaire') VALUES ("+id+","+num+","+debut+","+fin+","+id_annee+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'un Niveau
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutNiveau(int id, String nom) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO niveau ('id', 'nom') VALUES ("+id+","+nom+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    // Méthodes de Modification d'une discipline
    public void ajoutClasse(int id, String nom, int id_ecole, int id_niveau, int id_annee) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO classe ('id', 'nom', 'id_ecole', 'id_niveau', 'id_annee_scolaire') VALUES ("+ id +","+ nom +","+ id_ecole+","+id_niveau+","+id_annee+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    // Méthodes de Modification d'une personne
    
    // Méthodes de Modification d'un enseignant
    
    // Méthodes de Modification d'une inscription
    
    // Méthodes de Modification d'un bulletin
    
    // Méthodes de Modification d'un detail de Bulletin
    
    // Méthodes de Modification d'une evaluation

    
}
