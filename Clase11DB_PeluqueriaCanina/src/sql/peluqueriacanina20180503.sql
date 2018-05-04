-- phpMyAdmin SQL Dump
-- version 4.6.6deb4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 04, 2018 at 12:57 PM
-- Server version: 10.1.26-MariaDB-0+deb9u1
-- PHP Version: 7.0.27-0+deb9u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `peluqueria_canina_db`
--
CREATE DATABASE IF NOT EXISTS `peluqueria_canina_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `peluqueria_canina_db`;

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE `clientes` (
  `cli_id` int(11) NOT NULL,
  `cli_nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`) VALUES
(1, 'Salchicha'),
(2, 'Caniche'),
(3, 'Dogo'),
(4, 'Rottweiler');

-- --------------------------------------------------------

--
-- Table structure for table `historial`
--

CREATE TABLE `historial` (
  `his_cli_id` int(11) NOT NULL,
  `his_ser_id` int(11) NOT NULL,
  `his_fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `historial`
--

INSERT INTO `historial` (`his_cli_id`, `his_ser_id`, `his_fecha`) VALUES
(2, 3, '2018-05-22 08:32:32'),
(2, 3, '2018-05-28 08:30:30');

-- --------------------------------------------------------

--
-- Table structure for table `servicios`
--

CREATE TABLE `servicios` (
  `ser_id` int(11) NOT NULL,
  `ser_nombre` varchar(255) NOT NULL,
  `ser_precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `servicios`
--

INSERT INTO `servicios` (`ser_id`, `ser_nombre`, `ser_precio`) VALUES
(1, 'baño', 1500),
(2, 'baño y Corte', 3000),
(3, 'Corte de Uñas', 1000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cli_id`);

--
-- Indexes for table `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`his_cli_id`,`his_ser_id`,`his_fecha`),
  ADD KEY `historial_servicios_FK` (`his_ser_id`);

--
-- Indexes for table `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`ser_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cli_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `servicios`
--
ALTER TABLE `servicios`
  MODIFY `ser_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_clientes_FK` FOREIGN KEY (`his_cli_id`) REFERENCES `clientes` (`cli_id`),
  ADD CONSTRAINT `historial_servicios_FK` FOREIGN KEY (`his_ser_id`) REFERENCES `servicios` (`ser_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
