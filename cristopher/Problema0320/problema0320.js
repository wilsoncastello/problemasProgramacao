const prompt = require("prompt-sync")({ sigvar: true });

var vetorA = []
var vetorB = []
var vetorC = []

console.log("VETOR A")
for(var i = 0; i < 5; i++){
    vetorA[i] = parseInt(prompt("Informe o numero na posição ["+i+"]: "))

    while(!(vetorA[i] % 2 == 0 || vetorA[i] % 3 == 0)){
        console.log("Por favor, respeite as condições...")
        vetorA[i] = parseInt(prompt("Informe o numero na posição ["+i+"]: "))
    }
}

console.log("VETOR B")
for(var i = 0; i < 5; i++){
    vetorB[i] = parseInt(prompt("Informe o numero na posição ["+i+"]: "))

    while(vetorB[i] % 5 == 0){
        console.log("Por favor, respeite as condições...")
        vetorB[i] = parseInt(prompt("Informe o numero na posição ["+i+"]: "))
    }
}

for(var i = 0; i < 5; i++){
    vetorC[i] = vetorA[i]
}

var j = 0;
for(var i = 5; i < 10; i++){
    vetorC[i] = vetorB[j]
    j++
}

for(var i = 0; i < 10; i++){
    console.log(vetorC[i] + "  ")
}
