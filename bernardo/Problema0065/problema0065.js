const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var picole1 = parseFloat(prompt("Digite o número de picolés do tipo 1 vendidos: "));
var picole2 = parseFloat(prompt("Digite o número de picolés do tipo 2 vendidos: "));
var picole3 = parseFloat(prompt("Digite o número de picolés do tipo 3 vendidos: "));

//Cálculo da quantidade e valor total dos picolés
var quantidade = picole1 + picole2 + picole3;
var total = picole1 * 1.5 + picole2 * 2 + picole3 * 0.75;

//Saída 
console.log("Quantidade vendida: " + quantidade);
console.log("Valor arrecadado R$: " + Math.round(total * 100) / 100);