
CREATE TABLE `iskola`.`diak` ( 
    `az` INT NOT NULL AUTO_INCREMENT , 
    `veznev` VARCHAR(20) NOT NULL , 
    `kernev` VARCHAR(20) NOT NULL , 
    `neme` VARCHAR(1) NOT NULL , 
    `osztaly` VARCHAR(6) NOT NULL , 
    `szdatum` DATE NOT NULL , 
    `lakhely` VARCHAR(20) NOT NULL , 
    `magas` INT NOT NULL , 
    PRIMARY KEY (`az`)) 
ENGINE = InnoDB;

LOAD DATA LOCAL infile 'C:/Delete/NA/2-14-F/Adatbazisok/Orai_munkak/Ora_03/Forrasok/diakok.csv' INTO TABLE diak fields terminated by ';';
SELECT * from diak LIMIT 10;
SELECT CONCAT(veznev, ' ', kernev) AS 'Név', magas FROM diak WHERE osztaly='9/A' ORDER BY veznev, kernev;
SELECT COUNT(veznev) AS 'Kovács-ok száma' FROM diak WHERE veznev='Kovacs';
SELECT veznev, COUNT(veznev) AS 'Számuk' FROM diak GROUP BY veznev ORDER BY COUNT(veznev) ASC;
SELECT lakhely, ROUND(AVG(magas), 3) AS 'Átlagmagasság' FROM diak WHERE lakhely='Kecskemet' GROUP BY lakhely;
SELECT month(szdatum) AS 'Hónap száma' FROM diak GROUP BY month(szdatum) ORDER BY COUNT(az) DESC LIMIT 1;
SELECT CONCAT(veznev, ' ', kernev) AS 'Név' FROM diak WHERE day(szdatum);
SELECT neme, ROUND(AVG(magas), 2) AS 'Átlag magasság' FROM diak GROUP BY neme;
SELECT CONCAT(veznev, ' ', kernev) AS 'Legrövidebb név' FROM diak ORDER BY LENGTH(CONCAT(veznev, kernev)) ASC LIMIT 1;
SELECT CONCAT(veznev, ' ', kernev) AS 'Legmagasabb tanuló' FROM diak ORDER BY magas DESC LIMIT 1;
SELECT CONCAT(veznev, ' ', kernev), osztaly, lakhely FROM diak WHERE osztaly LIKE '10%' AND lakhely<>'Kecskemet' AND neme='L';
