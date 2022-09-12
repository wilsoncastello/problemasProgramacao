const prompt = require("prompt-sync")({ sigint: true });

/*Faça um programa que receba o raio, calcule e mostre: 
a) o comprimento de uma esfera; sabe-se que C = 2 * π R; 
b) a área de uma esfera; sabe-se que A = 4 π R²; 
c) o volume de uma esfera; sabe-se que V = 4/3 * π * R³*/

var raio;
var compEsf, areaEsf, volEsf;

//Entrada de dados
raio = Number(prompt("Digite o valor do raio da esfera: "));

//Processamento
compEsf = 2 * 3.14 * raio;
areaEsf = 4 * 3.14 * (raio * raio);
volEsf = 4 * 3.14 * (raio * raio * raio)/3;

//Saída de dados
console.log("Comprimento da esfera: "+compEsf)
console.log("Área da esfera: "+areaEsf)
console.log("Volume da esfera: "+volEsf)