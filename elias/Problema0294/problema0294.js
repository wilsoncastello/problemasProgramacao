const prompt = require("prompt-sync")({ sigint: true })

var VET = [10];
for (i=0;i<10;i++) {
    VET[i] = Number(prompt("Digite um número inteiro para a posição "+i+" do primeiro vetor: "));
}
