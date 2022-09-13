const prompt = require("prompt-sync")({ sigint: true})

var a = prompt("Digite um numerador: ")
var b = prompt("Digite um denominador, não pode ser 0: ")

res = a / b

console.log("Resultado = " + res)