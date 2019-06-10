/*
 * Classe permettant la mise à jour des données
 */
package Control;

// Importation des autres classes
import Control.*;
import Control.Connexion;
import Model.*;
import Exceptions.*;
import java.sql.*;
import java.util.*;
import java.lang.*;


// Importation de bibliothèque utiles

/**
 *
 * @author Thomas LAURENT, Pierre-Louis DESOULTRAIT, Martin DESCOTTES
 */
public class Maj {
    // Pour la connexion à la base de donnée
    final String dbName = "gestion_ecole";
    final String userName = "root";
    final String password = "";
    
    
    
    
    //    LES METHODES D'AJOUT DANS LA BASE DE DONEE
    
    /** Méthodes d'ajout d'une année scolaire
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutAnnee(int id) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO annee_scolaire (id) VALUES ("+id+");";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM annee_scolaire WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
  
    }
    
    /** Méthodes d'ajout d'une Ecole
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutEcole(int id, String nom) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO ecole (id,nom) VALUES ('"+id+"','"+nom+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM ecole WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
            
        }
    }
    
    /** Méthodes d'ajout d'un Trimestre
     * 
     * @param id
     * @param num
     * @param debut
     * @param fin
     * @param id_annee
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutTrimestre(int id, int num, int debut, int fin, int id_annee) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO trimestre (id, numero, debut, fin, id_annee_scolaire) VALUES ('"+id+"','"+num+"','"+debut+"','"+fin+"','"+id_annee+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM trimestre WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'un Niveau
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutNiveau(int id, String nom) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO niveau (id,nom) VALUES ('"+id+"','"+nom+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM niveau WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'une classe
     * 
     * @param id
     * @param nom
     * @param id_ecole
     * @param id_niveau
     * @param id_annee
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws ErreurCleEtrangere
     * @throws DejaExistant 
     */
    public void ajoutClasse(int id, String nom, int id_ecole, int id_niveau, int id_annee) throws SQLException, ClassNotFoundException, ErreurCleEtrangere, DejaExistant{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO classe (id, nom, id_ecole, id_niveau, id_annee_scolaire) VALUES ('"+ id +"','"+ nom +"','"+ id_ecole+"','"+id_niveau+"','"+id_annee+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM classe WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'une discipline
     * 
     * @param id
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutDiscipline(int id, String nom) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO discipline (id, nom) VALUES ('"+id+"','"+nom+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM discipline WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'une personne
     * 
     * @param id
     * @param nom
     * @param prenom
     * @param type
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutPersonne(int id, String nom, String prenom, String type) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO personne (id, nom, prenom, type) VALUES ('"+id+"','"+nom+"','"+prenom+"','"+type+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM personne WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthode d'ajout d'un enseignant
     * 
     * @param id
     * @param id_classe
     * @param id_discipline
     * @param id_personne
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutEnseignant(int id, int id_classe, int id_discipline, int id_personne) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO enseignement (id, id_classe, id_discipline, id_personne) VALUES ('"+id+"','"+id_classe+"','"+id_discipline+"','"+id_personne+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM enseignement WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'une inscription
     * 
     * @param id
     * @param id_classe
     * @param id_personne
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutInscription(int id, int id_classe, int id_personne) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO inscription (id, id_classe, id_personne) VALUES ('"+id+"','"+id_classe+"','"+id_personne+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM inscription WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'un bulletin
     * 
     * @param id
     * @param id_trimestre
     * @param id_inscription
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws ErreurCleEtrangere
     * @throws DejaExistant 
     */
    public void ajoutBulletin(int id, int id_trimestre, int id_inscription, String appreciation) throws SQLException, ClassNotFoundException, ErreurCleEtrangere, DejaExistant{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO bulletin (id, id_trimestre, id_inscription, appreciation) VALUES ('"+id+"','"+id_trimestre+"','"+id_inscription+"','"+appreciation+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM bulletin WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'un detail de Bulletin
     * 
     * @param id
     * @param id_bulletin
     * @param id_enseignant
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutDetailBulletin(int id, int id_bulletin, int id_enseignant, String appreciation) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO detail_bulletin (id, id_bulletin, id_enseignement, appreciation) VALUES ('"+id+"','"+id_bulletin+"','"+id_enseignant+"','"+appreciation+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM detail_bulletin WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    /** Méthodes d'ajout d'une evaluation
     * 
     * @param id
     * @param id_detail_bulletin
     * @param note
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws DejaExistant
     * @throws ErreurCleEtrangere 
     */
    public void ajoutEvaluation(int id, int id_detail_bulletin, int note, String appreciation) throws SQLException, ClassNotFoundException, DejaExistant, ErreurCleEtrangere{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "INSERT INTO evaluation (id, id_detail_bulletin, note, appreciation) VALUES ('"+id+"','"+id_detail_bulletin+"','"+note+"','"+appreciation+"');";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
                }catch(SQLException e){
            // Si il y a une erreur : Vérification si l'objet est déja dans la table
            Connexion maConnexion  = new Connexion(dbName,userName,password);
            String verif = "SELECT id FROM evaluation WHERE id = '"+id+"';";
            ArrayList liste = maConnexion.remplirChampsTable(verif);
            
            // Si la liste n'est pas vide : l'objet existe déja dans la table
            if (!liste.isEmpty()){
                throw new DejaExistant();
            }
            
            // Sinon : il y a une erreur de clé externe
            else{
                throw new ErreurCleEtrangere();
            }
        }
    }
    
    
    
    //      METHODE DE SUPPRESSION DANS LA BASE DE DONNEE
    
    /** Méthodes de suppression d'une année scolaire
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerAnnee(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM annee_scolaire WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de suppression d'une Ecole
     * 
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerEcole(String nom) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM ecole WHERE nom='"+nom+"';";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de suppression d'un trimestre
     * 
     * @param num
     * @param id_annee
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerTrimestre(int num, int id_annee) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM trimestre WHERE numero="+num+" AND id_annee_scolaire="+id_annee+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de suppression d'un niveau
     * 
     * @param nom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerNiveau(String nom) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM niveau WHERE nom ='"+nom+"';";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de suppression d'une classe
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerClasse(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM classe WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de supression d'une discipline
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerDiscipline(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM discipline WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de supression d'une personne
     * 
     * @param nom
     * @param prenom
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerPersonne(String nom, String prenom) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM personne WHERE nom='"+nom+"' AND prenom='"+prenom+"';";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthode de suppression d'un enseignant
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerEnseignant(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM enseignement WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de supression d'une inscription
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerInscription(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM inscription WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de supression d'un bulletin
     * 
     * @param id_trimestre
     * @param id_inscription
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerBulletin(int id_trimestre, int id_inscription) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM bulletin WHERE id_trimestre="+id_trimestre+" AND id_inscription = "+id_inscription+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de supression d'un detail de Bulletin
     * 
     * @param appreciation
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerDetailBulletin(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM detail_bulletin WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    /** Méthodes de suppression d'une evaluation
     * 
     * @param id
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void supprimerEvaluation(int id) throws SQLException, ClassNotFoundException{
        try{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "DELETE FROM evaluation WHERE id="+id+";";
        // Execution de la mise à jour
        maConnexion.executeUpdate(req);
        }catch(SQLException e){
            
        }
    }
    
    
    /*public void modifierEleve(String nom, String prenom) throws SQLException, ClassNotFoundException{
       // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
        // Création de la requete SQL
        String req = "SELECT * FROM personne WHERE nom='"+nom+"' AND prenom='"+prenom+"';";
        ArrayList liste = maConnexion.remplirChampsRequete(req);
        for (int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }
    }
    */

    //      METHODES DE MODIFICATIONS
    
    /** Méthode permettant de changer un élève de classe
     * 
     * @param nom
     * @param prenom
     * @param nom_classe La nouvelle classe de l'élève
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void modifierClasse(String nom, String prenom, String nom_classe) throws SQLException, ClassNotFoundException{
        // Objet type connexion -> lien avec la base de donnée
        Connexion maConnexion  = new Connexion(dbName,userName,password);
       
        // Recherche de l'ID_personne d'un élève
        String req1 = "SELECT id FROM personne WHERE nom='"+nom+"' AND prenom='"+prenom+"';";
        ArrayList<String> liste1 = maConnexion.remplirChampsRequete(req1);
        String id_personne = liste1.get(0);
        
        // Recherche de l'ID_classe de la nouvelle classe de l'élève
        String req2 = "SELECT id FROM classe WHERE nom='"+nom_classe+"';";
        ArrayList<String> liste2 = maConnexion.remplirChampsRequete(req2);
        String id_classe = liste2.get(0);
        
        // Modification de la classe
        String req3 = "UPDATE inscription SET id_classe = '"+id_classe+"' WHERE id_personne = '"+id_personne+"';";
        maConnexion.executeUpdate(req3);
        
    }
}
