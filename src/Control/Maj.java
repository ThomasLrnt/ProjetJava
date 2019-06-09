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
    
    /** Méthodes de Modification d'une classe
     * 
     * @param id
     * @param nom
     * @param id_ecole
     * @param id_niveau
     * @param id_annee
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutClasse(int id, String nom, int id_ecole, int id_niveau, int id_annee) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO classe ('id', 'nom', 'id_ecole', 'id_niveau', 'id_annee_scolaire') VALUES ("+ id +","+ nom +","+ id_ecole+","+id_niveau+","+id_annee+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'une discipline
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutDiscipline(int id, String nom) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO discipline ('id', 'nom') VALUES ("+id+","+nom+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'une personne
     * 
     * @param id
     * @param nom
     * @param prenom
     * @param type
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutPersonne(int id, String nom, String prenom, String type) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO personne ('id', 'nom', 'prenom', 'type') VALUES ("+id+","+nom+","+prenom+","+type+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthode d'ajout d'un enseignant
     * 
     * @param id
     * @param id_classe
     * @param id_discipline
     * @param id_personne
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutEnseignant(int id, int id_classe, int id_discipline, int id_personne) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO enseignement ('id', 'id_classe', 'id_discipline', 'id_personne') VALUES ("+id+","+id_classe+","+id_discipline+","+id_personne+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    // Méthodes de Modification d'une inscription
    public void ajoutInscription(int id, int id_classe, int id_personne) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO inscription ('id', 'id_classe', 'id_personne') VALUES ("+id+","+id_classe+","+id_personne+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'un bulletin
     * 
     * @param id
     * @param id_trimestre
     * @param id_inscription
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutBulletin(int id, int id_trimestre, int id_inscription, String appreciation) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO bulletin ('id', 'id_trimestre','id_inscription','appreciation') VALUES ("+id+","+id_trimestre+","+id_inscription+","+appreciation+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'un detail de Bulletin
     * 
     * @param id
     * @param id_bulletin
     * @param id_enseignant
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutDetailBulletin(int id, int id_bulletin, int id_enseignant, String appreciation) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO detail_bulletin ('id', 'id_bulletin', 'id_enseignement', 'appreciation') VALUES ("+id+","+id_bulletin+","+id_enseignant+","+appreciation+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
    /** Méthodes de Modification d'une evaluation
     * 
     * @param id
     * @param id_detail_bulletin
     * @param note
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void ajoutEvaluation(int id, int id_detail_bulletin, int note, String appreciation) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO evaluation ('id', 'id_detail_bulletin', 'note', 'appreciation') VALUES ("+id+","+id_detail_bulletin+","+note+","+appreciation+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
    }
    
}
