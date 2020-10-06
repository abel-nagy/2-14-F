-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2020. Sze 30. 18:28
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
-- Adatbázis: `hospital`
--
CREATE DATABASE IF NOT EXISTS `hospital` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci;
USE `hospital`;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `betegek`
--

CREATE TABLE `betegek` (
  `taj` varchar(9) COLLATE utf8_hungarian_ci NOT NULL,
  `veznev` varchar(20) COLLATE utf8_hungarian_ci NOT NULL,
  `kernev` varchar(20) COLLATE utf8_hungarian_ci NOT NULL,
  `neme` char(1) COLLATE utf8_hungarian_ci NOT NULL,
  `osztaly` varchar(20) COLLATE utf8_hungarian_ci NOT NULL,
  `szdatum` date NOT NULL,
  `lakhely` varchar(20) COLLATE utf8_hungarian_ci NOT NULL,
  `sulya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `betegek`
--

INSERT INTO `betegek` (`taj`, `veznev`, `kernev`, `neme`, `osztaly`, `szdatum`, `lakhely`, `sulya`) VALUES
('123451234', 'Horváth', 'Andrea', 'L', 'szuleszet', '1986-10-28', 'Kiskőrös', 77),
('123456123', 'Barna ', 'Zoltán', 'F', 'belgyogyaszat', '1976-05-28', 'Nagykőrös', 66),
('123456712', 'Kovács', 'László', 'F', 'belgyogyaszat', '1956-03-12', 'Lajosmizse', 84),
('123456781', 'Barna', 'Sándor', 'F', 'szemeszet', '1982-11-08', 'Szolnok', 91),
('123456789', 'Nagy', 'Gergely', 'F', 'sebeszet', '1994-11-30', 'Kiskőrös', 78),
('123652125', 'Kovács', 'Mariann', 'L', 'szuleszet', '1986-01-23', 'Szolnok', 80),
('123654125', 'Barna', 'Andrea', 'L', 'belgyogyaszat', '1986-06-12', 'Solt', 66),
('321654921', 'Kiss', 'Katalin', 'L', 'sebeszet', '1963-02-20', 'Kecel', 60),
('321654983', 'Szőke', 'Mariann', 'L', 'sebeszet', '1984-07-02', 'Kecel', 58),
('487412541', 'Kovács', 'Zoltán', 'F', 'sebeszet', '1966-11-22', 'Lajosmizse', 85),
('541256325', 'Horváth', 'Mariann', 'L', 'szemeszet', '1995-01-22', 'Solt', 72),
('654321987', 'Szabó', 'Sándor', 'F', 'belgyogyaszat', '1973-06-11', 'Solt', 63);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `betegek`
--
ALTER TABLE `betegek`
  ADD PRIMARY KEY (`taj`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
