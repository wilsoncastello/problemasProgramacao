const prompt = require("prompt-sync")({ sigint: true });

var salarioMinimo = Number(prompt("Digite o valor do salário mínimo: "));
var salarioFuncionario = Number(prompt("Digite o valor do salário do funcionário: "));
var quantSalarioMinimo = salarioFuncionario / salarioMinimo;
console.log("Quantidade de Quantidade de salários mínimos que o funcionario ganha: " + quantSalarioMinimo);