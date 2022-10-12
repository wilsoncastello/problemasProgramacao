const prompt = require("prompt-sync")({ sigvar: true });

var vetorA = []
var vetorB = []
var vetorC = []
var vetorD = []

console.log("Preenchendo o vetor A")
for(var i = 0; i < 5; i++) {
    vetorA[i] = parseFloat(prompt("Informe o elemento ["+i+"]: "))
}

console.log("Preenchendo o vetor B")
for(var i = 0; i < 5; i++) {
    vetorB[i] = parseFloat(prompt("Informe o elemento ["+i+"]: "))
}

console.log("Preenchendo o vetor C")
for(var i = 0; i < 5; i++) {
    vetorC[i] = parseFloat(prompt("Informe o elemento ["+i+"]: "))
}

var j = 0;
for (var i = 0; i < vetorA.length; i++) {
    vetorD[j++] = vetorA[i];
}

for (var i = 0; i < vetorB.length; i++) {
    vetorD[j++] = vetorB[i];
}

for (var i = 0; i < vetorC.length; i++) {
    vetorD[j++] = vetorC[i];
}

console.log("O vetor D (junção)")
for(var i = 0; i < 15; i++){
    console.log("["+i+"]: " + vetorD[i])
}