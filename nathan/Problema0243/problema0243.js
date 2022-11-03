const prompt = require("prompt-sync")({ sigint: true });
var vA = [20];
var vB = [20];
var vC = [20];

console.log("VETOR A");
for(var i = 0; i < 20; i++){
    vA[i] = prompt("Digite o numero da posição " + (i+1));
}
console.log("VETOR B");
for(var i = 0; i < 20; i++){
    vB[i] = prompt("Digite o numero da posição " + (i+1));
}

for(var i = 0; i < 20; i++){
    vC[i] = vA[i] - vB[i];
}
console.log(vC)