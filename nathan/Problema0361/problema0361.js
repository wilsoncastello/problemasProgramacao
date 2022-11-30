const prompt = require("prompt-sync")({ sigint: true });
var M = [
    [],
    []
  ]
  var R = [
    [],
    []
  ];
  var maiorN = Number.MIN_VALUE;
  
  for (l = 0; l < 2; l++) {
    for (c = 0; c < 2; c++) {
      M[l][c] = prompt("Digite o valor na posição ["+ l +"][" + c + "]: ");        
      if(M[l][c] > maiorN)
        maiorN = M[l][c];
      }
  }
  for (l = 0; l < 2; l++) {
    for (c = 0; c < 2; c++) {
      R[l][c] = M[l][c] * maiorN;
    }
  }
  for (l = 0; l < 2; l++) {
    for (c = 0; c < 2; c++) {
      process.stdout.write(R[l][c] + " ");
    }
    console.log("");
  }