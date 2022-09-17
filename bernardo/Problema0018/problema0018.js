const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var altura = parseFloat(prompt("Digite a altura a ser alcançada(em metros): "));

//Cálculo do número de degraus
altura = altura * 100;
var degraus = Math.floor(altura / 17); 
var resto = altura % 17;
var exatidao = Math.floor((resto + 2) / (resto + 1));
degraus += 2 - exatidao;
var ultimoDegrau =  (exatidao -1) * 17 + resto;

//Saída 
console.log("Número de degraus: " + degraus);
console.log("Altura pertencente ao último degrau: " + ultimoDegrau + "cm");