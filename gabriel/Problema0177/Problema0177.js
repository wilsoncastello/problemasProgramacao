//Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e mostre o maior e o menor valor do conjunto. Considere que: *Para encerrar a entrada de dados, deve ser digitado o valor zero; *Para valores negativos, deve ser enviada uma mensagem; *Os valores negativos ou iguais a zero não entrarão nos cálculos.

const prompt = require('prompt-sync')({ sigint: true });

let valor = parseInt(prompt("Digite valores inteiros e positivos (quando desejar encerrar o programa digite '0')"));

let maior = 0;
let menor = 299999999;

while (valor != 0) {

  if (valor > maior) {
    maior = valor;
  }

  if (valor < menor && valor > 0) {
    menor = valor;

  } else if (valor < 0) {
    console.log("Os valores negativos ou iguais a zero não entrarão nos cálculos");
  }
  valor = parseInt(prompt());
}

console.log("Maior valor digitado: " + maior);
console.log("Menor valor digitado: " + menor);