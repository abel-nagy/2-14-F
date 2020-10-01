window.addEventListener("load", init);

function init() {
    document.getElementById("gomb").addEventListener('click', szamol);
}

function szamol() {
    let alap = parseInt( document.getElementById("alap").value );
    let kamat = parseInt( document.getElementById("kamat").value );
    let ev = parseInt( document.getElementById("ev").value );

    console.log(alap + ", " + kamat + ", " + ev);

    let tomb = new Array(ev).fill(0)

    for(i in tomb) {
        tomb[i] = i > 0 ? Math.round( tomb[i - 1] + tomb[i - 1] * kamat/100 ) : alap;
    }

    console.log(tomb);

    kiiras(tomb);

}

function kiiras(arr) {
    let sorok = arr.reduce( (s, e, i) => s + `<tr><td>${i + 1}</td><td>` );
    document.getElementById("tbl").innerHTML = sorok;
}