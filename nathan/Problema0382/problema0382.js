const prompt = require("prompt-sync")({ sigint: true });
var m = [
    [], [], [], [], []
  ]
  
  for (var i = 0; i < 5; i++) {
    for (var j = 0; j < 5; j++) {
      m[i][j] = Number(prompt("Digite o vetor na posição [" + i + "][" + j + "] :"));
    }
  }
  for (var i = 0; i < 5; i++) {
    for (var j = 0; j < 5; j++) {
      if (i > j) {
        process.stdout.write(m[i][j] + " ");
      }
    }
  }