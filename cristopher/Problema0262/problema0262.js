const prompt = require("prompt-sync")({ sigvar: true });

var vetor = []
var contMaioresQue50 = 0

for (var i = 0; i < 10; i++) {
    vetor[i] = parseInt(prompt("Digite o numero na posição ["+i+"]: "))
}

for (var i = 0; i < 10; i++) {
    if(vetor[i] > 50){
        contMaioresQue50++
        console.log("["+i+"]: " + vetor[i] + " é maior do que 50.")
    }
}

if(contMaioresQue50 == 0){
    console.log("Não há nenhum número com essa condição.")

}