const prompt = require("prompt-sync")({ sigint: true })

let vetor = []

for(let i = 0; i < 10; i++){
    vetor[i] = prompt("Digite um número: ")
}
let j = 0
while(vetor[j]>0 && j<10){
    j=j+1
}
if(j=9){
    console.log("Não existem valores negativos")
}else{
    console.log("O número negativo está na posição: "+j)
}
