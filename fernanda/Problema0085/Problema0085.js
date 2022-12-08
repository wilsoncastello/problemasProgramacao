const prompt = require("prompt-sync")({ sigint: true });

var nome = prompt("Digite o seu nome: ")
var portugues = +prompt("Digite a nota de Potuguês: ")
var matematica = +prompt("Digite a nota de Matemática: ")
var conhecimentosGerais = +prompt("Digite a nota de Conhecimentos Gerais: ")
console.log(" ")

console.log("Nome do Candidato: "+nome)
console.log("Nota em Potuguês: "+portugues)
console.log("Nota em Matemática: "+matematica)
console.log("Nota em Conhecimentos Gerais: "+conhecimentosGerais)
var media = ((portugues + matematica + conhecimentosGerais)/3)
    console.log("Média: "+media)

    if (media >= 7){
        console.log("Candidato Aprovado")
    } else {
        console.log("Candidato Não Aprovado")
    }
    
