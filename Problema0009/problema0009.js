const prompt = require("prompt-sync")({ sigint: true });

let x = prompt("Escreve o primeiro numero: ")
let y = prompt("Escreve o segundo numero: ")

let z = x**y;
console.log(z)

