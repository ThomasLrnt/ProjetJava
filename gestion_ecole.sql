-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 08 juin 2019 à 13:54
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_ecole`
--

-- --------------------------------------------------------

--
-- Structure de la table `annee_scolaire`
--

DROP TABLE IF EXISTS `annee_scolaire`;
CREATE TABLE IF NOT EXISTS `annee_scolaire` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_trimestre` int(11) NOT NULL,
  `id_inscription` int(11) NOT NULL,
  `appreciation` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_inscription` (`id_inscription`),
  KEY `id_trimestre` (`id_trimestre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `id_ecole` int(11) NOT NULL,
  `id_niveau` int(11) NOT NULL,
  `id_annee_scolaire` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_annee_scolaire` (`id_annee_scolaire`),
  KEY `id_ecole` (`id_ecole`),
  KEY `id_niveau` (`id_niveau`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `detail_bulletin`
--

DROP TABLE IF EXISTS `detail_bulletin`;
CREATE TABLE IF NOT EXISTS `detail_bulletin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_bulletin` int(11) NOT NULL,
  `id_enseignement` int(11) NOT NULL,
  `appreciation` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_bulletin` (`id_bulletin`),
  KEY `id_enseignement` (`id_enseignement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `discipline`;
CREATE TABLE IF NOT EXISTS `discipline` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

DROP TABLE IF EXISTS `ecole`;
CREATE TABLE IF NOT EXISTS `ecole` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_classe` int(11) NOT NULL,
  `id_discipline` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_classe` (`id_classe`),
  KEY `id_discipline` (`id_discipline`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_detail_bulletin` int(11) NOT NULL,
  `note` int(11) NOT NULL,
  `appreciation` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_detail_bulletin` (`id_detail_bulletin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_classe` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_classe` (`id_classe`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `type` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `debut` int(11) NOT NULL,
  `fin` int(11) NOT NULL,
  `id_annee_scolaire` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_annee_scolaire` (`id_annee_scolaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bulletin`
--
ALTER TABLE `bulletin`
  ADD CONSTRAINT `bulletin_ibfk_1` FOREIGN KEY (`id_inscription`) REFERENCES `inscription` (`id`),
  ADD CONSTRAINT `bulletin_ibfk_2` FOREIGN KEY (`id_trimestre`) REFERENCES `trimestre` (`id`);

--
-- Contraintes pour la table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_ibfk_1` FOREIGN KEY (`id_annee_scolaire`) REFERENCES `annee_scolaire` (`id`),
  ADD CONSTRAINT `classe_ibfk_2` FOREIGN KEY (`id_ecole`) REFERENCES `ecole` (`id`),
  ADD CONSTRAINT `classe_ibfk_3` FOREIGN KEY (`id_niveau`) REFERENCES `niveau` (`id`);

--
-- Contraintes pour la table `detail_bulletin`
--
ALTER TABLE `detail_bulletin`
  ADD CONSTRAINT `detail_bulletin_ibfk_1` FOREIGN KEY (`id_bulletin`) REFERENCES `bulletin` (`id`),
  ADD CONSTRAINT `detail_bulletin_ibfk_2` FOREIGN KEY (`id_enseignement`) REFERENCES `enseignement` (`id`);

--
-- Contraintes pour la table `enseignement`
--
ALTER TABLE `enseignement`
  ADD CONSTRAINT `enseignement_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `enseignement_ibfk_2` FOREIGN KEY (`id_discipline`) REFERENCES `discipline` (`id`),
  ADD CONSTRAINT `enseignement_ibfk_3` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id`);

--
-- Contraintes pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD CONSTRAINT `evaluation_ibfk_1` FOREIGN KEY (`id_detail_bulletin`) REFERENCES `detail_bulletin` (`id`);

--
-- Contraintes pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD CONSTRAINT `inscription_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id`),
  ADD CONSTRAINT `inscription_ibfk_2` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id`);

--
-- Contraintes pour la table `trimestre`
--
ALTER TABLE `trimestre`
  ADD CONSTRAINT `trimestre_ibfk_1` FOREIGN KEY (`id_annee_scolaire`) REFERENCES `annee_scolaire` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
