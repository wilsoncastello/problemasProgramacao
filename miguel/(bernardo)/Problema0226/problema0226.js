const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var numero = parseInt(prompt("Digite o número de termos: "));


// Cálculo da soma dos termos
var razao = 3;
var soma = 0;
var termo = 3;
if (numero > 0) {
    for (var i = 0; i < numero; i++) {
        soma += termo;
        termo *= razao;
    }
}

// Saída
console.log(" O resultado da soma até o " + numero + " termo é: " + soma);