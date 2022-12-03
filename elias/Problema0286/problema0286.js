const prompt = require("prompt-sync")({ sigint: true })

var vetor1 = [10];
var vetor2 = [10];
quantidadeElementosComuns = 0;
for (i=0;i<10;i++) {
    vetor1[i] = Number(prompt("Digite um número inteiro para a posição "+i+" do primeiro vetor: "));
}
for (i=0;i<10;i++) {
    vetor2[i] = Number(prompt("Digite um número inteiro para a posição "+i+" do segundo vetor: "));
}
console.log("Elementos comuns aos conjuntos:");
for(i=0;i<10;i++){
    for(j=0;j<10;j++){
        if(vetor1[i] == vetor2[j]){
            console.log(vetor1[i]);
            quantidadeElementosComuns++;
        }
    }
}
if(quantidadeElementosComuns == 0){
    console.log("Não há nenhum elemento comum aos conjuntos!");
}