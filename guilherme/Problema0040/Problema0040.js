const prompt = require("prompt-sync")({ sigint: true });

var n = Number(prompt("Digite um número real: "));
var terco = n / 3;
console.log("A terça parte de: " + n + " é: " + terco);