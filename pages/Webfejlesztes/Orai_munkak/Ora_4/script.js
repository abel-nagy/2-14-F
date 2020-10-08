window.addEventListener("load", init);

function init() {
  document.getElementById("btn").addEventListener("click", szamol);
}

function szamol() {
  const alap = parseInt(document.getElementById("alap").value);
  const kamat = parseInt(document.getElementById("kamat").value);
  const ev = parseInt(document.getElementById("ev").value);

  console.log(alap + ", " + kamat + ", " + ev);

  const tomb = new Array(ev).fill(0);

  for (i in tomb) {
    tomb[i] =
      i > 0 ? tomb[i - 1] + Math.round((tomb[i - 1] * kamat) / 100) : alap;
  }

  console.log(tomb);

  document.getElementById("tbl").innerHTML = kiiras(tomb);
}

function kiiras(arr) {
  fejlec =
    "<thead class='thead-dark'><tr><th scope='col'>Év</th><th scope='col'>Összeg</th></tr></thead><tbody>";
  const cucc = arr.reduce(
    (sorok, e, i) =>
      sorok + "<tr><td>" + (i + 1) + "</td><td>" + e + "</td></tr>",
    fejlec
  );
  return cucc + "</tbody>";
}
