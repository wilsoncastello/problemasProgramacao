const prompt = require("prompt-sync")({ sigint: true });
var contPessoa300Comida = 0;
var somaMedia300Comida = 0, somaAluguel = 0, percAlimentacao, percVestimenta;

for(i = 0; i < 3; i++){
    console.log("Pessoa " + (i+1) + ": ");
    var rendaFamilia = Number(prompt("Digite a renda mensal da família: "));
    var gastoAlimentacao = Number(prompt("Gasto com alimentação: "));
    var gastoVestimenta = Number(prompt("Gasto com vestimenta: "));
    var gastoAluguel = Number(prompt("Gasto com aluguel: "));

    if(gastoAlimentacao > 300){
        contPessoa300Comida++;
        somaMedia300Comida = somaMedia300Comida + gastoAlimentacao;
    }
    somaAluguel = somaAluguel + gastoAluguel;
    percAlimentacao = (gastoAlimentacao * 100) / rendaFamilia;
    percVestimenta = (gastoVestimenta * 100)/ rendaFamilia;

    console.log("Aluno " + (i+1) + ":");
    console.log("Proporção de gastos com alimentação em relação a renda " + percAlimentacao + "%");
    console.log("Proporção de gastos com vestimenta em relação a renda " + percVestimenta + "%");
}
console.log("Renda média familiar dos alunos que gastam acima de R$ 300,00 com alimentação: " + somaMedia300Comida / contPessoa300Comida);
console.log("Gasto médio com aluguel: " + somaAluguel / 3);