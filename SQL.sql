-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: filemanagement
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `file`
--

DROP TABLE IF EXISTS `file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `file` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_data_time` date DEFAULT NULL,
  `file_size` double DEFAULT NULL,
  `mime` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `number_of_download` int DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `version` int DEFAULT NULL,
  `version_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file`
--

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;
INSERT INTO `file` VALUES (21,'2022-01-04',1161670,'image/jpeg','IMG_2187.JPG',5,'F:\\Project\\filemanagement\\JSD\\images\\21/IMG_2187.JPG','uploaded',1,'IMG_2187.JPG'),(22,'2022-01-04',96557,'image/jpeg','IMG_2163.JPG',2,'F:\\Project\\filemanagement\\JSD\\images\\22/IMG_2163.JPG','uploaded',1,'IMG_2163.JPG'),(23,'2022-01-04',22031153,'video/quicktime','IMG_0508.MOV',0,'F:\\Project\\filemanagement\\JSD\\images\\23/IMG_0508.MOV','uploaded',1,'IMG_0508.MOV'),(24,'2022-01-04',346279,'image/jpeg','IMG_0471.JPG',0,'F:\\Project\\filemanagement\\JSD\\images\\24/IMG_0471.JPG','uploaded',1,'IMG_0471.JPG'),(25,'2022-01-04',346279,'image/jpeg','IMG_0471.JPG',1,'F:\\Project\\filemanagement\\JSD\\images\\25/IMG_0471.JPG','uploaded',2,'IMG_0471.JPG');
/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setting`
--

DROP TABLE IF EXISTS `setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setting` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `item_per_page` bigint DEFAULT NULL,
  `last_updated_time` date DEFAULT NULL,
  `max_file_size` double DEFAULT NULL,
  `mime_type_allowed` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setting`
--

LOCK TABLES `setting` WRITE;
/*!40000 ALTER TABLE `setting` DISABLE KEYS */;
INSERT INTO `setting` VALUES (1,10,'2021-12-31',500,'image'),(2,10,'2021-12-31',500,'image'),(3,10,'2021-12-31',500,'text'),(4,10,'2022-01-01',200,'image'),(5,5,'2022-01-01',5000,'image'),(6,12,'2022-01-01',2000,'image'),(7,12,'2022-01-01',2000,'image'),(8,12,'2022-01-01',2000,'image'),(9,12,'2022-01-01',2000,'image'),(10,10,'2022-01-02',500,'video'),(11,10,'2022-01-02',500,'audio'),(12,10,'2022-01-02',500,'image'),(13,10,'2022-01-02',500,'video'),(14,10,'2022-01-02',500,'image'),(15,10,'2022-01-02',500,'video'),(16,10,'2022-01-02',500,'image'),(17,10,'2022-01-04',500,'video'),(18,10,'2022-01-04',500,'image');
/*!40000 ALTER TABLE `setting` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-04 16:05:33
