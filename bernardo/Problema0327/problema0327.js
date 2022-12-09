const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var lista = []
var tamanho = 0
var quantidade = 0

var tamanho = parseInt(prompt("Digite o número de funcionários da empresa: "));

for (var i = 0; i < tamanho; i++) {
    funcionario = (prompt("Digite a profissão do " + (i + 1) + " funcionário: "));
    lista[i] = funcionario;
}

// Cálculo da quantidade de dentistas na empresa
for (var i = 0; i < lista.length; i++) {
    if (lista[i].toLowerCase() == "dentista") {
        quantidade++;
    }
}

// Saída
console.log("Quantidade de dentistas da empresa: " + quantidade);
