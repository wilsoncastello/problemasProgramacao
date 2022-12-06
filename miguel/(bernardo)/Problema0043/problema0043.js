const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var numero = parseFloat(prompt("Digite um número: "));

//Cálculo do logaritmo
var log = Math.log10(numero);

//Saída 
console.log("O logaritmo(base 10) de " + numero + " é: " + log);