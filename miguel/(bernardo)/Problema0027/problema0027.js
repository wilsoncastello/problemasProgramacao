const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var quilos = parseFloat(prompt("Digite o peso (em quilos): "));

//Cálculo do peso em gramas
var gramas = quilos * 1000;

//Saída 
console.log("O peso em gramas é: " + gramas);