const prompt = require("prompt-sync")({ sigint: true })
var nome = prompt("Digite o nome do livro: ")
var escolha = prompt("Tipo de usuário: 1 - Professor 2 - Aluno -- Digite: ")

if( escolha == 1 ){
    console.log("Recibo :\n\t" + nome + "\n\tTipo de usuário: Professor \n\tPrazo: 10 dias.");
} else {
    if ( escolha == 2 ){
        console.log("Recibo :\n\t" + nome + "\n\tTipo de usuário: Aluno \n\tPrazo: 3 dias.");
    } else {
        console.log("Escolha inválida.")
    }   
}