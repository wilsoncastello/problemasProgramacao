const prompt = require("prompt-sync")({ sigvar: true });

var matriz = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

for(var i = 0; i < 4; i++){
    for(var j = 0; j < 5; j++){
        matriz[i][j] = parseInt(prompt("Digite o numero na posicao ["+i+", "+j+"]: "))
    }
}

console.log(matriz)