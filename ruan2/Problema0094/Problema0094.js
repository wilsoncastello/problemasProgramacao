const prompt = require("prompt-sync")({sigint: true})

/*Um hotel cobra R$130,00 a diária e mais uma taxa de serviços. 
A taxa de serviços é de: 
R$8,50 por diária, se o número de diárias for maior que 15; 
R$10,00 por diária, se o número de diárias for igual a 15; 
R$12,00 por diária, se o número de diárias for menor que 15. 
Construa um algoritmo que mostre o nome e a conta de um cliente. */

var diariaTotal
var nome
var numDias

//Entrada de dados
console.log("Olá, digite suas informações!")
nome = prompt("Seu nome: ")
numDias = Number(prompt("Quantidade de dias hospedado: "))

//Processamento
if(numDias > 15){
    diariaTotal = (numDias * 130) + (numDias * 8.5)
}
else{
    if(numDias == 15){
        diariaTotal = (numDias * 130) + (numDias * 10)
    }
    else{
        diariaTotal = (numDias * 130) + (numDias * 12)
    }
}

//Saída de dados
console.log("Informações do hospede")
console.log("Nome: "+nome)
console.log("Conta: "+diariaTotal)
