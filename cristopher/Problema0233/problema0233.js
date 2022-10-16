const prompt = require("prompt-sync")({ sigvar: true });

var resultado = 0;

var numero = parseInt(prompt("Digite um numero: "))

var vezes = parseInt(prompt("Digite por quantas vezes quer multiplicar esse numero: "))

for (var i = 0; i < vezes; i++) {
    resultado = resultado + numero;
            
}

console.log("O resultado de "+ numero +"x"+ vezes + " é: " + resultado );