const prompt = require("prompt-sync")({ sigint: true });

/* João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar multa de 2% sobre cada conta. Faça um programa que leia o valor do salário e das duas contas, calcule e mostre quanto restará do salário de João (considere que o salário de João sempre será suficiente para pagar as contas).  */

var salario, conta1, conta2, multa1, multa2, restoSalario;

salario = Number(prompt("Digite o salário de João: "));

conta1 = Number(prompt("Digite o valor da primeira conta: "));

conta2 = Number(prompt("Digite o valor da segunda conta: "));

multa1 = conta1 / 50;
multa2 = conta2 / 50;
restoSalario = salario - conta1 - conta2 - multa1 - multa2;

console.log("Restará "+restoSalario+" reais do salário de João.");