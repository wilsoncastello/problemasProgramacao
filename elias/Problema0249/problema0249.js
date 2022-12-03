const prompt = require("prompt-sync")({ sigint: true })

var A = [10];
var B = [10];
for (i=0;i<10;i++) {
    A[i] = Number(prompt("Digite um número inteiro para a posição "+i+" do vetor: "));
}
for(i=0;i<10;i++){
    somatorio = 0;
    for(j=1;j<=A[i];j++){
        somatorio += j;
        B[i] = somatorio;
    }
}
console.log("Vetor B:");
for (i=0;i<10;i++) {
    console.log(B[i]);
}