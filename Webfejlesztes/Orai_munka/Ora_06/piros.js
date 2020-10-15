window.addEventListener("load", init);

function init() {
    document.getElementById("meret").addEventListener("keyup", rajzol);
    document.getElementById("racs").addEventListener("click", pozicio);
    document.getElementById("uj").addEventListener("click", torol);
}

var randX;
var randY;
var szamlalo = 0;
var gameOver = false;

function rajzol() {
    torol();

    const szam = parseInt(this.value);
    // Véletlen számok generálása
    randX = (szam > 0) ? Math.floor(Math.random() * szam) : 0;
    randY = (szam > 0) ? Math.floor(Math.random() * szam) : 0;

    let sor;
    let cella;

    for (let i = 0; i < szam; i++) {

        sor = document.getElementById("racs").insertRow(-1);
        for (let j = 0; j < szam; j++) {

            cella = sor.insertCell(-1);
            cella.classList.add("alap");
            cella.classList.add("bg-success");

        }

    }
}

function torol() {
    szamlalo = 0;
    gameOver = false;
    let csomopont = document.getElementById("racs");

    while (csomopont.hasChildNodes()) {
        csomopont.removeChild(csomopont.lastChild);
    }
    document.getElementById("tarolo").innerHTML = "";
    document.getElementById("racs").addEventListener("click", pozicio);
}

function pozicio(e) {
    if (e.target.tagName == "TD") {
        var x = e.target.cellIndex;
        var y = e.target.parentNode.rowIndex;
        console.log("[" + x + ", " + y + "]");
        (x == randX && y == randY) ? e.target.classList.add("bg-danger"): e.target.classList.add("bg-dark");
        if(!gameOver && (x != randX || y != randY)) {
            ++szamlalo;
        } else {
            document.getElementById("tarolo").innerHTML = "A probalkozások száma: " + szamlalo;
            document.getElementById("racs").removeEventListener("click", pozicio);
        }
    }
}
