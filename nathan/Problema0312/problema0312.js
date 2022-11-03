const prompt = require("prompt-sync")({ sigint: true });
var n = Number(prompt("Digite o tamanho do vetor: "));
var menorN = Number.MAX_VALUE, maiorN = Number.MIN_VALUE, posMaior = 0, posMenor = 0, diferenca = 0, posIgual, novaDiferenca;
var v = [n];

for (i = 0; i < n; i++) {
    v[i] = Number(prompt("Digite o vetor na posição " + i + ":"));
}
for (i = 0; i < n; i++) {
    if(menorN > v[i]){
        menorN = v[i];
        posMenor = i;
    }
    if(maiorN < v[i]){
        maiorN = v[i];
        posMaior = i;
    }
}
if(posMaior > posMenor){
    diferenca = posMaior - posMenor;
}else{
    diferenca = posMenor - posMaior;
}
for (i = 0; i < n; i++) {
    if(menorN == v[i]){
        posIgual = i;
        novaDiferenca = posIgual - posMaior;
        if(novaDiferenca < 0)
            novaDiferenca = novaDiferenca * -1;
        if((novaDiferenca) > diferenca){
            diferenca = novaDiferenca;
        }
    }
    if(maiorN == v[i]){
        posIgual = i;
        novaDiferenca = posIgual - posMaior;
        if(novaDiferenca < 0)
            novaDiferenca = novaDiferenca * -1;
        if((novaDiferenca) > diferenca){
            diferenca = novaDiferenca;
        }
    }
}


console.log("Diferença: " + diferenca);