const prompt = require("prompt-sync")({ sigint: true });

var cargoFuncionario = parseInt(prompt("Digite o cargo do funcionário (1-Programador Júnior; 2-Programador Pleno; 3-Programador Sênior; 4-Analista de Sistemas; 5-Outros):"));
var salarioAtual = parseFloat(prompt("Digite o salário do funcionário:"));
if(cargoFuncionario == 1){
    novoSalario = salarioAtual * 1.2;
    valorAumento = novoSalario - salarioAtual;
    console.log("O funcionário que ocupa o cargo de Programador Júnior, aumentou seu salário em R$"+valorAumento+" e seu novo salário é de R$"+novoSalario);
}
else if(cargoFuncionario == 2){
    novoSalario = salarioAtual * 1.25;
    valorAumento = novoSalario - salarioAtual;
    console.log("O funcionário que ocupa o cargo de Programador Pleno, aumentou seu salário em R$"+valorAumento+" e seu novo salário é de R$"+novoSalario);
}
else if (cargoFuncionario == 3){
    novoSalario = salarioAtual * 1.27;
    valorAumento = novoSalario - salarioAtual;
    console.log("O funcionário que ocupa o cargo de Programador Sênior, aumentou seu salário em R$"+valorAumento+" e seu novo salário é de R$"+novoSalario);
}
else if (cargoFuncionario == 4){
    novoSalario = salarioAtual * 1.3;
    valorAumento = novoSalario - salarioAtual;
    console.log("O funcionário que ocupa o cargo de Analista de Sistemas, aumentou seu salário em R$"+valorAumento+" e seu novo salário é de R$"+novoSalario);
}
else if(cargoFuncionario == 5){
    novoSalario = salarioAtual * 1.22;
    valorAumento = novoSalario - salarioAtual;
    console.log("O funcionário que ocupa o cargo de 'Outros', aumentou seu salário em R$"+valorAumento+" e seu novo salário é de R$"+novoSalario);
}
else
    console.log("Cargo inválido, tente novamente!");