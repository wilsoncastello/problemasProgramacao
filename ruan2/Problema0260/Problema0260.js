const prompt = require("prompt-sync")({sigint: true})

/*Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor.
Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram 
(mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.*/

var k = 0, j = 0
var tempMenor = 0, tempMaior = 0
tempM = []
mes = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]

for(var i = 0; i < 12; i++){

    temp = Number(prompt("Digite a temperatura media do mês "+(i + 1)+": "))
    tempM[i] = temp

    if(i == 0){
        tempMaior = tempMenor = tempM[i]
    }
    else{
        if(tempM[i] > tempMaior){
            tempMaior = tempM[i]
            k = i
        }
        else{

            if(tempM[i] < tempMenor){
                tempMenor = tempM[i]
                j = i
            }
        }
    }
}
console.log("A maior temperatura registrada foi do mês de "+mes[k]+", com "+tempMaior+" graus")
console.log("A menor temperatura registrada foi do mês de "+mes[j]+", com "+tempMenor+" graus")