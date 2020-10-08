window.addEventListener('load', init);

function init() {
    document.getElementById("nev").addEventListener('keyup', szamol);
    document.getElementById("gomb").addEventListener('click', ellenoriz);
}

var karakterek = 0;

function szamol() {
    document.getElementById("tarolo").innerHTML = this.value.length;
}

function ellenoriz(e) {

    // Radio
    if(!document.querySelector('input[name=hasab]:checked')) {
        console.log("Nincs kiválasztva a hasáb éle!");
    } else {
        console.log("Az élek száma " + document.querySelector('input[name=hasab]:checked').value);
    }

    // Checkbox
    var checked = Array.from(document.querySelectorAll('input[name=jarmu]:checked'));
    checked.forEach( e => console.log(e.value))

    // Select
    var index = document.getElementById('evszak').selectedIndex;
    var selected = document.getElementById('evszak').options;
    console.log(selected[index].text)
}