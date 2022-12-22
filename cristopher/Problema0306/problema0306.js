const prompt = require("prompt-sync")({ sigvar: true });

var vetorA = []
var vetorB = []

for (var i = 0; i < 10; i++) {
    vetorA[i] = parseInt(prompt("Digite o número na posição ["+i+"]: "))
}

for (var i = 0; i < 10; i++) {
    vetorB[i] = -(vetorA[i]);
    console.log(vetorB[i]);
}