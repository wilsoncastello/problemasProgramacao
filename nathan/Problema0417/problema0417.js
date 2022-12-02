const prompt = require("prompt-sync")({ sigint: true });

function converterRad(x){
    return x * (3.14/180);
}

var graus = Number(prompt("Digite o valor em graus para a conversão em radianos: "));

var rad = converterRad(graus);
console.log("Radianos: " + rad);