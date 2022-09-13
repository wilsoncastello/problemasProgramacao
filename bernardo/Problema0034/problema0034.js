const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var horaT = parseFloat(prompt("Digite o número de horas trabalhadas: "));
var salarioMinimo = parseFloat(prompt("Digite o salário mínimo: "));
var horaE = parseFloat(prompt("Digite o número de horas extras: "));

//Cálculo do salário a receber
var salarioBruto = horaT * (salarioMinimo / 8);
var quantiaExtra = horaE * (salarioMinimo / 4);
var salario = salarioBruto + quantiaExtra;

//Saída 
console.log("Salário a receber R$: " + Math.round(salario * 100) / 100);