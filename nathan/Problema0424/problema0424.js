const prompt = require("prompt-sync")({ sigint: true });
function calculaFat(x) {
    var y = 1;
    for (var i = x; i > 0; i--) {
      y = y * i;
    }
    return y;
  }
  
  function formarV(n) {
    var v = [];
    var x = 0;
    for (var i = 0; i < n; i++) {
      x = Number(prompt("Digite o numero na posição " + i + ": "));
      v[i] = calculaFat(x);
    }
    return v;
  }
  var n = Number(prompt("Digite o tamanho do vetor:"));
  
  var v = []
  v = formarV(n);
  console.log(v);