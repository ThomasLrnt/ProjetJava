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
        
        //                   TEST DES FONCTIONS
        
        
        // maMaj.ajoutAnnee(20172018); OK
        // maMaj.ajoutEcole(1, "ECE Paris"); OK
        // maMaj.ajoutDiscipline(1, "Projet Java"); OK
        // maMaj.ajoutTrimestre(2, 2, 62019, 72020, 20182019); OK
        // maMaj.ajoutNiveau(42, "ING3"); OK
        // maMaj.ajoutClasse(1, "ING3 TDS9", 1, 42, 20182019); OK
        // maMaj.ajoutPersonne(13, "Descottes", "Martin", "Enseigant"); OK
        // maMaj.ajoutPersonne(12, "Laurent", "Thomas", "Eleve"); OK
        // maMaj.ajoutEnseignant(1, 1, 1, 13); OK
        // maMaj.ajoutInscription(1, 1, 12); OK
        // maMaj.ajoutBulletin(1, 1, 1, "Mon appreciation est positive"); OK
        // maMaj.ajoutDetailBulletin(1, 1, 1, "Mon appreciation est très positive !"); OK
        // maMaj.ajoutEvaluation(1, 1, 19, "Mon appreciation est extrèmement positive !!"); OK
        
        // maMaj.supprimerEvaluation(1); OK
        // maMaj.supprimerDetailBulletin(1); OK
        // maMaj.supprimerBulletin(1, 1); OK
        // maMaj.supprimerInscription(1); OK
        // maMaj.supprimerEnseignant(1); OK
        // maMaj.supprimerPersonne("Descottes", "Martin"); OK
        // maMaj.supprimerPersonne("Laurent", "Thomas"); OK
        // maMaj.supprimerClasse(1); OK
        // maMaj.supprimerNiveau("ING3"); OK
        // maMaj.supprimerTrimestre(2, 20182019); OK
        // maMaj.supprimerDiscipline(1); OK
        // maMaj.supprimerEcole("ECE Paris"); OK
        // maMaj.supprimerAnnee(20172018); OK
        
        
        
    }
    
}
