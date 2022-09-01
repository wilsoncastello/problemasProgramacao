const prompt = require("prompt-sync")({ sigint: true });

var tempoGastoHoras = parseFloat(prompt("Informe o tempo gasto na viagem (em horas): "))

var velocidadeMedia = parseFloat(prompt("Informe a velocidade média na viagem (em km): "))

var distanciaPercorrida = velocidadeMedia * tempoGastoHoras

var qtdLitros = distanciaPercorrida / 12

console.log("A distância percorrida no total foi de " + distanciaPercorrida + " Km.")
console.log("A quantidade de litros gasta na viagem foi de " + qtdLitros + " L.")