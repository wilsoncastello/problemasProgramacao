const prompt = require("prompt-sync")({ sigint: true });
var vA = [];
var vB = [];
var n = Number(prompt("Digite o tamanho do vetor: "))
var x = 0;

for (i = 0; i < n; i++) {
  vA[i] = Number(prompt("Digite o valor na posição " + i + ":"));
}
for (i = 0; i < n; i++) {
  for (j = 0; j <= i; j++) {
    x = x + vA[j];
  }
  vB[i] = x;
  x = 0;
}

console.log("\nVETOR B");
for (i = 0; i < n; i++) {
  console.log(vB[i] + " ");
}