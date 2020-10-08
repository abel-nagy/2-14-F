window.addEventListener('load', init);

function init() {
  document.getElementById('gomb').addEventListener('click', feltolt);
}

var adatok = [];

class Szemely {
  constructor(nev, ev) {
    this.nev = nev;
    this.ev = ev;
  }

  kor() {
    let today = new Date();
    return today.getFullYear() - this.ev;
  }
}

function feltolt() {
	let nev = document.getElementById("nev").value;
	let ev = document.getElementById("ev").value;
	console.log(nev + " " + ev);
	let sz = new Szemely(nev, ev);
	adatok.push(sz);
	console.log(adatok.length);

	// Kiíratás
	document.getElementById("tblBody").innerHTML = adatok.reduce( (s, e) => s + `<tr><td>${ e.nev }</td><td>${e.kor()}</td></tr>`, '');
}
