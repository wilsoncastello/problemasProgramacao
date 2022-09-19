//Faça um programa que leia um número inteiro de 4 casas e imprima se o algarismo que está nas casas das unidades de milhar é ou não múltiplo de quatro.

const prompt = require('prompt-sync')({sigint: true});

let n = prompt("Digite um número inteiro de 4 digitos: ");

let x = n / 1000;

if(parseInt(x) % 4 == 0){
    console.log("O número da unidade de milhar é multiplo de quatro");
}

else{
    console.log("O número da unidade de milhar não é multiplo de quatro");
}