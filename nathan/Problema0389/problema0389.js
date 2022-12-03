const prompt = require("prompt-sync")({ sigint: true });
var M = [
    [],
    [],
    []
]
  
  for (var l = 0; l < 3; l++) {
    for (var c = 0; c < 3; c++) {
      M[l][c] = prompt("Digite o valor na posição [" + l + "][" + c + "]: ");
    }
  }
  
  var M270 = [
    [],
    [],
    []
  ]
  
  for (var i = 0; i < 3; i++) {
    for (var j = 0; j < 3; j++) {
      M270[i][j] = M[j][2 - i];
    }
  }
  
  for (l = 0; l < 3; l++) {
    for (c = 0; c < 3; c++) {
      process.stdout.write(M270[l][c] + " ");
    }
    console.log("");
  }