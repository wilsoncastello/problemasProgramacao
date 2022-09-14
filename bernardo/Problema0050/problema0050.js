const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var altura = parseFloat(prompt("Digite a altura da lata (em centímetros): "));
var raio = parseFloat(prompt("Digite o raio da lata: (em centímetros): "));

//Cálculo do volume da lata
var area = Math.PI * Math.pow(raio,2);
var volume = area * altura;

//Saída 
console.log("O volume da lata é: " + Math.trunc(volume) + "ml");