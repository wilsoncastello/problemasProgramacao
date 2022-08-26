const prompt = require("prompt-sync")({ sigint: true });

var deposito = Number(prompt("Digite um valor de depósito: "))
var txJuros = Number(prompt("Digite o valor da taxa de juros(%): "))
var rendimento = deposito*(txJuros/100)
var valorTotal = rendimento+deposito
console.log("O rendimento foi de: R$"+rendimento)
console.log("O valor total depois do rendimento é: R$"+valorTotal)