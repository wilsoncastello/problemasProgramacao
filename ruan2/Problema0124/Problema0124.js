const prompt = require("prompt-sync")({sigint: true})

/*Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer 
pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a 
tabela a seguir. Crie um algoritmo que entre com o nome e a idade de uma pessoa e imprima o nome e o
valor que ela deverá pagar.
* ate l0 anos -R$ 30 00
* acima de 10 até 29 anos - R$ 60,00
* acima de 29 até 45 anos - R$ 120,00
* acima de 45 até 59 anos - R$ 150,00
* acima de 59 até 65 anos - R$ 250,00
* maior que 65 anos - R$ 400,00 */

var nome, idade

//Entrada de dados
nome = prompt("Digite a seu nome: ")
idade = int(prompt("Digite a sua idade: "))

//Processamento e Saída de dados
if(idade <= 10){
    console.log("Valor da conta do "+nome+" - R$ 30")
}
else{
    if(idade <= 29){
        console.log("Valor da conta do "+nome+" - R$ 60")
    }
    else{
        if(idade <= 45){
            console.log("Valor da conta do "+nome+" - R$ 120")
        }
        else{
            if(idade <= 59){
                console.log("Valor da conta do "+nome+" - R$ 150")
            }
            else{
                if(idade <= 65){
                    console.log("Valor da conta do "+nome+" - R$ 250")
                }
                else{
                    console.log("Valor da conta do "+nome+" - R$ 400")
                }
            }
        }
    }
}