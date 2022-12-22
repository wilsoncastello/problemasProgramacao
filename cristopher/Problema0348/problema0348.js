const prompt = require("prompt-sync")({ sigvar: true });

var frase = prompt("Informe a frase a ser separada: ")

var fraseLista = frase.split(" ")
var tamanho = fraseLista.length

for(var i = 0; i < tamanho; i++){
    console.log(fraseLista[i])
}

