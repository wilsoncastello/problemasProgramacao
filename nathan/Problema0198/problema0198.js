const prompt = require("prompt-sync")({ sigint: true });

var n1 = Number(prompt("Digite o primeiro número: "));
var n2 = Number(prompt("Digite o segundo número: "));
console.log(n1);
console.log(n2);
for (i = 0; i < 5; i++) {
  var n3 = n1 + n2;
  console.log(n3);
  n1 = n2;
  n2 = n3;
}