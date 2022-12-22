const prompt = require("prompt-sync")({ sigvar: true });

var matriz = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

//Preenchendo a matriz
for(var i = 0; i < 5; i++){
    for(var j = 0; j < 5; j++){
        matriz[i][j] = prompt("Digite um numero na posicao ["+i+", "+j+"]: ")
    }
}

opcao = parseInt(prompt("Deseja solicitar uma linha para ser verificada? 0 (sim), -1(não)"))

while(opcao != -1){
    linhaEscolhida = parseInt(prompt("Digite uma linha para ser verificada (de 0 a 4): "))

    for(var j = 0; j < 5; j++){
        console.log(matriz[linhaEscolhida][j])
    }

    opcao = parseInt(prompt("Deseja solicitar uma linha para ser verificada? 0 (sim), -1(não)"))
}