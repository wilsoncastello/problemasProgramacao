const prompt = require("prompt-sync")({ sigint: true });

/*Um trabalhador recebeu seu salário e o depositou em sua conta 
bancária. Esse trabalhador emitiu dois cheques e agora deseja 
saber seu saldo atual. Sabe-se que cada operação bancária de 
retirada paga CPMF de 0,38% e o saldo inicial da conta está 
zerado. Faça um programa que leia o valor do salário e dos 
dois cheques emitidos, calcule e aprensente o saldo atual da conta.*/

var sal, saldo;
var valCheq1, valCheq2;
var valTotalcheque1, valTotalcheque2;

//Entrada de dados
sal = prompt("Digite o valor do seu salário: ");
valCheq1 = Number(prompt("Digite o valor do primeiro cheque: "));
valCheq2 = Number(prompt("Digite o valor do segundo cheque: "));

//Processamento
valTotalcheque1 = (38*valCheq1)/100 + valCheq1;
valTotalcheque2 = (38*valCheq2)/100 + valCheq2;
saldo = sal - valTotalcheque1 - valTotalcheque2;

//Saída de dados
console.log("Saldo atual: "+ saldo);