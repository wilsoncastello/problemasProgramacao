const prompt = require("prompt-sync")({ sigint: true });

var nota1 = parseFloat(prompt("Digite a primeira nota: "));
var peso1 = parseFloat(prompt("Agora, digite o peso da primeira nota: "));
var nota2 = parseFloat(prompt("Digite a segunda nota: "));
var peso2 = parseFloat(prompt("Agora, digite o peso da segunda nota: "));
var nota3 = parseFloat(prompt("Digite a terceira nota: "));
var peso3 = parseFloat(prompt("Agora, digite o peso da terceira nota: "));

var notaFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

console.log("O resultado da média ponderada é: " + notaFinal);