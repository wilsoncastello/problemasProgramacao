const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var numero1 = parseInt(prompt("Digite o 1 número: "));
var numero2 = parseInt(prompt("Digite o 2 número: "));

// Cálculo da multiplicação
var resultado = 0;
for (var i = 0; i < numero2; i++) {
    resultado += numero1;
}

// Saída
console.log("O resultado da multiplicação é: " + resultado);