const prompt = require("prompt-sync")({ sigint: true })

var vetor = []
var maior = 0
console.log("Digite 10 números inteiros: ")
for(let i = 0; i < 10; i++){
    vetor[i] = Number(prompt());
    if(vetor[i] > maior)
        maior = vetor[i]
}
console.log("\nVetor após os cálculos: ")
for(let i = 0; i < 10; i++){
    vetor[i] /= maior
    console.log(vetor[i])
}
