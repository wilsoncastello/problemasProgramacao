const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var soma = 0;
var num = 0;
var idade = 42;

while (idade != 0) {
    num++;
    idade = parseInt(prompt("Digite a " + num + " idade (digite 0 para finalizar): "));
    soma += idade;
}


// Cálculo da média das idades
if (num != 1) {
    num --;
}
var media = soma / num;

// Saída
console.log("A média das idades é: " + media);