const prompt = require("prompt-sync")({ sigint: true });

var r = prompt("Digite a razão da PA: ")
var a1 = prompt("Digite o primeiro termo da PA: ")
var a5 = a1 + 4*r
console.log("O quinto termo da PA é ",a5)