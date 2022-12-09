const prompt = require("prompt-sync")({ sigint: true });
var vA = [5];
var vB = [5];
var vC = [10];

console.log("Vetor A");
for (i = 0; i < 5; i++) {
    vA[i] = Number(prompt("Digite o numero na posição " + i + ": "));
}
console.log("Vetor B");
for (i = 0; i < 5; i++) {
    vB[i] = Number(prompt("Digite o numero na posição " + i + ": "));
}

var j = 0, k = 0;
for (i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        vC[i] = vA[j];
        j++;
    }else{
        vC[i] = vB[k];
        k++;
    }
}
for (i = 0; i < 10; i++) {
    console.log(vC[l] + " ");
}