const prompt = require("prompt-sync")({ sigint: true });
var n1 = parseFloat(prompt("Digite o primeiro número: "));
var n2 = parseFloat(prompt("Digite o segundo número: "));
var elementoTroca = n1;
n1 = n2;
n2 = elementoTroca;
console.log("O novo valor do primeiro número é: " + n1);
console.log("O novo valor do segundo número: " + n2);