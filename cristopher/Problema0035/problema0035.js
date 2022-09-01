const prompt = require("prompt-sync")({ sigint: true });

var n = parseInt(prompt("Informe o número de lados do polígono: "))

var numeroDiagonais = n * (n - 3) / 2

console.log("O número de diagonais do polígono é: " + numeroDiagonais)