-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 21, 2017 at 04:27 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `booking_domain`
--

-- --------------------------------------------------------

--
-- Table structure for table `airports`
--

CREATE TABLE `airports` (
  `Id` int(11) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `LocationId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airports`
--

INSERT INTO `airports` (`Id`, `Name`, `LocationId`) VALUES
(1, 'Pattimura Airport', 80),
(2, 'Syamsudin Noor Airport', 68),
(3, 'Husein Sastranegara International Airport', 40),
(4, 'Fatmawati Soekarno Airport', 31),
(5, 'Sultan Muhammad Salahuddin Airport', 82),
(6, 'Sultan Aji Muhammad Sulaiman Airport', 70),
(7, 'Hang Nadim International Airport', 74),
(8, 'Sultan Iskandarmuda International Airport', 1),
(9, 'Betoambari Airport', 93),
(10, 'PT Badak Bontang Airport', 71),
(11, 'Penggung Airport', 44),
(12, 'Sentani Airport', 86),
(13, 'Ngurah Rai International Airport', 25),
(14, 'Pinang Kampai Airport', 87),
(15, 'Haluoleo Airport', 94),
(16, 'El Tari Airport', 84),
(17, 'Selaparang Airport', 83),
(18, 'Lombok Praya International Airport', 83),
(19, 'Dumatubun Airport', 81),
(20, 'Sam Ratulangi International Airport', 97),
(21, 'Abdul Rachman Saleh Airport', 60),
(22, 'Sultan Syarif Kasim II International Airport', 88),
(23, 'Tjilik Riwut Airport', 69),
(24, 'Mutiara SIS Al-Jufrie Airport', 92),
(25, 'Supadio Airport', 65),
(26, 'Adisumarmo International Airport', 54),
(27, 'Domine Edward Osok Airport', 85),
(28, 'Achmad Yani International Airport', 53),
(29, 'Temindung Airport', 72),
(30, 'Juanda International Airport', 64),
(31, 'Radin Inten II International Airport', 76),
(32, 'Juwata International Airport', 73),
(33, 'Tasikmalaya Airport', 47),
(34, 'Sultan Babullah Airport', 78),
(35, 'Sultan Hasanuddin International Airport', 89);

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `Id` int(11) NOT NULL,
  `Status` varchar(25) NOT NULL,
  `PassengerName` varchar(64) NOT NULL,
  `FlightId` int(11) DEFAULT NULL,
  `UserId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`Id`, `Status`, `PassengerName`, `FlightId`, `UserId`) VALUES
(1, 'unpaid', 'Ezra Pennington', 45, 1),
(2, 'unpaid', 'Colver Acreman', 5, 2),
(3, 'unpaid', 'Francklyn O\'Reilly', 39, 3),
(4, 'unpaid', 'Porty Bissex', 4, 4),
(5, 'unpaid', 'Aurelie Hardwell', 49, 5),
(6, 'unpaid', 'Alvin Osgorby', 21, 6),
(7, 'unpaid', 'Christye Yarwood', 30, 7),
(8, 'unpaid', 'Brandy Leming', 92, 8),
(9, 'unpaid', 'Willem Hatliffe', 49, 9),
(10, 'unpaid', 'Rob Stoffels', 92, 10),
(11, 'unpaid', 'Tani Musk', 81, 1),
(12, 'unpaid', 'Godart Scrivinor', 1, 2),
(13, 'unpaid', 'Renaldo Colaco', 96, 3),
(14, 'unpaid', 'Tarrah Lumbers', 61, 4),
(15, 'unpaid', 'Dorrie Fritzer', 28, 5),
(16, 'paid', 'Nappy O\'Beirne', 79, 6),
(17, 'paid', 'Indira Sheryne', 95, 7),
(18, 'paid', 'Morgen Petasch', 79, 8),
(19, 'paid', 'Mathew Swinfen', 41, 9),
(20, 'paid', 'Conan Gatherell', 35, 10),
(21, 'paid', 'Jacquelin Dufall', 86, 1),
(22, 'paid', 'Mylo Juszczak', 13, 2),
(23, 'paid', 'Astra Pratley', 91, 3),
(24, 'paid', 'Arturo Clifft', 80, 4),
(25, 'paid', 'Brande Josland', 45, 5);

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `id` int(11) NOT NULL,
  `Quota` int(11) NOT NULL,
  `Company` varchar(64) NOT NULL,
  `Price` double NOT NULL,
  `Quality` varchar(25) NOT NULL,
  `BoardingTime` date NOT NULL,
  `DepartureId` int(11) NOT NULL,
  `DestinationId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`id`, `Quota`, `Company`, `Price`, `Quality`, `BoardingTime`, `DepartureId`, `DestinationId`) VALUES
