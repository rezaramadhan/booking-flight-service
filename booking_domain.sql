-- MySQL dump 10.13  Distrib 5.7.16, for Win64 (x86_64)
--
-- Host: localhost    Database: booking_domain
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `airports`
--

DROP TABLE IF EXISTS `airports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `airports` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(64) NOT NULL,
  `LocationId` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airports`
--

LOCK TABLES `airports` WRITE;
/*!40000 ALTER TABLE `airports` DISABLE KEYS */;
INSERT INTO `airports` VALUES (1,'Pattimura Airport',80),(2,'Syamsudin Noor Airport',68),(3,'Husein Sastranegara International Airport',40),(4,'Fatmawati Soekarno Airport',31),(5,'Sultan Muhammad Salahuddin Airport',82),(6,'Sultan Aji Muhammad Sulaiman Airport',70),(7,'Hang Nadim International Airport',74),(8,'Sultan Iskandarmuda International Airport',1),(9,'Betoambari Airport',93),(10,'PT Badak Bontang Airport',71),(11,'Penggung Airport',44),(12,'Sentani Airport',86),(13,'Ngurah Rai International Airport',25),(14,'Pinang Kampai Airport',87),(15,'Haluoleo Airport',94),(16,'El Tari Airport',84),(17,'Selaparang Airport',83),(18,'Lombok Praya International Airport',83),(19,'Dumatubun Airport',81),(20,'Sam Ratulangi International Airport',97),(21,'Abdul Rachman Saleh Airport',60),(22,'Sultan Syarif Kasim II International Airport',88),(23,'Tjilik Riwut Airport',69),(24,'Mutiara SIS Al-Jufrie Airport',92),(25,'Supadio Airport',65),(26,'Adisumarmo International Airport',54),(27,'Domine Edward Osok Airport',85),(28,'Achmad Yani International Airport',53),(29,'Temindung Airport',72),(30,'Juanda International Airport',64),(31,'Radin Inten II International Airport',76),(32,'Juwata International Airport',73),(33,'Tasikmalaya Airport',47),(34,'Sultan Babullah Airport',78),(35,'Sultan Hasanuddin International Airport',89);
/*!40000 ALTER TABLE `airports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookings` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Status` varchar(25) NOT NULL,
  `PassengerName` varchar(64) NOT NULL,
  `FlightId` int(11) DEFAULT NULL,
  `UserId` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Quota` int(11) NOT NULL,
  `Company` varchar(64) NOT NULL,
  `Price` double NOT NULL,
  `Quality` varchar(25) NOT NULL,
  `BoardingTime` date NOT NULL,
  `DepartureId` int(11) NOT NULL,
  `DestinationId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `bookingId` int(11) DEFAULT NULL,
  `isPaid` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locations` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Province` varchar(25) NOT NULL,
  `Town` varchar(25) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` VALUES (1,'Aceh','Banda Aceh'),(2,'Aceh','Langsa'),(3,'Aceh','Lhokseumawe'),(4,'Aceh','Meulaboh'),(5,'Aceh','Sabang'),(6,'Aceh','Subulussalam'),(7,'Aceh','Aceh Barat'),(8,'Aceh','Aceh Barat Daya'),(9,'Aceh','Aceh Besar'),(10,'Aceh','Aceh Jaya'),(11,'Aceh','Aceh Selatan'),(12,'Aceh','Aceh Singkil'),(13,'Aceh','Aceh Tamiang'),(14,'Aceh','Aceh Tengah'),(15,'Aceh','Aceh Tenggara'),(16,'Aceh','Aceh Timur'),(17,'Aceh','Aceh Utara'),(18,'Aceh','Bener Meriah'),(19,'Aceh','Bireuen'),(20,'Aceh','Gayo Lues'),(21,'Aceh','Nagan Raya'),(22,'Aceh','Pidie'),(23,'Aceh','Pidie Jaya'),(24,'Aceh','Simeulue'),(25,'Bali','Denpasar'),(26,'Bangka Belitung','Pangkalpinang'),(27,'Banten','Cilegon'),(28,'Banten','Serang'),(29,'Banten','Tangerang Selatan'),(30,'Banten','Tangerang'),(31,'Bengkulu','Bengkulu'),(32,'Gorontalo','Gorontalo'),(33,'Jakarta','Kota Administrasi Jakarta'),(34,'Jakarta','Kota Administrasi Jakarta'),(35,'Jakarta','Kota Administrasi Jakarta'),(36,'Jakarta','Kota Administrasi Jakarta'),(37,'Jakarta','Kota Administrasi Jakarta'),(38,'Jambi','Sungai Penuh'),(39,'Jambi','Jambi'),(40,'Jawa Barat','Bandung'),(41,'Jawa Barat','Bekasi'),(42,'Jawa Barat','Bogor'),(43,'Jawa Barat','Cimahi'),(44,'Jawa Barat','Cirebon'),(45,'Jawa Barat','Depok'),(46,'Jawa Barat','Sukabumi'),(47,'Jawa Barat','Tasikmalaya'),(48,'Jawa Barat','Banjar'),(49,'Jawa Tengah','Magelang'),(50,'Jawa Tengah','Pekalongan'),(51,'Jawa Tengah','Purwokerto'),(52,'Jawa Tengah','Salatiga'),(53,'Jawa Tengah','Semarang'),(54,'Jawa Tengah','Surakarta'),(55,'Jawa Tengah','Tegal'),(56,'Jawa Timur','Batu'),(57,'Jawa Timur','Blitar'),(58,'Jawa Timur','Kediri'),(59,'Jawa Timur','Madiun'),(60,'Jawa Timur','Malang'),(61,'Jawa Timur','Mojokerto'),(62,'Jawa Timur','Pasuruan'),(63,'Jawa Timur','Probolinggo'),(64,'Jawa Timur','Surabaya'),(65,'Kalimantan Barat','Pontianak'),(66,'Kalimantan Barat','Singkawang'),(67,'Kalimantan Selatan','Banjarbaru'),(68,'Kalimantan Selatan','Banjarmasin'),(69,'Kalimantan Tengah','Palangkaraya'),(70,'Kalimantan Timur','Balikpapan'),(71,'Kalimantan Timur','Bontang'),(72,'Kalimantan Timur','Samarinda'),(73,'Kalimantan Utara','Tarakan'),(74,'Kepulauan Riau','Batam'),(75,'Kepulauan Riau','Tanjungpinang'),(76,'Lampung','Bandar Lampung'),(77,'Lampung','Metro'),(78,'Maluku Utara','Ternate'),(79,'Maluku Utara','Tidore Kepulauan'),(80,'Maluku','Ambon'),(81,'Maluku','Tual'),(82,'Nusa Tenggara Barat','Bima'),(83,'Nusa Tenggara Barat','Mataram'),(84,'Nusa Tenggara Timur','Kupang'),(85,'Papua Barat','Sorong'),(86,'Papua','Jayapura'),(87,'Riau','Dumai'),(88,'Riau','Pekanbaru'),(89,'Sulawesi Selatan','Makassar'),(90,'Sulawesi Selatan','Palopo'),(91,'Sulawesi Selatan','Parepare'),(92,'Sulawesi Tengah','Palu'),(93,'Sulawesi Tenggara','Bau-Bau'),(94,'Sulawesi Tenggara','Kendari'),(95,'Sulawesi Utara','Bitung'),(96,'Sulawesi Utara','Kotamobagu'),(97,'Sulawesi Utara','Manado'),(98,'Sulawesi Utara','Tomohon'),(99,'Sumatera Barat','Bukittinggi'),(100,'Sumatera Barat','Padang'),(101,'Sumatera Barat','Padangpanjang'),(102,'Sumatera Barat','Pariaman'),(103,'Sumatera Barat','Payakumbuh'),(104,'Sumatera Barat','Sawahlunto'),(105,'Sumatera Barat','Solok'),(106,'Sumatera Barat','Agam'),(107,'Sumatera Barat','Dharmasraya'),(108,'Sumatera Barat','Kepulauan Mentawai'),(109,'Sumatera Barat','Lima Puluh Kota'),(110,'Sumatera Barat','Padang Pariaman'),(111,'Sumatera Barat','Pasaman'),(112,'Sumatera Barat','Pasaman Barat'),(113,'Sumatera Barat','Pesisir Selatan'),(114,'Sumatera Barat','Sijunjung'),(115,'Sumatera Barat','Solok'),(116,'Sumatera Barat','Solok Selatan'),(117,'Sumatera Barat','Tanah Datar'),(118,'Sumatera Selatan','Lubuklinggau'),(119,'Sumatera Selatan','Pagaralam'),(120,'Sumatera Selatan','Palembang'),(121,'Sumatera Selatan','Prabumulih'),(122,'Sumatera Utara','Binjai'),(123,'Sumatera Utara','Medan'),(124,'Sumatera Utara','Padang Sidempuan'),(125,'Sumatera Utara','Pematangsiantar'),(126,'Sumatera Utara','Sibolga'),(127,'Sumatera Utara','Tanjungbalai'),(128,'Sumatera Utara','Tebingtinggi'),(129,'Sumatera Utara','Asahan'),(130,'Sumatera Utara','Batubara'),(131,'Sumatera Utara','Dairi'),(132,'Sumatera Utara','Deli Serdang'),(133,'Sumatera Utara','Humbang Hasundutan'),(134,'Sumatera Utara','Karo'),(135,'Sumatera Utara','Labuhanbatu'),(136,'Sumatera Utara','Labuhanbatu Selatan'),(137,'Sumatera Utara','Labuhanbatu Utara'),(138,'Sumatera Utara','Langkat'),(139,'Sumatera Utara','Mandailing Natal'),(140,'Sumatera Utara','Nias'),(141,'Sumatera Utara','Nias Barat'),(142,'Sumatera Utara','Nias Selatan'),(143,'Sumatera Utara','Nias Utara'),(144,'Sumatera Utara','Padang Lawas'),(145,'Sumatera Utara','Padang Lawas Utara'),(146,'Sumatera Utara','Pakpak Bharat'),(147,'Sumatera Utara','Samosir'),(148,'Sumatera Utara','Serdang Bedagai'),(149,'Sumatera Utara','Simalungun'),(150,'Sumatera Utara','Tapanuli Selatan'),(151,'Sumatera Utara','Tapanuli Tengah'),(152,'Sumatera Utara','Tapanuli Utara'),(153,'Sumatera Utara','Toba Samosir'),(154,'Yogyakarta','Yogyakarta');
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(64) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `Password` varchar(64) NOT NULL,
  `token` varchar(64) DEFAULT NULL,
  `validDate` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-20 16:57:05
