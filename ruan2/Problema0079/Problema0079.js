const prompt = require("prompt-sync")({sigint: true})

/*Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer*/

//Entrada de dados
var base = Number(prompt("Digite o valor da base: "))
var indice = Number(prompt("Digite o valor do índice: "))

//Processamento
num = Math.pow(base, indice)

//Saída de dados
console.log("O valor da operação é: "+num)