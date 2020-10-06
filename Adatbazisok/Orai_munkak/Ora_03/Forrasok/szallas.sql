-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Hoszt: localhost
-- Létrehozás ideje: 2018. Dec 12. 20:04
-- Szerver verzió: 5.6.13
-- PHP verzió: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Adatbázis: `szallas`
--
CREATE DATABASE IF NOT EXISTS `szallas` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `szallas`;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `panzio`
--

CREATE TABLE IF NOT EXISTS `panzio` (
  `szama` varchar(3) NOT NULL,
  `elhelyezkedes` varchar(10) DEFAULT NULL,
  `agyszam` int(11) DEFAULT NULL,
  `tv` char(1) DEFAULT NULL,
  `furdo` char(1) DEFAULT NULL,
  `ar` int(11) DEFAULT NULL,
  PRIMARY KEY (`szama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `panzio`
--

INSERT INTO `panzio` (`szama`, `elhelyezkedes`, `agyszam`, `tv`, `furdo`, `ar`) VALUES
('10.', 'emelet', 3, 'I', 'I', 3300),
('11.', 'tetoter', 2, 'I', 'I', 2000),
('2.', 'emelet', 1, 'N', 'I', 1800),
('4.', 'tetoter', 1, 'I', 'I', 2000),
('5.', 'emelet', 2, 'N', 'I', 2200),
('6.', 'tetoter', 2, 'I', 'I', 2000),
('7.', 'foldszint', 4, 'N', 'I', 3500),
('8.', 'emelet', 2, 'N', 'I', 1500);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
