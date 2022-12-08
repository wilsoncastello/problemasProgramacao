const prompt = require("prompt-sync")({ sigint: true });

var A = parseInt(prompt("Digite o primeiro número: "));
var B = parseInt(prompt("Digite o segundo número: "));

var multiplo = (A % B == 0 || B % A == 0);

console.log(A+" e "+B+" são múltiplos: "+multiplo)