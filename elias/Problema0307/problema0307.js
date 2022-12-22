const prompt = require("prompt-sync")({ sigint: true })

var A = [10];
var B = [10];
quantidadeElementosComuns = 0;
for (i=0;i<10;i++) {
    A[i] = Number(prompt("Digite a temperatura em Graus Celsius para a posição "+i+" do vetor:"));
}
for(i=0;i<10;i++){
    B[i] = A[i] * 9 / 5 + 32;
}
for(i=0;i<10;i++){
    console.log("Temperatura em Graus Celsius: "+A[i]+"   Temperatura em Graus Fahrenheit: "+B[i]);
}
