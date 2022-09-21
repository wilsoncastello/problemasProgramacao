const prompt = require("prompt-sync")({ sigint: true });

var nome = prompt("Digite o nome do primeiro finalista: ")
var pontuacao = parseFloat(prompt("Pontuação: "))

var nome2 = prompt("Digite o nome do segundo finalista: ")
var pontuacao2 = parseFloat(prompt("Pontuação: "))

var nome3 = prompt("Digite o nome do terceiro finalista: ")
var pontuacao3 = parseFloat(prompt("Pontuação: "))

if(pontuacao > pontuacao2 && pontuacao > pontuacao3){
    console.log("Vencedor: " + nome + ": " + pontuacao + " pontos.")
    if(pontuacao2 > pontuacao3){
        console.log("Segundo colocado: " + nome2 + ": " + pontuacao2 + " pontos.")
        console.log("Terceiro colocado: " + nome3 + ": " + pontuacao3 + " pontos.")
    }else{
        console.log("Segundo colocado: " + nome3 + ": " + pontuacao3 + " pontos.")
        console.log("Terceiro colocado: " + nome2 + ": " + pontuacao2 + " pontos.")
    }
}else if(pontuacao2 > pontuacao && pontuacao2 > pontuacao3){
    console.log("Vencedor: " + nome2 + ": " + pontuacao2 + " pontos")
    if(pontuacao > pontuacao3){
        console.log("Segundo colocado: " + nome + ": " + pontuacao + " pontos.")
        console.log("Terceiro colocado: " + nome3 + ": " + pontuacao3 + " pontos.")
    }else{
        console.log("Segundo colocado: " + nome3 + ": " + pontuacao3 + " pontos.")
        console.log("Terceiro colocado: " + nome + ": " + pontuacao + " pontos.")
    }
}else{
    console.log("Vencedor: " + nome3 + ": " + pontuacao3 + " pontos")
    if(pontuacao2 > pontuacao){
        console.log("Segundo colocado: " + nome2 + ": " + pontuacao2 + " pontos.")
        console.log("Terceiro colocado: " + nome + ": " + pontuacao + " pontos.")
    }else{
        console.log("Segundo colocado: " + nome + ": " + pontuacao + " pontos.")
        console.log("Terceiro colocado: " + nome2 + ": " + pontuacao2 + " pontos.")
    }

}

