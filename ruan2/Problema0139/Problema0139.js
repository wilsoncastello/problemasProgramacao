const prompt = require("prompt-sync")({sigint: true})

/*Faça um programa que leia os valores de quatro notas escolares 
bimestrais de um aluno representadas pelas variáveis N1, N2, N3 e N4, 
calcule a média aritmética (variável MD1) desse aluno e apresente a 
mensagem "Aprovado" se a média obtida for maior ou igual a 7; 
caso contrário, o programa deve solicitar a quinta nota (nota de exame, 
representada pela variável NE) do aluno e calcular uma nova média aritmética 
(variável MD2) entre a nota de exame e a primerira média aritmática. 
Se o valor da nova média for maior ou igual a cinco, apresentar a mensagem 
"Aprovado em exame"; caso contrário, apresentar a mensagem "Reprovado". O programa 
deve informar também, após a apresentação das mensagens, o valor da média obtida pelo aluno.*/

var N1, N2, N3, N4, NE
var MD1, MD2

N1 = Number(prompt("Digite a primeira nota do aluno(a): "))
N2 = Number(prompt("Digite a segunda nota do aluno(a): "))
N3 = Number(prompt("Digite a terceira nota do aluno(a): "))
N4 = Number(prompt("Digite a quarta nota do aluno(a): "))

MD1 = (N1 + N2 + N3 + N4)/4

if(MD1 >= 7){
    console.log("Aprovado!")
    console.log("Media Final: "+MD1)
}
else{
    console.log("Não passou de primeira")
    NE = Number(prompt("Digite a nota do Exame do aluno(a): "))
    MD2 = (NE + MD1)/2
    if(MD2 >= 5){
        console.log("Aprovado em exame!")
        console.log("Media Final: "+MD2)
    }
    else{
        console.log("Reprovado")
        console.log("Media Final: "+MD2)
    }
}