const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var custo = parseFloat(prompt("Digite o custo de fábrica: "));

//Cálculo do custo ao consumidor
if (custo < 12000) {
    var distribuidor = custo * 0.05;
    var impostos = 0;
}
else if (custo <= 25000) {
    var distribuidor = custo * 0.10;
    var impostos = custo * 0.15;
}
else {
    var distribuidor = custo * 0.15;
    var impostos = custo * 0.20;
}

var preco = custo + distribuidor + impostos;

//Saída
console.log("O custo ao consumidor é: R$" + Math.round(preco * 100) / 100);