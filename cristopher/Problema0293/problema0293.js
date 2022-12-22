const prompt = require("prompt-sync")({ sigvar: true });

var vetor = []
var somaDosNumeros = 0, media = 0;
var contMaioresMedia = 0, contIguaisMedia = 0, contIguais30 = 0;

for (var i = 0; i < 10; i++) {
    numero = parseFloat(prompt("Digite o número na posição ["+i+"]: "))
    vetor[i] = numero
    somaDosNumeros = somaDosNumeros + vetor[i];
}

media = somaDosNumeros / 10;

for (var i = 0; i < 10; i++) {
    if(vetor[i] > media){
        contMaioresMedia++;
    }

    if(vetor[i] == 30){
        contIguais30++;
    }

    if(vetor[i] == media){
        contIguaisMedia++;
    }
}

console.log("Maiores que a média -> " + contMaioresMedia);
console.log("Iguais a 30 -> " + contIguais30);
console.log("Iguais a média -> " + contIguaisMedia);