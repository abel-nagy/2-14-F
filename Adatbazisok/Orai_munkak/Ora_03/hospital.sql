

SELECT * FROM betegek LIMIT 5;
SELECT veznev, kernev, taj FROM betegek WHERE neme='L';
SELECT * FROM betegek WHERE lakhely='Solt' ORDER BY veznev ASC;
SELECT * FROM betegek WHERE neme='F' AND sulya<70;
SELECT veznev, kernev, sulya FROM betegek ORDER BY sulya ASC LIMIT 1
SELECT veznev, kernev FROM betegek ORDER BY szdatum ASC LIMIT 1;
SELECT veznev, kernev, lakhely FROM betegek WHERE lakhely<>'Kecel';
SELECT veznev, kernev, osztaly FROM betegek WHERE veznev='Kovács' AND lakhely<>'Szolnok' AND year(szdatum)<1960;
INSERT INTO betegek VALUES (312236541, 'Kiss', 'Anna', 'L', 'sebeszet', '1968-10-23', 'Kecskemét', 66);
UPDATE betegek SET osztaly='sebeszet' WHERE veznev='Barna' AND kernev='Andrea' AND osztaly='belgyogyaszat';
DELETE FROM betegek WHERE taj=123652125;
UPDATE betegek SET sulya=70 WHERE taj=487412541;
DELETE FROM betegek WHERE lakhely='Szolnok';
SELECT AVG(sulya) AS 'Átlagos testsúly' FROM betegek;
SELECT veznev, kernev, szdatum FROM betegek WHERE month(szdatum) BETWEEN 6 AND 8;
SELECT veznev, kernev FROM betegek WHERE dayofweek(szdatum)=1;
SELECT dayname('1999-03-12');
SELECT year(now()) - year(szdatum) AS 'Kor' FROM betegek WHERE veznev='Szabó' AND kernev='Sándor'
SELECT COUNT(taj) AS 'Szülők száma' FROM betegek WHERE osztaly='szuleszet';
SELECT veznev, kernev FROM betegek WHERE sulya BETWEEN 70 AND 80;