const prompt = require("prompt-sync")({ sigvar: true });

function conversor(graus){
    radianos = (graus * 3.14) / 180
    return radianos
}

var graus = parseFloat(prompt("Digite um valor (em graus): "))

var valorRadianos = conversor(graus)

console.log(valorRadianos)