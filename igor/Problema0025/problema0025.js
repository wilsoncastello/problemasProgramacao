const prompt = require("prompt-sync")({ sigint: true });

var x = prompt("Escreve o preco: ")
var y = x * (10/100)
var res = x - y 
console.log("O novo preco é: "+res)