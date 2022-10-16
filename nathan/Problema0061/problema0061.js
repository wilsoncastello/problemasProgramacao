const prompt = require("prompt-sync")({ sigint: true });

var abcissa = Number(prompt("Digite o valor da abcissa: "));
var ordenada = Number(prompt("Digite o valor da ordenada: "));
var quadrante2 = new Boolean();
if(abcissa < 0 && ordenada > 0)
    quadrante2 = true;
else
    quadrante2 = false;
console.log("O ponto está no quadrante 2? " + quadrante2);