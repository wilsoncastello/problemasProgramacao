const prompt = require("prompt-sync")({ sigint: true })

var n = Number(prompt("Digite um valor inteiro: "))
var soma = 0

var resto = n % 10
n = Math.floor(n/10)
soma = soma + resto
resto = n % 10
n = Math.floor(n/10)
soma = soma + resto
resto = n % 10
n = Math.floor(n/10)
soma = soma + resto
console.log("A soma dos digitos é igual a: " + soma)