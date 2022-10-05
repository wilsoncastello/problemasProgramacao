const prompt = require("prompt-sync")({ sigint: true });

var somaSalarios = 0;
var mulheresAte2000 = 0;
var pessoas = 0;
var maioridade = 0;
var menorIdade = 200;
var menorSalario = 999999;
do{
var idade = parseInt(prompt("Digite sua idade: (Digite um valor negativo para sair do programa!):"));
if(idade < 0){
    break;
}
var genero = prompt("Digite seu gênero (M = Masculino; F = Feminino):");
var salario = parseFloat(prompt("Digite seu salário:"));
somaSalarios = somaSalarios + salario;
pessoas++;
if(idade > maioridade){
    maioridade = idade;
}
if(idade < menorIdade){
    menorIdade = idade;
}
if(genero == 'F' && salario <= 2000 || genero == 'f' && salario <= 2000){
    mulheresAte2000++;
}
if(salario < menorSalario){
    menorSalario = salario;
    generoMenorSalario = genero;
    idadeMenorSalario = idade;
}
} while (idade >= 0);
mediaSalarios = somaSalarios / pessoas;
console.log("A média de todos os salário é: "+mediaSalarios);
console.log("A maior idade do grupo é "+maioridade+" e a menor é "+menorIdade);
console.log("A quantiade de mulheres com salário até R$ 2000,00 é: "+mulheresAte2000);
console.log("A idade da pessoa que possui o menor salário é "+idadeMenorSalario+" e ela é do gênero "+generoMenorSalario);