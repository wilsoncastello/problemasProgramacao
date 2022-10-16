//Faça um programa que leia dois numeros reais e imprima o quadrado da diferença do primeiro valor pelo segundo e a diferença dos quadrados.

const prompt = require('prompt-sync')({ sigint: true });

//entrada
let n1 = prompt("Digite um número real: ");
let n2 = prompt("Digite outro número real: ");

//cálculo
let QuadradoDiferenca = (n1 - n2) * (n1 - n2);
let DiferencaQuadrados = (n1 * n1) - (n2 * n2);

//saída
console.log("O quadrado da diferença de n1 para n2: " + QuadradoDiferenca);
console.log("A diferença do quadrado de n1 para o quadrado de n2: " + DiferencaQuadrados);