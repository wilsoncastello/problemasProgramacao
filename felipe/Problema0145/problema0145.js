const prompt = require("prompt-sync")({ sigint: true })

var salario = prompt("Digite o salário minímo: ")
var horasTrabalho = prompt("Digite as horas trabalhadas: ")
var dependentes = prompt("Digite a quantidade de dependentes: ")
var horasExtraTrabalhada = prompt("Digite as horas extras : ")

hora = salario / 5;

salarioMes = horasTrabalho * hora;

depSalario = dependentes * 200;

horasExtra = horasExtraTrabalhada * (hora + hora * 50 / 100);

salarioBruto = salarioMes + depSalario + horasExtra;

if (salarioBruto <= 2000){
    console.log("Isento de imposto.\n\tSalario bruto: ",salarioBruto);
} else {
    if (salarioBruto <= 5000){
        imposto = salarioBruto * 15 / 100;
    } else {
        imposto = salarioBruto * 27.5 / 100;
    }
}

salarioLiquido = salarioBruto - imposto;

if (salarioLiquido < 3000){
    salarioFinal = salarioLiquido + 1000;
    console.log("Salário final: ",salarioFinal);
} else {
    salarioFinal = salarioLiquido + 500;
    console.log("Salário final: ",salarioFinal);
}