(1, 140, 'Garuda Indonesia', 670000, 'Premium Economy', '2018-06-09', 21, 29),
(2, 80, 'Lion Air', 840000, 'Premium Economy', '2018-07-23', 35, 23),
(3, 50, 'Air Asia', 470000, 'Economy', '2018-08-22', 13, 14),
(4, 140, 'Batik Air', 1110000, 'Business', '2018-09-26', 16, 23),
(5, 140, 'Citilink', 1020000, 'Business', '2018-10-09', 7, 26),
(6, 100, 'Sriwijaya Air', 910000, 'Business', '2018-06-29', 31, 17),
(7, 130, 'Garuda Indonesia', 900000, 'Business', '2018-02-19', 17, 2),
(8, 130, 'Lion Air', 760000, 'Premium Economy', '2018-07-17', 3, 25),
(9, 70, 'Air Asia', 1140000, 'Business', '2017-12-21', 20, 2),
(10, 120, 'Batik Air', 920000, 'Business', '2018-02-24', 2, 22),
(11, 70, 'Citilink', 470000, 'Economy', '2018-03-24', 5, 7),
(12, 140, 'Sriwijaya Air', 900000, 'Business', '2018-04-07', 34, 11),
(13, 140, 'Garuda Indonesia', 1100000, 'Business', '2018-04-12', 33, 20),
(14, 50, 'Lion Air', 600000, 'Premium Economy', '2018-05-18', 13, 16),
(15, 60, 'Air Asia', 820000, 'Premium Economy', '2018-10-29', 23, 18),
(16, 100, 'Batik Air', 1000000, 'Business', '2018-03-19', 8, 20),
(17, 150, 'Citilink', 620000, 'Premium Economy', '2018-03-03', 18, 23),
(18, 60, 'Sriwijaya Air', 600000, 'Premium Economy', '2018-08-03', 34, 15),
(19, 50, 'Garuda Indonesia', 840000, 'Premium Economy', '2018-05-07', 12, 4),
(20, 80, 'Lion Air', 470000, 'Economy', '2018-04-14', 4, 13),
(21, 130, 'Air Asia', 510000, 'Economy', '2017-12-25', 17, 23),
(22, 80, 'Batik Air', 1150000, 'Business', '2018-07-20', 35, 12),
(23, 120, 'Citilink', 600000, 'Premium Economy', '2018-11-08', 1, 24),
(24, 130, 'Sriwijaya Air', 1140000, 'Business', '2018-03-05', 19, 26),
(25, 50, 'Garuda Indonesia', 1170000, 'Business', '2018-10-07', 7, 28),
(26, 60, 'Lion Air', 490000, 'Economy', '2018-01-24', 10, 15),
(27, 100, 'Air Asia', 690000, 'Premium Economy', '2018-11-16', 2, 3),
(28, 110, 'Batik Air', 950000, 'Business', '2018-01-06', 35, 14),
(29, 150, 'Citilink', 930000, 'Business', '2018-07-10', 29, 31),
(30, 120, 'Sriwijaya Air', 1160000, 'Business', '2018-10-25', 1, 25),
(31, 110, 'Garuda Indonesia', 740000, 'Premium Economy', '2018-07-15', 3, 11),
(32, 140, 'Lion Air', 1150000, 'Business', '2018-09-20', 28, 18),
(33, 130, 'Air Asia', 1180000, 'Business', '2018-04-16', 6, 35),
(34, 50, 'Batik Air', 730000, 'Premium Economy', '2018-11-13', 33, 10),
(35, 150, 'Citilink', 1190000, 'Business', '2018-04-14', 4, 21),
(36, 90, 'Sriwijaya Air', 1000000, 'Business', '2018-11-04', 34, 4),
(37, 120, 'Garuda Indonesia', 930000, 'Business', '2018-01-06', 16, 14),
(38, 70, 'Lion Air', 1110000, 'Business', '2018-02-05', 7, 16),
(39, 120, 'Air Asia', 1130000, 'Business', '2018-03-04', 2, 4),
(40, 130, 'Batik Air', 980000, 'Business', '2018-08-03', 22, 35),
(41, 130, 'Citilink', 1040000, 'Business', '2018-01-12', 22, 24),
(42, 150, 'Sriwijaya Air', 1040000, 'Business', '2018-04-03', 35, 10),
(43, 60, 'Garuda Indonesia', 910000, 'Business', '2018-03-04', 32, 28),
(44, 130, 'Lion Air', 1200000, 'Business', '2018-09-14', 21, 32),
(45, 110, 'Air Asia', 1100000, 'Business', '2017-12-06', 30, 13),
(46, 60, 'Batik Air', 540000, 'Economy', '2018-09-19', 23, 1),
(47, 110, 'Citilink', 1120000, 'Business', '2017-12-27', 9, 26),
(48, 120, 'Sriwijaya Air', 1080000, 'Business', '2018-07-16', 32, 1),
(49, 90, 'Garuda Indonesia', 1060000, 'Business', '2018-02-27', 3, 16),
(50, 130, 'Lion Air', 970000, 'Business', '2018-07-30', 5, 2),
(51, 80, 'Air Asia', 720000, 'Premium Economy', '2017-12-09', 28, 13),
(52, 120, 'Batik Air', 480000, 'Economy', '2018-11-08', 32, 15),
(53, 70, 'Citilink', 740000, 'Premium Economy', '2018-07-31', 17, 18),
(54, 60, 'Sriwijaya Air', 760000, 'Premium Economy', '2018-02-19', 7, 27),
(55, 70, 'Garuda Indonesia', 1090000, 'Business', '2018-01-12', 21, 23),
(56, 140, 'Lion Air', 540000, 'Economy', '2018-07-16', 24, 22),
(57, 50, 'Air Asia', 650000, 'Premium Economy', '2018-03-17', 33, 25),
(58, 120, 'Batik Air', 670000, 'Premium Economy', '2018-11-05', 32, 7),
(59, 100, 'Citilink', 510000, 'Economy', '2018-10-09', 22, 12),
(60, 110, 'Sriwijaya Air', 960000, 'Business', '2018-06-15', 24, 35),
(61, 100, 'Garuda Indonesia', 690000, 'Premium Economy', '2018-07-27', 18, 27),
(62, 130, 'Lion Air', 890000, 'Business', '2018-08-30', 6, 25),
(63, 100, 'Air Asia', 1010000, 'Business', '2018-08-22', 19, 13),
(64, 150, 'Batik Air', 1070000, 'Business', '2017-12-19', 16, 27),
(65, 110, 'Citilink', 710000, 'Premium Economy', '2018-01-10', 29, 25),
(66, 150, 'Sriwijaya Air', 720000, 'Premium Economy', '2017-12-18', 31, 1),
(67, 50, 'Garuda Indonesia', 1140000, 'Business', '2018-04-25', 17, 5),
(68, 130, 'Lion Air', 800000, 'Premium Economy', '2018-08-21', 13, 24),
(69, 90, 'Air Asia', 620000, 'Premium Economy', '2018-06-15', 27, 11),
(70, 50, 'Batik Air', 1010000, 'Business', '2018-03-29', 22, 10),
(71, 100, 'Citilink', 900000, 'Business', '2018-06-04', 5, 2),
(72, 70, 'Sriwijaya Air', 820000, 'Premium Economy', '2018-10-24', 11, 16),
(73, 140, 'Garuda Indonesia', 1030000, 'Business', '2017-11-24', 23, 27),
(74, 90, 'Lion Air', 1090000, 'Business', '2018-02-04', 6, 21),
(75, 140, 'Air Asia', 610000, 'Premium Economy', '2018-03-25', 22, 29),
(76, 60, 'Batik Air', 1130000, 'Business', '2018-01-13', 9, 29),
(77, 130, 'Citilink', 910000, 'Business', '2017-12-27', 29, 32),
(78, 130, 'Sriwijaya Air', 470000, 'Economy', '2018-03-24', 13, 18),
(79, 80, 'Garuda Indonesia', 850000, 'Business', '2018-03-18', 3, 8),
(80, 70, 'Lion Air', 620000, 'Premium Economy', '2018-10-28', 28, 27),
(81, 120, 'Air Asia', 1130000, 'Business', '2018-07-14', 8, 23),
(82, 50, 'Batik Air', 440000, 'Economy', '2017-12-25', 32, 33),
(83, 130, 'Citilink', 1090000, 'Business', '2018-08-16', 13, 15),
(84, 80, 'Sriwijaya Air', 690000, 'Premium Economy', '2018-10-25', 14, 15),
(85, 50, 'Garuda Indonesia', 880000, 'Business', '2018-03-31', 28, 25),
(86, 120, 'Lion Air', 780000, 'Premium Economy', '2018-08-24', 15, 20),
(87, 140, 'Air Asia', 1180000, 'Business', '2018-07-03', 19, 13),
(88, 80, 'Batik Air', 920000, 'Business', '2018-01-10', 21, 15),
(89, 120, 'Citilink', 550000, 'Economy', '2018-08-18', 7, 30),
(90, 150, 'Sriwijaya Air', 750000, 'Premium Economy', '2018-10-29', 24, 11),
(91, 130, 'Garuda Indonesia', 920000, 'Business', '2018-05-20', 11, 20),
(92, 100, 'Lion Air', 950000, 'Business', '2018-06-30', 26, 9),
(93, 70, 'Air Asia', 1060000, 'Business', '2018-05-24', 2, 3),
(94, 80, 'Batik Air', 1010000, 'Business', '2018-03-04', 9, 22),
(95, 120, 'Citilink', 650000, 'Premium Economy', '2018-07-01', 20, 21),
(96, 140, 'Sriwijaya Air', 590000, 'Economy', '2018-01-27', 18, 33),
(97, 120, 'Garuda Indonesia', 580000, 'Economy', '2018-07-28', 21, 13),
(98, 110, 'Lion Air', 500000, 'Economy', '2018-06-12', 5, 30),
(99, 70, 'Air Asia', 900000, 'Business', '2018-04-11', 9, 19),
(100, 110, 'Batik Air', 590000, 'Economy', '2018-08-31', 21, 22);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `id` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `bookingId` int(11) DEFAULT NULL,
  `isPaid` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `userId`, `bookingId`, `isPaid`) VALUES
