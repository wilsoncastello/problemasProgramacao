const prompt = require("prompt-sync")({ sigint: true });

var p = Number(prompt("Digite o valor constante da aplicação mensal: "));
var i = Number(prompt("Digite o valor da taxa: "));
var n = Number(prompt("Digite o número de meses: "));
var valorAcumulado = (p * Math.pow((1 + i), n) -1) / i;
console.log("O rendimento será de: " + valorAcumulado);


