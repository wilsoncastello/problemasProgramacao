const prompt = require("prompt-sync")({ sigvar: true });

var vetorA = []
var vetorB = []

function vetorUniao(vetorA, vetorB){
    vetorC = []
    var k = 0

    for (var i = 0; i < vetorA.length; i++) {
        vetorC[k++] = vetorA[i];
    }

    for (var i = 0; i < vetorB.length; i++) {
        if(!(existe(vetorB[i], vetorC, k))){
            vetorC[k++] = vetorB[i];
        }
    }

    return vetorC

}

function existe(x, vetorC, k){
    for (var i = 0; i < k; i++) {
        if(vetorC[i] == x){
            return true;
        }
    }

    return false;

}

console.log("Preenchendo o vetor A: ")
for(var i = 0; i < 5; i++){
    vetorA[i] = parseInt(prompt("Digite o numero na posicao ["+i+"]: "))
}

console.log("Preenchendo o vetor B: ")
for(var i = 0; i < 5; i++){
    vetorB[i] = parseInt(prompt("Digite o numero na posicao ["+i+"]: "))
}

var vetorC = []
vetorC = vetorUniao(vetorA, vetorB)
console.log(vetorC)
