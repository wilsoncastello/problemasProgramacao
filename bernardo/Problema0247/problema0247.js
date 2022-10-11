const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var matrizA = []
var matrizB = []
var tamanho = 20
for (var i = 0; i < tamanho; i++) {
    matrizA[i] = parseFloat(prompt("Digite o " + (i + 1) + " número: "));
}

// Cálculo da matrizB
for (var i = 0; i < tamanho; i++) {
    matrizB[i] = matrizA[tamanho - 1 - i];
}

// Saída
console.log("MatrizA:\n" + matrizA);
console.log("MatrizB:\n" + matrizB);