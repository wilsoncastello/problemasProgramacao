const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores
var massa = parseFloat(prompt("Digite a massa (em gramas): "));

// Cálculo do tempo necessário
var segundos = 0;
while (massa >= 0.05) {
    massa /= 2;
    segundos += 50;
}

// Saída
console.log("O tempo necessário é: " + segundos + " segundos");