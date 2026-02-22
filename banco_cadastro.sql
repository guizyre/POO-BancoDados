-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: localhost    Database: cadastro
-- ------------------------------------------------------
-- Server version	8.4.7

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dados`
--

DROP TABLE IF EXISTS `dados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  `profissao` varchar(30) DEFAULT NULL,
  `altura` decimal(3,2) DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  `nascimento` date DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `nacionalidade` varchar(20) DEFAULT 'Brasil',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados`
--

LOCK TABLES `dados` WRITE;
/*!40000 ALTER TABLE `dados` DISABLE KEYS */;
INSERT INTO `dados` VALUES (1,'Luffy',NULL,1.27,68.40,'2010-05-11','M','Brasil'),(2,'Guilherme','enginer computer',1.73,70.40,'2004-03-22','M','Brasil'),(3,'hillary','eng comput',1.37,65.00,'2006-05-10','F','Brasil'),(4,'ph','Programadora',1.65,62.00,'1998-05-15','F','Brasil'),(5,'Carlos Eduardo','Engenheiro',1.82,85.50,'1990-11-22','M','Brasil'),(6,'Mariana Silva','Designer',1.60,55.20,'2001-02-10','F','Portugal'),(7,'Ricardo Oliveira','Mecânico',1.75,78.00,'1985-07-30','M','Brasil'),(8,'Juliana Costa','Médica',1.68,60.40,'1993-04-12','F','Brasil'),(9,'Lucas Ferreira','Analista',1.78,72.10,'1996-09-05','M','Brasil'),(10,'Fernanda Lima','Professora',1.72,65.80,'1988-12-01','F','Angola'),(11,'Ggabriel Souza','Estudante',1.75,70.00,'2004-01-20','M','Brasil'),(12,'Enzo Gabriel','Estudante',1.70,65.00,'2005-03-12','M','Brasil'),(13,'Valentina Pinheiro','Arquiteta',1.62,58.50,'1992-07-25','F','Brasil'),(14,'João Pedro','Caminhoneiro',1.78,92.00,'1980-01-15','M','Brasil'),(15,'Maria Alice','Advogada',1.65,60.20,'1995-10-30','F','Brasil'),(16,'Heitor Silva','Engenheiro',1.80,84.00,'1988-04-18','M','Brasil'),(17,'Laura Martins','Nutricionista',1.68,63.70,'1993-09-22','F','Portugal'),(18,'Arthur Miguel','Padeiro',1.72,75.00,'1997-12-05','M','Brasil'),(19,'Sophia Rocha','Veterinária',1.60,55.40,'1999-06-14','F','Brasil'),(20,'Davi Lucca','Programador',1.75,70.80,'2000-08-01','M','Brasil'),(21,'Heloísa Fontes','Professora',1.71,67.20,'1985-02-28','F','Angola'),(22,'Bernardo Lima','Analista',1.79,81.30,'1994-11-10','M','Brasil'),(23,'Manuela Dias','Designer',1.63,57.00,'2001-05-20','F','Brasil'),(24,'Gabriel Henrique','Mecânico',1.77,88.50,'1987-03-08','M','Brasil'),(25,'Alice Vitória','Enfermeira',1.66,61.20,'1996-08-14','F','Brasil'),(26,'Samuel Costa','Vendedor',1.74,76.90,'1991-01-25','M','Brasil'),(27,'Lorena Sales','Psicóloga',1.64,59.80,'1990-06-30','F','Portugal'),(28,'João Lucas','Bombeiro',1.81,90.00,'1989-09-12','M','Brasil'),(29,'Lívia Ribeiro','Contadora',1.67,64.50,'1998-04-05','F','Brasil'),(30,'Pedro Henrique','Cozinheiro',1.73,79.20,'1995-07-18','M','Brasil'),(31,'Giovanna Mello','Esteticista',1.61,54.00,'2002-12-01','F','Brasil'),(32,'Gustavo Paiva','Eletricista',1.76,82.10,'1986-10-15','M','Brasil'),(33,'Beatriz Souza','Secretária',1.69,66.00,'1997-02-22','F','Brasil'),(34,'Isaac Novaes','Músico',1.78,73.50,'2000-03-03','M','Espanha'),(35,'Cecília Duarte','Fotógrafa',1.62,56.70,'2001-09-09','F','Brasil'),(36,'Vinícius Jr','Atleta',1.83,80.00,'2000-07-12','M','Brasil'),(37,'Maitê Alencar','Modelo',1.75,58.00,'2003-11-20','F','Brasil'),(38,'Joaquim Neto','Agricultor',1.70,77.40,'1975-05-14','M','Brasil'),(39,'Helena Ramos','Juíza',1.68,62.90,'1982-08-30','F','Brasil'),(40,'Caio Augusto','Dentista',1.77,78.60,'1994-06-17','M','Brasil'),(41,'Isadora Porto','Jornalista',1.65,59.00,'1996-01-11','F','Brasil'),(42,'Levi Santos','Pedreiro',1.72,85.00,'1984-04-25','M','Brasil'),(43,'Antonella Lira','Artesã',1.59,53.20,'1999-02-08','F','Brasil'),(44,'Yuri Martins','Piloto',1.80,76.00,'1993-10-12','M','Rússia'),(45,'Clarice Lis','Escritora',1.64,55.50,'1980-12-10','F','Brasil'),(46,'Ruan Pablo','Barbeiro',1.74,71.00,'2004-07-07','M','Brasil'),(47,'Iris Valentim','Florista',1.66,58.80,'1992-03-19','F','Brasil'),(48,'Nicolas Cage','Ator',1.82,84.50,'1964-01-07','M','EUA'),(49,'Larissa Mano','Cantora',1.60,52.00,'2000-12-28','F','Brasil'),(50,'Tiago Abrav','Empresário',1.79,95.00,'1987-10-21','M','Brasil'),(51,'Rebeca Andrade','Ginasta',1.55,50.00,'1999-05-08','F','Brasil'),(52,'Bruno Garcia','Policial',1.85,89.00,'1991-09-14','M','Brasil'),(53,'Camila Queir','Atriz',1.77,60.00,'1993-06-27','F','Brasil'),(54,'Igor Kanane','Cantor',1.76,75.00,'1994-01-01','M','Brasil'),(55,'Vitoria Strada','Modelo',1.72,57.00,'1996-10-12','F','Brasil'),(56,'Daniel Alves','Jogador',1.72,70.00,'1983-05-06','M','Brasil'),(57,'Jade Picon','Influencer',1.65,55.00,'2001-09-24','F','Brasil'),(58,'Luan Santana','Cantor',1.82,78.00,'1991-03-13','M','Brasil'),(59,'Anitta Silva','Cantora',1.62,58.00,'1993-03-30','F','Brasil'),(60,'Neymar Junior','Jogador',1.75,68.00,'1992-02-05','M','Brasil'),(61,'Bruna Marque','Atriz',1.70,56.00,'1995-08-04','F','Brasil'),(62,'Casimiro Miguel','Streamer',1.84,110.00,'1993-10-20','M','Brasil'),(63,'Virginia Fons','Youtuber',1.67,60.00,'1999-04-06','F','Brasil'),(64,'Whindersson N','Humorista',1.75,75.00,'1995-01-05','M','Brasil'),(65,'Gisele Bund','Top Model',1.80,57.00,'1980-07-20','F','Brasil'),(66,'Cristiano R','Atleta',1.87,83.00,'1985-02-05','M','Portugal'),(67,'Lionel Messi','Atleta',1.70,72.00,'1987-06-24','M','Argentina'),(68,'Marta Vieira','Atleta',1.62,57.00,'1986-02-19','F','Brasil'),(69,'Silvio Santos','Apresentador',1.78,80.00,'1930-12-12','M','Brasil'),(70,'Xuxa Meneghel','Apresentadora',1.77,65.00,'1963-03-27','F','Brasil'),(71,'dunga','Jogador',1.76,76.40,'1998-03-22','M','Brasil'),(72,'cafú','jogador',1.85,82.00,'1983-02-04','M','Brasil'),(73,'meuAmor','namorada',1.65,63.00,'2006-05-15','f','Brasil');
/*!40000 ALTER TABLE `dados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-02-22 16:13:33
