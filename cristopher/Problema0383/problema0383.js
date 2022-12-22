const prompt = require("prompt-sync")({ sigvar: true });

var matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

//Preenchendo a matriz
for(var i = 0; i < 3; i++){
    for(var j = 0; j < 4; j++){
        matriz[i][j] = prompt("Digite o numero na posicao ["+i+", "+j+"]: ")
    }
}

//Transpondo a matriz
var matrizTransposta = [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]
for(var i = 0; i < 4; i++){
    for(var j = 0; j < 3; j++){
        matrizTransposta[i][j] = matriz[j][i]
    }
}

//Imprimindo a matriz
for(var i = 0; i < 4; i++){
    for(var j = 0; j < 3; j++){
        console.log("  |  " + matrizTransposta[i][j] + "   |  ")
    }
    console.log("")
}