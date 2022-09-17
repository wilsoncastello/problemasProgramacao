const prompt = require("prompt-sync")({ sigint: true });
var dinheiro = prompt("Digite a quantidade total de dinheiro: ")

var parte1 = (dinheiro / 3) / 5.10
console.log("Dinheiro em dólar: " + parte1)

var parte2 = (dinheiro / 3) / 5.30
console.log("Dinheiro em euro: " + parte2)

var parte3 = (dinheiro / 3) / 6.05
console.log("Dinheiro em libra: " + parte3)