const prompt = require("prompt-sync")({ sigint: true });

var salMin = Number(prompt("Digite o valor do salário minímo: "));

var valorHoraTrabalhada = salMin / 10;
var valorHoraExtra = valorHoraTrabalhada / 2;

var numHoras = Number(prompt("Digite o número de horas trabalhadas: "));

while(numHoras != -1){
    var numDependentes = Number(prompt("Numero de dependentes: "));
    var quantHorasExtras = Number(prompt("Quantidade de horas extras trabalhadas: "));

    var salarioMes = numHoras * valorHoraTrabalhada;
    var salarioBruto = salarioMes + (valorHoraExtra * quantHorasExtras) + (300 * numDependentes);

    if(salarioBruto <= 1800){
        var salarioLiquido = salarioBruto;
    }else if(salarioBruto <= 5000){
        var salarioLiquido = salarioBruto - (salarioBruto * 0.1);
    }else{
        var salarioLiquido = salarioBruto - (salarioBruto * 0.2);                
    }

    if(salarioLiquido <= 2500){
        var salarioFinal = salarioLiquido + 300;
    }else{
        var salarioFinal = salarioLiquido + 100;
    }

    console.log("Salario Final do funcionario: ", salarioFinal);

    numHoras = Number(prompt("Digite o número de horas trabalhadas(-1 PARA FINALIZAR O PROGRAMA): "));
}
console.log("Programa finalizado");