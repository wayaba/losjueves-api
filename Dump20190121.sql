-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: losjueves
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game` (
  `id` bigint(20) NOT NULL,
  `id_game_date` bigint(20) NOT NULL,
  `id_player` bigint(20) NOT NULL,
  `id_result` bigint(20) DEFAULT NULL,
  `id_team` bigint(20) NOT NULL,
  `id_side` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKloboq0mloriaxvc6urx1mffcr` (`id_game_date`),
  KEY `FK6g8gp656ttwykjwv4u3gh9dey` (`id_player`),
  KEY `FKeaxs9dtyo59npyk2vga54w6q1` (`id_result`),
  KEY `FK3bwq84svbd346dbpcakn8fref` (`id_side`),
  KEY `FKbkf6jqh7qpw1qo5vyuynnic5u` (`id_team`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (12,2,11,1,1,1),(11,2,15,1,1,1),(10,1,19,1,2,2),(9,1,4,1,2,2),(8,1,11,1,2,2),(7,1,5,1,2,2),(6,1,15,1,2,2),(5,1,17,3,1,1),(4,1,18,3,1,1),(3,1,16,3,1,1),(2,1,12,3,1,1),(1,1,1,3,1,1),(13,2,3,1,1,1),(14,2,20,1,1,1),(15,2,16,1,1,1),(16,2,19,3,2,2),(17,2,13,3,2,2),(18,2,14,3,2,2),(19,2,18,3,2,2),(20,2,1,3,2,2),(21,3,16,1,2,1),(22,3,18,1,2,1),(23,3,1,1,2,1),(24,3,21,1,2,1),(25,3,22,1,2,1),(26,3,15,3,1,2),(27,3,3,3,1,2),(28,3,20,3,1,2),(29,3,19,3,1,2),(30,3,2,3,1,2),(31,4,15,1,1,2),(32,4,18,1,1,2),(33,4,1,1,1,2),(34,4,19,1,1,2),(35,4,14,1,1,2),(36,4,16,3,2,1),(37,4,5,3,2,1),(38,4,4,3,2,1),(39,4,3,3,2,1),(40,4,20,3,2,1);
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game_date`
--

DROP TABLE IF EXISTS `game_date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_date` (
  `id` bigint(20) NOT NULL,
  `date` datetime NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `number` int(11) NOT NULL,
  `id_player` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9mt3tfi1mo94lq3ie4bjo9e4x` (`id_player`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_date`
--

LOCK TABLES `game_date` WRITE;
/*!40000 ALTER TABLE `game_date` DISABLE KEYS */;
INSERT INTO `game_date` VALUES (1,'2018-12-06 21:00:00','Semana 1',1,15),(2,'2018-12-20 21:00:00','Semana 2',2,11),(3,'2018-12-27 21:00:00','Semana 3',3,16),(4,'2019-01-03 21:00:00','Semana 4',4,15),(5,'2019-01-10 21:00:00','Semana 5',5,1);
/*!40000 ALTER TABLE `game_date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game_date_detail`
--

DROP TABLE IF EXISTS `game_date_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game_date_detail` (
  `id` bigint(20) NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `number` int(11) NOT NULL,
  `result` varchar(255) DEFAULT NULL,
  `team` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game_date_detail`
--

LOCK TABLES `game_date_detail` WRITE;
/*!40000 ALTER TABLE `game_date_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `game_date_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (10);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player` (
  `id` bigint(20) NOT NULL,
  `birth` datetime DEFAULT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `nick_name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES (1,'1984-05-10 21:00:00','Pablo','Pedraza','Pablito','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(2,'1982-03-19 21:00:00','Sebastian','Panontin','Panon','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(3,'1982-03-19 21:00:00','Arnaldo','Montiel','Arnol','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(12,'1984-05-10 00:00:00','Fer','Alto','Fer','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(4,'1982-03-19 21:00:00','Sebastian','Al','Seba','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(5,'1982-03-19 21:00:00','Juan Pablo','Conde','Juampi','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(11,'1982-03-19 21:00:00','Roberto','PoroTo','Poro','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(13,'1982-03-19 21:00:00','Augusto','Sarlanga','Augusto','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(14,'1982-03-19 21:00:00','Martin','Pedraza','Tincho','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(15,'1982-03-19 21:00:00','Juan','Bauti','Juan B','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(16,'1982-03-19 21:00:00','Ezequiel','Oz','Osito','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(17,'1982-03-19 21:00:00','Santiago','Sava','Santi','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(18,'1982-03-19 21:00:00','Bird','Misterio','Birdman','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(19,'1982-03-19 21:00:00','Santiago','Sava','Sava','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(20,'1982-03-19 21:00:00','Gue','Vo','Guevo','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(21,'1982-03-19 21:00:00','Gonza','Fer','Gonza','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa'),(22,'1982-03-19 21:00:00','Ruso','Rusovski','Ruso','Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa');
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_detail`
--

DROP TABLE IF EXISTS `player_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_detail` (
  `nick_name` varchar(255) NOT NULL,
  `draw` varchar(255) DEFAULT NULL,
  `lose` varchar(255) DEFAULT NULL,
  `pj` varchar(255) DEFAULT NULL,
  `points` varchar(255) DEFAULT NULL,
  `win` varchar(255) DEFAULT NULL,
  `description` varchar(255) NOT NULL,
  `mvp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nick_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_detail`
--

LOCK TABLES `player_detail` WRITE;
/*!40000 ALTER TABLE `player_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `player_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `result` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `points` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (1,'Ganan',2),(2,'Empatan',1),(3,'Pierden',0);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `side`
--

DROP TABLE IF EXISTS `side`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `side` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `side`
--

LOCK TABLES `side` WRITE;
/*!40000 ALTER TABLE `side` DISABLE KEYS */;
INSERT INTO `side` VALUES (1,'Calle'),(2,'Buffet');
/*!40000 ALTER TABLE `side` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_view`
--

DROP TABLE IF EXISTS `table_view`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `table_view` (
  `nick_name` varchar(255) NOT NULL,
  `draw` varchar(255) DEFAULT NULL,
  `lose` varchar(255) DEFAULT NULL,
  `pj` varchar(255) DEFAULT NULL,
  `points` varchar(255) DEFAULT NULL,
  `win` varchar(255) DEFAULT NULL,
  `id_player` bigint(20) NOT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`nick_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_view`
--

LOCK TABLES `table_view` WRITE;
/*!40000 ALTER TABLE `table_view` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_view` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Rojo'),(2,'Azul');
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-21 14:29:03
