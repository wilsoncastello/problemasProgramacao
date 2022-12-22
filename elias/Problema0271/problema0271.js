const prompt = require("prompt-sync")({ sigint: true })

var N = parseInt(prompt("Digite a quantidade de números para o vetor:"));
var vetor = [N];
for (i=0;i<N;i++) {
    vetor[i] = Number(prompt("Digite a temperatura em Graus Celsius para a posição "+i+" do vetor:"));
}
console.log("Números múltiplos de 2:");
for(i=0;i<N;i++){
    if(vetor[i] % 2 == 0){
        console.log(vetor[i]);
    }
}
console.log("Números múltiplos de 3:");
for(i=0;i<N;i++){
    if(vetor[i] % 3 == 0){
        console.log(vetor[i]);
    }
}
console.log("Números multiplos de 2 e de 3:");
for(i=0;i<N;i++){
    if(vetor[i] % 2 == 0 && vetor[i] % 3 ==0){
        console.log(vetor[i]);
    }
}