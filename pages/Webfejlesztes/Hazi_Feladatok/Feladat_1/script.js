
var homersekletek=[20,18,21,22,23,24,20,22,25,26,22,21,23,19,25,23,23,23,22,22,25,26,27,26,25,23,28,27];

// 1. Feladat
homersekletek.forEach( ListAll );

// 2. Feladat
console.log(Avg());

// 3. Feladat
if(Select()) {
    console.log("Igen");
} else {
    console.log("Nem");
}

// 4. Feladat
console.log(Count() + " alkalommal volt nagyobb a hőmérséklet 26 foknál.");

// 5. Feladat
console.log("A legkisebb érték: " + MinSelect());

// 6. Feladat
console.log("Helye: " + Find());

// 7. Feladat
OutToTable();

/* == Functions ========================================================================================================== */

function ListAll(item, index) {
    console.log((index+1) + " " + item);
}

function Avg() {
    var sum = 0
    for(i = 0; i < homersekletek.length; i++) {
        sum += homersekletek[i];
    }
    return (sum / homersekletek.length);
}

function Select() {

    for(i = 0; i < homersekletek.length; i++) {
        if(homersekletek[i] > 26) return true;
    }

    return false;

}

function Count() {

    var counter = 0;
    for(i = 0; i < homersekletek.length; i++) {
        if(homersekletek[i] > 26) {
            counter++;
        }
    }

    return counter;

}

function MinSelect() {

    var min = homersekletek[0];

    for(i = 0; i < homersekletek.length; i++) {
        if (homersekletek[i] < min) {
            min = homersekletek[i];
        }
    }

    return min;

}

function Find() {
    
    var index = 0;
    var min = MinSelect();

    for(i = 0; i < homersekletek.length; i++) {
        if (homersekletek[i] == min) {
            index = i;
        }        
    }

    return index + 1;

}

function OutToTable() {

    var injection = "<thead><tr><th>Index</th><th>Hőmérséklet</th></tr></thead><tbody>";

    for(i = 0; i < homersekletek.length; i++) {
        injection += "<tr><td>" + (i+1) + "</td><td>" + homersekletek[i] + "</td></tr>";
    }
    
    injection += "<tr><td colspan='2'>A napi átlag hőmérséklet: " + Avg() + "</td></tr></tbody>";
    document.getElementById("adatok").innerHTML += injection;

}