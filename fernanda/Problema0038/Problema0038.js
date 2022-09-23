const prompt = require("prompt-sync")({ sigint: true });

var numero = prompt("Digite um número: ")

sucessor = numero+1
antecessor = numero-1

console.log("Sucessor: "+sucessor)
console.log("Antecessor: "+antecessor)