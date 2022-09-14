const prompt = require("prompt-sync")({ sigint: true })

var graus = prompt("Digite os graus: ")
var minutos = prompt("Digite os minutos: ")
var segundos = prompt("Digite os segundos: ")

res = graus + (minutos + segundos/60)/60

res = res * (Math.PI/180)

console.log("Esse ângulo em radianos é: "+res)