const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var lista = []
var tamanho = 10
var quantidade = 0

for (var i = 0; i < tamanho; i++) {
    valor = parseFloat(prompt("Digite o " + (i + 1) + " número (digite 0 para finalizar): "));
    if (valor == 0) {
        break;
    }
    else {
        lista[i] = valor;
    }
}

// Cálculo da quantidade do último número
for (var i = 0; i < lista.length ; i++) {
    if (lista[i] == lista[lista.length - 1]) {
        quantidade++;
    }
}

// Saída
console.log("Quantidade de " + lista[lista.length - 1] + " digitados: " + quantidade);
