const prompt = require("prompt-sync")({ sigint: true })

var vetor = []
var x = 1, maior = 0
console.log("Digite uma sequência de 10 números")
for(let i = 0; i < 10; i++){
    vetor[i] = Number(prompt())
    if(i == 0 || (i > 0 && vetor[i] < vetor[i-1]))
        x = 1
    else if(i > 0 && vetor[i] > vetor[i-1])
        x++
    if(x > maior)
    maior = x
}
console.log("Maior Sequência: "+maior)