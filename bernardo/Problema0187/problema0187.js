const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var numeros = new Array();

for (var i = 0; i < 15; i++) {
    numeros[i] = parseFloat(prompt("Digite o " + (i + 1) + " número: "));
}

// Saída e cálculo da raíz quadrada
for (var i = 0; i < 15; i++) {
    var raizQuadrada = Math.sqrt(numeros[i]);
    console.log("A raíz quadrada de " + numeros[i] + " é: " + raizQuadrada);
}
