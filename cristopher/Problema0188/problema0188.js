const prompt = require("prompt-sync")({ sigint: true });

console.log("TABELA DE CONVERSÃO DE POLEGADA PARA CENTÍMETRO");

for (var i = 1; i <= 20; i++) {
    console.log("["+i+"] Polegada(s): " + i * 2.54 + " centímetros.");
}