const prompt = require("prompt-sync")({sigint: true})

var vetA = []
var vetB = []

for(var i = 0; i<15; i++){
    vetA[i] = prompt("Digite um numero para o vetor A, na posição "+i+": ")

    fat = 1
    for(var j = 1; j<=vetA[i]; j++){
        fat = fat * j
    }
    vetB[i] = fat
}

console.log("Vetor A                Vetor B")
for(var i = 0; i<15; i++){
    console.log("  "+vetA[i]+"        -->         "+vetB[i])
}