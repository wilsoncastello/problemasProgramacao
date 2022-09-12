const prompt = require("prompt-sync")({ sigint: true });

var n1 = Number(prompt("Digite o primeiro número: "));
var n2 = Number(prompt("Digite o segundo número: "));
var n3 = Number(prompt("Digite o terceiro número: "));
var multi = n1 * n2 * n3;
console.log("A multiplicação entre os 3 números é: "+multi);