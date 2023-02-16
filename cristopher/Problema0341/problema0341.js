const prompt = require("prompt-sync")({ sigvar: true });

const frase = prompt("Digite a sua palavra em letras minusculas: ")
const palavras = frase.split(" ")

for (let i = 0; i < palavras.length; i++) {
    palavras[i] = palavras[i][0].toUpperCase() + palavras[i].substr(1)
}

console.log(palavras)