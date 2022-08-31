const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var numero1 = parseInt(prompt("Digite o primeiro número: "));
var numero2 = parseInt(prompt("Digite o segundo número: "));
var numero3 = parseInt(prompt("Digite o terceiro número: "));
var numero4 = parseInt(prompt("Digite o quarto número: "));

//Cálculo da soma
var soma = numero1 + numero2 + numero3 + numero4;

//Saída 
console.log("Soma dos 4 números: " + soma);