const prompt = require("prompt-sync")({ sigint: true });
var vA = [10];
var aux = 0, cont = 0;

for (i = 0; i < 10; i++) {
    vA[i] = Number(prompt("Digite o vetor na posição " + i + ": "));
  }

  for (i = 0; i < 10; i++) {
    if(aux != vA[i]){
      for (j = 0; j < 10; j++) {
        aux = vA[i];
        if (aux == vA[j]) {
          cont++;
        }
      }
      if (cont > 1) {
        console.log(aux + " se repete " + cont + " vezes");
      }
      cont = 0;
    }
  }  