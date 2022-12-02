const prompt = require("prompt-sync")({ sigint: true })

var vetor1 = [10];
var vetor2 = [10];
for (i=0;i<10;i++) {
    vetor1[i] = Number(prompt("Digite um número inteiro para a posição "+i+" do vetor: "));
}
for(i=0;i<10;i++){
    if(vetor1[i] < 0){
        vetor2[i] = 0;
    }
    else
        vetor2[i] = vetor1[i];
}
console.log("Vetor 1:");
for(i=0;i<10;i++){
    console.log(vetor1[i]);
}
console.log(" ");
console.log("Vetor 2:");
for(i=0;i<10;i++){
    console.log(vetor2[i]);
}