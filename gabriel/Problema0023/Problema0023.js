//Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo. 

const prompt = require('prompt-sync')({ sigint: true });

let n1 = prompt("Digite um numero: ");
let n2 = prompt("Digite outro numero: ");

let subtracao = n1 - n2;

console.log("Subtração de n1 por n2: " + subtracao);