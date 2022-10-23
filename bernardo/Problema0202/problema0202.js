const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores e verificação de númeroos maiores que 30
var quantidade = 0;

for (var i = 0; i < 15; i++) {
    var num = parseFloat(prompt("Digite o " + (i + 1) + " número: "));
    if (num > 30) {
        quantidade++;
    }
}

// Saída
console.log("A quantidade de números maiores que 30 é: " + quantidade);


