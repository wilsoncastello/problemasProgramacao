const prompt = require("prompt-sync")({ sigint: true })
var num = prompt("Digite um número: ")

if( num % 3 == 0 && num % 7 == 0 ){
   console.log("Esse número é divisível por 3 e por 7.");
} else {
   console.log("Esse número não é divisível por 3 e 7.");
} 