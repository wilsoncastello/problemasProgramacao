const prompt = require("prompt-sync")({ sigint: true });
var numero = prompt("Coloque aqui um número real (Use . ao inves de , ). Digite: ")

parteInteira = Math.floor(numero)
parteFracionaria = numero % 1
numeroArredondado = Math.round(numero)

console.log("Parte inteira: " + parteInteira)
console.log("Parte frácionaria: " + parteFracionaria)
console.log("Número arredondado: " + numeroArredondado)