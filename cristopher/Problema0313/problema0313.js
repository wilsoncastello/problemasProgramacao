const prompt = require("prompt-sync")({ sigvar: true });

var posPar = 0
var vet = []

for(var i = 0; i < 10; i++){
    vet[i] = parseInt(prompt("Digite o numero na posicao ["+i+"]: "))
}

for(var i = 0; i < 10; i++){
    if(vet[i] % 2 == 0){
        posPar = i
    }
}

console.log("Posicao do ultimo numero par: " + posPar)

