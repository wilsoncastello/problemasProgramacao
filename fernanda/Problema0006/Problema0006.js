const prompt = require("prompt-sync")({ sigint: true });

var salario = prompt("Digite o valor do salário: ");
var novoSalario = salario + (salario*0.25);

console.log("O valor do salário atualizado é: "+novoSalario);