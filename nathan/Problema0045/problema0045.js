const prompt = require("prompt-sync")({ sigint: true });

var n = Number(prompt("Digite um número: "));
var quadrado = n * n;
var raiz = Math.sqrt(n);
console.log("Numero: " + n);
console.log("Quadrado do número: " + quadrado);
console.log("Raiz: " + raiz);