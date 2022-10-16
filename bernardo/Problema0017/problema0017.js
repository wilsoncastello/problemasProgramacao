const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var salarioBase = parseFloat(prompt("Digite o salário base: "));

//Cálculo do salário a receber
var salario = (salarioBase * 0.9) + 50;

//Saída 
console.log("Salário a receber R$: " + Math.round(salario * 100) / 100);