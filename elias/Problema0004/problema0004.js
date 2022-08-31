const prompt = require("prompt-sync")({ sigint: true });

var base = parseFloat(prompt("Digite o valor da base do Triângulo: "));
var altura = parseFloat(prompt("Digite o valor da altura do Triângulo: "));

var area = (base*altura)/2;

console.log("A área do Triângulo é: " + area);