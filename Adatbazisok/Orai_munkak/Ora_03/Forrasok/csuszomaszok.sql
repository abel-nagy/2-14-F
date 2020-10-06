-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2020. Sze 24. 19:00
-- Kiszolgáló verziója: 10.4.6-MariaDB
-- PHP verzió: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `csuszomaszok`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `csigak`
--

CREATE TABLE `csigak` (
  `csaz` varchar(4) COLLATE utf8_hungarian_ci NOT NULL,
  `nev` varchar(20) COLLATE utf8_hungarian_ci NOT NULL,
  `fajta` varchar(30) COLLATE utf8_hungarian_ci NOT NULL,
  `sebesseg` int(11) NOT NULL,
  `haz` varchar(2) COLLATE utf8_hungarian_ci NOT NULL,
  `veszelyes` char(1) COLLATE utf8_hungarian_ci NOT NULL,
  `ar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `csigak`
--

INSERT INTO `csigak` (`csaz`, `nev`, `fajta`, `sebesseg`, `haz`, `veszelyes`, `ar`) VALUES
('A001', 'Evettke', 'Éti csiga', 3, 'I', 'N', 20),
('A002', 'Nyissz', 'Éles csiga', 4, 'I', 'I', 50),
('B003', 'Bubor', 'Vizi csiga', 2, 'I', 'N', 25),
('B005', 'Rokob', 'Bokor csiga', 3, 'I', 'N', 23),
('B008', 'Sünike', 'Tüskés csiga', 4, 'I', 'I', 60),
('C002', 'Lapka', 'Mocsári csiga', 1, 'I', 'N', 10),
('C005', 'Csipike', 'Tucsiga', 3, 'I', 'I', 50),
('C007', 'Nudi', 'Meztelen csiga', 2, 'N', 'N', 30),
('D001', 'Kapa', 'Kertész csiga', 3, 'N', 'I', 40),
('D006', 'Afrika', 'Zebra csiga', 5, 'I', 'N', 55),
('D010', 'Mano', 'Törpe csiga', 1, 'I', 'I', 20),
('E002', 'Kincs', 'Kristály csiga', 2, 'I', 'N', 35),
('E005', 'Tiger', 'Nagyfogú csiga', 2, 'I', 'I', 40),
('E009', 'Gyoszi', 'Szőrős csiga', 2, 'I', 'N', 25),
('F001', 'Matyó', 'Himzett csiga', 5, 'I', 'N', 40),
('F006', 'GSM', 'Pannon csiga', 3, 'N', 'I', 35),
('G012', 'Dacia', 'Kék csiga', 3, 'N', 'N', 25),
('G024', 'Bujka', 'Pince csiga', 2, 'N', 'I', 40),
('H004', 'Ablak', 'Üveges csiga', 4, 'I', 'N', 30),
('H005', 'Godzilla', 'Tonna csiga', 4, 'I', 'N', 30),
('K015', 'Borocska', 'Hordó csiga', 3, 'I', 'N', 25),
('L003', 'Mérnök', 'Kúpos csiga', 5, 'I', 'I', 30),
('M007', 'Bond', 'Pajzs csiga', 5, 'I', 'N', 40);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `csigak`
--
ALTER TABLE `csigak`
  ADD PRIMARY KEY (`csaz`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
