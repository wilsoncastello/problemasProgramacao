const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var salarioMinimo = parseFloat(prompt("Digite o valor do salário mínimo: "));
var vendas = parseFloat(prompt("Digite o número de vendas: "));
var vendasValor = parseFloat(prompt("Digite o valor arrecadado das vendas: "));

//Cálculo do salário a receber 
var salario = salarioMinimo * 2 + vendas * 150 + vendasValor * 0.05;

//Saída 
console.log("Salário total R$: " + Math.round(salario * 100) / 100);