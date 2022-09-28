const prompt = require("prompt-sync")({sigint: true})
/*Entrar com nome, nota da PR1 e nota da PR2 de 15 alunos. 
Imprimir uma listagem, contendo: nome, nota da PR1, nota da PR2 e 
média arredondada de cada aluno. Ao final calcule a media geral da turma */

var nome
var pR1, pR2, media
var mediaTurma = 0, somaTurma = 0

for(var i=0; i<15; i++){
    nome = prompt("Digite seu nome: ")
    pR1 = Number(prompt("Digite a nota da prova 1: "))
    pR2 = Number(prompt("Digite a nota da prova 2: "))
    console.log("")

    media = (pR1 + pR2) / 2

    console.log("Informações do aluno")
    console.log("Nome: "+nome)
    console.log("Nota da Prova 1: "+pR1)
    console.log("Nota da Prova 2: "+pR2)
    console.log("Média Final: "+Math.round(media))
    console.log()

    somaTurma = somaTurma + pR1 + pR2

}

mediaTurma = somaTurma/15
console.log("Média da turma: "+Math.round(mediaTurma))