(1, 1, 1, 0),
(2, 2, 2, 0),
(3, 3, 3, 0),
(4, 4, 4, 0),
(5, 5, 5, 0),
(6, 6, 6, 0),
(7, 7, 7, 0),
(8, 8, 8, 0),
(9, 9, 9, 0),
(10, 10, 10, 0),
(11, 1, 11, 0),
(12, 2, 12, 0),
(13, 3, 13, 0),
(14, 4, 14, 0),
(15, 5, 15, 0),
(16, 6, 16, 1),
(17, 7, 17, 1),
(18, 8, 18, 1),
(19, 9, 19, 1),
(20, 10, 20, 1),
(21, 1, 21, 1),
(22, 2, 22, 1),
(23, 3, 23, 1),
(24, 4, 24, 1),
(25, 5, 25, 1);

-- --------------------------------------------------------

--
-- Table structure for table `locations`
--

CREATE TABLE `locations` (
  `Id` int(11) NOT NULL,
  `Province` varchar(25) NOT NULL,
  `Town` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `locations`
--

INSERT INTO `locations` (`Id`, `Province`, `Town`) VALUES
(1, 'Aceh', 'Banda Aceh'),
(2, 'Aceh', 'Langsa'),
(3, 'Aceh', 'Lhokseumawe'),
(4, 'Aceh', 'Meulaboh'),
(5, 'Aceh', 'Sabang'),
(6, 'Aceh', 'Subulussalam'),
(7, 'Aceh', 'Aceh Barat'),
(8, 'Aceh', 'Aceh Barat Daya'),
(9, 'Aceh', 'Aceh Besar'),
(10, 'Aceh', 'Aceh Jaya'),
(11, 'Aceh', 'Aceh Selatan'),
(12, 'Aceh', 'Aceh Singkil'),
(13, 'Aceh', 'Aceh Tamiang'),
(14, 'Aceh', 'Aceh Tengah'),
(15, 'Aceh', 'Aceh Tenggara'),
(16, 'Aceh', 'Aceh Timur'),
(17, 'Aceh', 'Aceh Utara'),
(18, 'Aceh', 'Bener Meriah'),
(19, 'Aceh', 'Bireuen'),
(20, 'Aceh', 'Gayo Lues'),
(21, 'Aceh', 'Nagan Raya'),
(22, 'Aceh', 'Pidie'),
(23, 'Aceh', 'Pidie Jaya'),
(24, 'Aceh', 'Simeulue'),
(25, 'Bali', 'Denpasar'),
(26, 'Bangka Belitung', 'Pangkalpinang'),
(27, 'Banten', 'Cilegon'),
(28, 'Banten', 'Serang'),
(29, 'Banten', 'Tangerang Selatan'),
(30, 'Banten', 'Tangerang'),
(31, 'Bengkulu', 'Bengkulu'),
(32, 'Bengkulu', 'Bengkulu Selatan'),
(33, 'Bengkulu', 'Bengkulu Tengah'),
(34, 'Bengkulu', 'Bengkulu Utara'),
(35, 'Bengkulu', 'Kaur'),
(36, 'Bengkulu', 'Kepahiang'),
(37, 'Bengkulu', 'Lebong'),
(38, 'Bengkulu', 'Mukomuko'),
(39, 'Bengkulu', 'Rejang Lebong'),
(40, 'Bengkulu', 'Seluma'),
(41, 'Gorontalo', 'Gorontalo'),
(42, 'Jakarta', 'Jakarta Barat'),
(43, 'Jakarta', 'Jakarta Pusat'),
(44, 'Jakarta', 'Jakarta Selatan'),
(45, 'Jakarta', 'Jakarta Timur'),
(46, 'Jakarta', 'Jakarta Utara'),
(47, 'Jambi', 'Sungai Penuh'),
(48, 'Jambi', 'Jambi'),
(49, 'Jambi', 'Batanghari'),
(50, 'Jambi', 'Bungo'),
(51, 'Jambi', 'Kerinci'),
(52, 'Jambi', 'Merangin'),
(53, 'Jambi', 'Muaro Jambi'),
(54, 'Jambi', 'Sarolangun'),
(55, 'Jambi', 'Tanjung Jabung Barat'),
(56, 'Jambi', 'Tanjung Jabung Timur'),
(57, 'Jambi', 'Tebo'),
(58, 'Jawa Barat', 'Bandung'),
(59, 'Jawa Barat', 'Bekasi'),
(60, 'Jawa Barat', 'Bogor'),
(61, 'Jawa Barat', 'Cimahi'),
(62, 'Jawa Barat', 'Cirebon'),
(63, 'Jawa Barat', 'Depok'),
(64, 'Jawa Barat', 'Sukabumi'),
(65, 'Jawa Barat', 'Tasikmalaya'),
(66, 'Jawa Barat', 'Banjar'),
(67, 'Jawa Tengah', 'Magelang'),
(68, 'Jawa Tengah', 'Pekalongan'),
(69, 'Jawa Tengah', 'Purwokerto'),
(70, 'Jawa Tengah', 'Salatiga'),
(71, 'Jawa Tengah', 'Semarang'),
(72, 'Jawa Tengah', 'Surakarta'),
(73, 'Jawa Tengah', 'Tegal'),
(74, 'Jawa Timur', 'Batu'),
(75, 'Jawa Timur', 'Blitar'),
(76, 'Jawa Timur', 'Kediri'),
(77, 'Jawa Timur', 'Madiun'),
(78, 'Jawa Timur', 'Malang'),
(79, 'Jawa Timur', 'Mojokerto'),
(80, 'Jawa Timur', 'Pasuruan'),
(81, 'Jawa Timur', 'Probolinggo'),
(82, 'Jawa Timur', 'Surabaya'),
(83, 'Kalimantan Barat', 'Pontianak'),
(84, 'Kalimantan Barat', 'Singkawang'),
(85, 'Kalimantan Selatan', 'Banjarbaru'),
(86, 'Kalimantan Selatan', 'Banjarmasin'),
(87, 'Kalimantan Tengah', 'Palangkaraya'),
(88, 'Kalimantan Timur', 'Balikpapan'),
(89, 'Kalimantan Timur', 'Bontang'),
(90, 'Kalimantan Timur', 'Samarinda'),
(91, 'Kalimantan Utara', 'Tarakan'),
(92, 'Kepulauan Riau', 'Batam'),
(93, 'Kepulauan Riau', 'Tanjungpinang'),
(94, 'Kepulauan Riau', 'Bintan'),
(95, 'Kepulauan Riau', 'Karimun'),
(96, 'Kepulauan Riau', 'Kepulauan Anambas'),
(97, 'Kepulauan Riau', 'Lingga'),
(98, 'Kepulauan Riau', 'Natuna'),
(99, 'Lampung', 'Bandar Lampung'),
(100, 'Lampung', 'Metro'),
(101, 'Maluku Utara', 'Ternate'),
(102, 'Maluku Utara', 'Tidore Kepulauan'),
(103, 'Maluku', 'Ambon'),
(104, 'Maluku', 'Tual'),
(105, 'Nusa Tenggara Barat', 'Bima'),
(106, 'Nusa Tenggara Barat', 'Mataram'),
(107, 'Nusa Tenggara Timur', 'Kupang'),
(108, 'Papua Barat', 'Sorong'),
(109, 'Papua', 'Jayapura'),
(110, 'Riau', 'Dumai'),
(111, 'Riau', 'Pekanbaru'),
(112, 'Riau', 'Bengkalis'),
(113, 'Riau', 'Indragiri Hilir'),
(114, 'Riau', 'Indragiri Hulu'),
(115, 'Riau', 'Kampar'),
(116, 'Riau', 'Kepulauan Meranti'),
(117, 'Riau', 'Kuantan Singingi'),
(118, 'Riau', 'Pelalawan'),
(119, 'Riau', 'Rokan Hilir'),
(120, 'Riau', 'Rokan Hulu'),
(121, 'Riau', 'Siak'),
(122, 'Sulawesi Selatan', 'Makassar'),
(123, 'Sulawesi Selatan', 'Palopo'),
(124, 'Sulawesi Selatan', 'Parepare'),
(125, 'Sulawesi Tengah', 'Palu'),
(126, 'Sulawesi Tenggara', 'Bau-Bau'),
(127, 'Sulawesi Tenggara', 'Kendari'),
(128, 'Sulawesi Utara', 'Bitung'),
(129, 'Sulawesi Utara', 'Kotamobagu'),
(130, 'Sulawesi Utara', 'Manado'),
(131, 'Sulawesi Utara', 'Tomohon'),
(132, 'Sumatera Barat', 'Bukittinggi'),
(133, 'Sumatera Barat', 'Padang'),
(134, 'Sumatera Barat', 'Padangpanjang'),
(135, 'Sumatera Barat', 'Pariaman'),
(136, 'Sumatera Barat', 'Payakumbuh'),
(137, 'Sumatera Barat', 'Sawahlunto'),
(138, 'Sumatera Barat', 'Solok'),
(139, 'Sumatera Barat', 'Agam'),
(140, 'Sumatera Barat', 'Dharmasraya'),
(141, 'Sumatera Barat', 'Kepulauan Mentawai'),
(142, 'Sumatera Barat', 'Lima Puluh Kota'),
(143, 'Sumatera Barat', 'Padang Pariaman'),
(144, 'Sumatera Barat', 'Pasaman'),
(145, 'Sumatera Barat', 'Pasaman Barat'),
(146, 'Sumatera Barat', 'Pesisir Selatan'),
(147, 'Sumatera Barat', 'Sijunjung'),
(148, 'Sumatera Barat', 'Solok'),
(149, 'Sumatera Barat', 'Solok Selatan'),
(150, 'Sumatera Barat', 'Tanah Datar'),
(151, 'Sumatera Selatan', 'Lubuklinggau'),
(152, 'Sumatera Selatan', 'Pagaralam'),
(153, 'Sumatera Selatan', 'Palembang'),
(154, 'Sumatera Selatan', 'Prabumulih'),
(155, 'Sumatera Utara', 'Binjai'),
(156, 'Sumatera Utara', 'Medan'),
(157, 'Sumatera Utara', 'Padang Sidempuan'),
(158, 'Sumatera Utara', 'Pematangsiantar'),
(159, 'Sumatera Utara', 'Sibolga'),
(160, 'Sumatera Utara', 'Tanjungbalai'),
(161, 'Sumatera Utara', 'Tebingtinggi'),
(162, 'Sumatera Utara', 'Asahan'),
(163, 'Sumatera Utara', 'Batubara'),
(164, 'Sumatera Utara', 'Dairi'),
(165, 'Sumatera Utara', 'Deli Serdang'),
(166, 'Sumatera Utara', 'Humbang Hasundutan'),
(167, 'Sumatera Utara', 'Karo'),
(168, 'Sumatera Utara', 'Labuhanbatu'),
(169, 'Sumatera Utara', 'Labuhanbatu Selatan'),
(170, 'Sumatera Utara', 'Labuhanbatu Utara'),
(171, 'Sumatera Utara', 'Langkat'),
(172, 'Sumatera Utara', 'Mandailing Natal'),
(173, 'Sumatera Utara', 'Nias'),
(174, 'Sumatera Utara', 'Nias Barat'),
(175, 'Sumatera Utara', 'Nias Selatan'),
(176, 'Sumatera Utara', 'Nias Utara'),
(177, 'Sumatera Utara', 'Padang Lawas'),
(178, 'Sumatera Utara', 'Padang Lawas Utara'),
(179, 'Sumatera Utara', 'Pakpak Bharat'),
(180, 'Sumatera Utara', 'Samosir'),
(181, 'Sumatera Utara', 'Serdang Bedagai'),
(182, 'Sumatera Utara', 'Simalungun'),
(183, 'Sumatera Utara', 'Tapanuli Selatan'),
(184, 'Sumatera Utara', 'Tapanuli Tengah'),
(185, 'Sumatera Utara', 'Tapanuli Utara'),
(186, 'Sumatera Utara', 'Toba Samosir'),
(187, 'Yogyakarta', 'Yogyakarta');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Id` int(11) NOT NULL,
  `Username` varchar(64) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `Password` varchar(64) NOT NULL,
  `token` varchar(64) DEFAULT NULL,
  `validDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Id`, `Username`, `Name`, `Password`, `token`, `validDate`) VALUES
(1, 'epennington0', 'Ezra Pennington', '1N9d1Ye', NULL, NULL),
(2, 'cacreman1', 'Colver Acreman', '0rVkfQ1TZJB', NULL, NULL),
(3, 'foreilly2', 'Francklyn O\'Reilly', 'HhRxYd', NULL, NULL),
(4, 'pbissex3', 'Porty Bissex', 'WyEWiw9UE726', NULL, NULL),
(5, 'ahardwell4', 'Aurelie Hardwell', 'oEVp4EBocz5E', NULL, NULL),
(6, 'aosgorby5', 'Alvin Osgorby', 'kslrvX', NULL, NULL),
(7, 'cyarwood6', 'Christye Yarwood', '2VGVhsR', NULL, NULL),
(8, 'bleming7', 'Brandy Leming', 'xwQkijf3pY', NULL, NULL),
(9, 'whatliffe8', 'Willem Hatliffe', 'flkLVBN4', NULL, NULL),
(10, 'rstoffels9', 'Rob Stoffels', 'uM8ggV', NULL, NULL),
(11, 'tmuska', 'Tani Musk', 'jho2WO7', NULL, NULL),
(12, 'gscrivinorb', 'Godart Scrivinor', 'nG9jzNHXyt', NULL, NULL),
(13, 'rcolacoc', 'Renaldo Colaco', 'OGIRNOlE1c', NULL, NULL),
(14, 'tlumbersd', 'Tarrah Lumbers', 'seI8HL3a', NULL, NULL),
(15, 'dfritzere', 'Dorrie Fritzer', 'ZVIM3i', NULL, NULL),
(16, 'nobeirnef', 'Nappy O\'Beirne', 'KcSlJnf14dFi', NULL, NULL),
(17, 'isheryneg', 'Indira Sheryne', '3u35RpOMX', NULL, NULL),
(18, 'mpetaschh', 'Morgen Petasch', 'xAHdj9vTQ', NULL, NULL),
(19, 'mswinfeni', 'Mathew Swinfen', 'eCga63htJ6qr', NULL, NULL),
(20, 'cgatherellj', 'Conan Gatherell', 'Gqes13TsHun0', NULL, NULL),
(21, 'jdufallk', 'Jacquelin Dufall', 'xdqHPqJXumYG', NULL, NULL),
(22, 'mjuszczakl', 'Mylo Juszczak', 'NwnGMKw', NULL, NULL),
(23, 'apratleym', 'Astra Pratley', 'P92Pz8A', NULL, NULL),
(24, 'aclifftn', 'Arturo Clifft', 'WkZeEb', NULL, NULL),
(25, 'bjoslando', 'Brande Josland', 'RjyDG8zdq1P', NULL, NULL),
(26, 'lwickenp', 'Livy Wicken', 'toE5lR', NULL, NULL),
(27, 'cgeorgesq', 'Corbett Georges', 'CMW39Yf', NULL, NULL),
(28, 'lwalewiczr', 'Linell Walewicz', 'ISdWhhIo', NULL, NULL),
(29, 'tmattusovs', 'Tremayne Mattusov', 'X9pMzlq3fHOZ', NULL, NULL),
(30, 'wcastt', 'Willow Cast', 'lzof5UC', NULL, NULL),
(31, 'kpotticaryu', 'Karena Potticary', 'jQX0rbxJHy', NULL, NULL),
(32, 'skillelayv', 'Silva Killelay', 'Wl4vbGQYCVga', NULL, NULL),
(33, 'jpadrickw', 'Jackqueline Padrick', 'ZPN4tx8', NULL, NULL),
(34, 'mheismanx', 'Maddy Heisman', 'uZ9VBziep5', NULL, NULL),
(35, 'sgoodbandy', 'Sally Goodband', 'AXzoLsTP', NULL, NULL),
(36, 'ascholesz', 'Andrej Scholes', '35h98r', NULL, NULL),
(37, 'djosilevich10', 'Deny Josilevich', '2qit7VKqZ', NULL, NULL),
(38, 'olyster11', 'Orrin Lyster', 'Y5ZU61WVI8h', NULL, NULL),
(39, 'kdripps12', 'Kaspar Dripps', 'C9sLOY1Qh', NULL, NULL),
(40, 'schaddock13', 'Sylvester Chaddock', 'oearrEOPeGb', NULL, NULL),
(41, 'tlorand14', 'Tye Lorand', 'kexJ34CSJNCq', NULL, NULL),
(42, 'dpickle15', 'Demetra Pickle', 'VviOujqKRwWs', NULL, NULL),
(43, 'mfalcus16', 'Murry Falcus', 'YQm6Ka', NULL, NULL),
(44, 'vwankling17', 'Viki Wankling', 'Dk0J7F9', NULL, NULL),
(45, 'flound18', 'Ferdinanda Lound', 'DEjeQbbptWr', NULL, NULL),
(46, 'pvispo19', 'Putnem Vispo', '5pDWgZk', NULL, NULL),
(47, 'ehaughton1a', 'Elvira Haughton', '1U9u7p4', NULL, NULL),
(48, 'eborsnall1b', 'Elbertine Borsnall', '9OGGpu', NULL, NULL),
(49, 'adawtrey1c', 'Aubrie Dawtrey', 'oPAWa60fw', NULL, NULL),
(50, 'rsparkwell1d', 'Randa Sparkwell', 'baPsJh5P', NULL, NULL),
(51, 'asandry1e', 'Alfonso Sandry', 'e74olo', NULL, NULL),
(52, 'morpin1f', 'Margo Orpin', '124m26UCyVg', NULL, NULL),
(53, 'cfoort1g', 'Cicily Foort', 'mFGKHUH0l', NULL, NULL),
(54, 'tbrilon1h', 'Tanner Brilon', 'aEjmJ0dt', NULL, NULL),
(55, 'clinskey1i', 'Catlaina Linskey', 'd7ND7C', NULL, NULL),
(56, 'ehelsdon1j', 'Eddy Helsdon', 'Qg8cjAIO4AnS', NULL, NULL),
(57, 'ctallow1k', 'Cristobal Tallow', 'pT4cEXjN0', NULL, NULL),
(58, 'mdroogan1l', 'Muffin Droogan', '05G3CHrcPo', NULL, NULL),
(59, 'bgreenlies1m', 'Barnabas Greenlies', 'aGgN8NM', NULL, NULL),
(60, 'wcardello1n', 'Weidar Cardello', 'uBrVNPoqSjqG', NULL, NULL),
(61, 'hpanter1o', 'Harrie Panter', '7jWCGXtLOq4g', NULL, NULL),
(62, 'aardling1p', 'Alphard Ardling', '6rfxr66fWj', NULL, NULL),
(63, 'tstot1q', 'Theodoric Stot', 'LChbUqcshw5', NULL, NULL),
(64, 'aarnell1r', 'Audi Arnell', 'dONCeNdXTeQe', NULL, NULL),
(65, 'mfrance1s', 'Myca France', 'YVipBItdWy', NULL, NULL),
(66, 'jberkery1t', 'Justis Berkery', 'von6Zw', NULL, NULL),
(67, 'rbasson1u', 'Raimundo Basson', 'ELsLvf2qto7', NULL, NULL),
(68, 'ddunguy1v', 'Dave Dunguy', 'O0kcKwKyR9', NULL, NULL),
(69, 'fadamo1w', 'Fancy Adamo', 'wF0yK3g6SXk', NULL, NULL),
(70, 'mcarlett1x', 'Marion Carlett', 'KeeTcu', NULL, NULL),
(71, 'lcorneille1y', 'Laurena Corneille', 'xSB7DTK4b0', NULL, NULL),
(72, 'lberrycloth1z', 'Leisha Berrycloth', '0Z2Xbii', NULL, NULL),
(73, 'lpryn20', 'Lisabeth Pryn', 'jGHzl2', NULL, NULL),
(74, 'stodhunter21', 'Shanda Todhunter', 'TM2JPHIotHoq', NULL, NULL),
(75, 'bbransdon22', 'Benni Bransdon', 'k6lIxqjgZAnp', NULL, NULL),
(76, 'agamell23', 'Adriaens Gamell', 'ilJ4KVwWOQnz', NULL, NULL),
(77, 'kabramow24', 'Karl Abramow', 'To8CELW98iEm', NULL, NULL),
(78, 'rmclardie25', 'Ransell McLardie', '3LCEuHBKjV5', NULL, NULL),
(79, 'dfardy26', 'Damian Fardy', 'dcmaMma', NULL, NULL),
(80, 'sdurrett27', 'Sholom Durrett', 'RAXvNRMqx4A4', NULL, NULL),
(81, 'dberendsen28', 'Dell Berendsen', 'QkhoHyCr', NULL, NULL),
(82, 'eturbat29', 'El Turbat', '68FYF9wj', NULL, NULL),
(83, 'cgumley2a', 'Cynthea Gumley', 'bH2P95CJbL', NULL, NULL),
(84, 'arossetti2b', 'Arline Rossetti', 'CYIQl3', NULL, NULL),
(85, 'ndolley2c', 'Nata Dolley', 'ulZu9n0', NULL, NULL),
(86, 'mgouch2d', 'Malvina Gouch', 'IoPl699uU3G', NULL, NULL),
(87, 'orecher2e', 'Ollie Recher', 'HAyEG9qa8o0w', NULL, NULL),
(88, 'svenners2f', 'Sunny Venners', 'HTpBp1R4Ggo', NULL, NULL),
(89, 'msedgefield2g', 'Marten Sedgefield', 'IXG0tHM', NULL, NULL),
(90, 'vcloutt2h', 'Vidovik Cloutt', '9AnQPTJ', NULL, NULL),
(91, 'ctyndall2i', 'Carlene Tyndall', 'gRpSywwS', NULL, NULL),
(92, 'iboules2j', 'Inglebert Boules', '8q55s0Hadv', NULL, NULL),
(93, 'rclaremont2k', 'Rosalie Claremont', 'KLgWgDag', NULL, NULL),
(94, 'aspur2l', 'Abey Spur', 'aDpxt4MbD', NULL, NULL),
(95, 'gpalffrey2m', 'Ganny Palffrey', 'LhkM8mt', NULL, NULL),
(96, 'ddorward2n', 'Devy Dorward', 'FCcBzBQR0cW', NULL, NULL),
(97, 'lfleeming2o', 'Lucho Fleeming', 'vzA0eX', NULL, NULL),
(98, 'jdysert2p', 'Jeramie Dysert', 'Kdk6bu', NULL, NULL),
(99, 'dworms2q', 'Danila Worms', 'plTCyt84oox', NULL, NULL),
(100, 'dguyer2r', 'Deb Guyer', '1xgQWdrdTB', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airports`
--
ALTER TABLE `airports`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Id` (`Id`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `locations`
--
ALTER TABLE `locations`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `airports`
--
ALTER TABLE `airports`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `flight`
--
ALTER TABLE `flight`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `locations`
--
ALTER TABLE `locations`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=188;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
