const prompt = require("prompt-sync")({ sigint: true });

var valorGasto = prompt("Digite o valor gasto: ")

var valorTotal = valorGasto*1.10

console.log("O valor total: "+parseFloat(valorTotal.toFixed(2)))