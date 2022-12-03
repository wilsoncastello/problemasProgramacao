const prompt = require("prompt-sync")({ sigint: true })

var j = 0, k = 0
var vetor = []
var vetorPositivo = []
var vetorNegativo = []
for(let i = 0; i < 8; i++){
    vetor[i] = Number(prompt("Digite um número inteiro: "))
    if(vetor[i] >= 0){
        vetorPositivo[j] = vetor[i]
        j++
    }else{
        vetorNegativo[k] = vetor[i]
        k++
    }
}
console.log("Números do vetor positivo:")
for(let i = 0; i < 8; i++){
    console.log(vetorPositivo[i])
}
console.log("Números do vetor negativo:")
for(let i = 0; i < 8; i++){
    console.log(vetorNegativo[i])
}