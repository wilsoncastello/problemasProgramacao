const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var nota1 = parseFloat(prompt("Digite a primeira nota: "));
var nota2 = parseFloat(prompt("Digite a segunda nota: "));
var nota3 = parseFloat(prompt("Digite a terceira nota: "));

//Cálculo da média
var media = (nota1 + nota2 + nota3) / 3;

//Saída 
console.log("Média aritmética das 3 notas: " + Math.round(media * 100) / 100);