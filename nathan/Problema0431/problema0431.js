const prompt = require("prompt-sync")({ sigint: true });
function verificaN(v) {
    var j = v.length - 1, aux = 0;
    for (i = 0; i < n / 2; i++) {
      aux = v[i];
      v[i] = v[j];
      v[j] = aux;
      j--;
    }
  }
  
  var n = Number(prompt("Digite o tamanho do vetor: "))
  var v = []
  
  for (i = 0; i < n; i++) {
    v[i] = prompt("Digite o numero na posição " + i + ": ")
  }
  verificaN(v);
  for (i = 0; i < n; i++) {
    console.log(v[i]);
  }