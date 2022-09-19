//Elabore um algoritmo que tome como entrada o número do mês (1 a 12) e o respectivo valor do ano e determine o número de dias desse mês. Veja que um mês apresenta 30 ou 31 dias, exceto o mês de fevereiro que tem 28 dias. Entretanto, fevereiro tem 29 dias caso o ano seja bissexto. Um ano é bissexto se for múltiplo de 4.

const prompt = require('prompt-sync')({sigint: true});

let mes = prompt("Digite o mês desejado: ");
let ano = prompt("Digite o ano em questão: ");

if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12){
    console.log("Esse mês tem 31 dias");

} else if(mes == 2){
    if(ano % 4 == 0){
        console.log("Esse mês tem 29 dias");
    
    }else{
        console.log("Esse mês tem 28 dias");
    }

} else {
    console.log("Esse mês tem 30 dias");
}