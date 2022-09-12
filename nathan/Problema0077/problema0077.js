const prompt = require("prompt-sync")({ sigint: true });

var n1 = Number(prompt("Digite o primeiro número: "));
var n2 = Number(prompt("Digite o segundo número: "));

var soma = n1 + n2;
var subtracao = n1 - n2;
var multiplicacao = n1 * n2;
var divisao = n1 / n2;

console.log("Soma: " + soma);
console.log("Subtracao: " + subtracao);
console.log("Multiplicacao: " + multiplicacao);
console.log("Divisao: " + divisao);