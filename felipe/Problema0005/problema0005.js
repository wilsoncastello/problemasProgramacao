const prompt = require("prompt-sync")({ sigint: true});
var cm = prompt("Digite o raio do círculo em cm: ")

var area = Math.PI * cm**2

console.log("A área deste círculo é de: " + area) 