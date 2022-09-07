const prompt = require("prompt-sync")({ sigint: true });

var racao = prompt("Digite quantas gramas de ração tem no saco: ");
var gato1gr = prompt("Digite quantas gramas o gato 1 come de ração por dia: ");
var gato2gr = prompt("Digite quantas gramas o gato 2 come de ração por dia: ");

var gato1kg = gato1gr / 1000
var gato2kg = gato2gr / 1000
var sobra = racao - ((gato1kg + gato2kg) * 5);
console.log("Sobrará "+sobra+" no saco de ração após 5 dias.");