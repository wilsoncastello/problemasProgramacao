const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var vetorA = [];
for (var i = 0; i < 10; i++){
    vetorA[i] = parseFloat(prompt("Digite o " + (i + 1) + " número: "));
}

// Cálculo da multiplicação
var vetorB = [];
for (var i =0; i < 10; i++){
    if (vetorA[i] % 2 == 0){
        vetorB[i] = vetorA[i] * 5;
    }
    else{
        vetorB[i] = vetorA[i] + 5;
    }
}

// Saída
console.log("vetorA: " + vetorA);
console.log("vetorB: " + vetorB);