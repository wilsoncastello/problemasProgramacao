const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var razao= parseFloat(prompt("Digite a razão da PG: "));
var termo1 = parseFloat(prompt("Digite o primeiro termo: "));
var posicaoN = parseFloat(prompt("Digite a posição desejada: "));

//Cálculo do termo da PG
var termoN = termo1 * Math.pow(razao,posicaoN-1);

//Saída 
console.log("O termo" + posicaoN + " é: " + termoN);