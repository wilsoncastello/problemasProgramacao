const prompt = require("prompt-sync")({ sigvar: true });

var matrizA = [[0, 0, 0], [0, 0, 0]]
var total = 0

for(var i = 0; i < 2; i++){
    for(var j = 0; j < 3; j++){
        matrizA[i][j] = prompt("Digite o número na posição ["+i+", "+j+"]: ")
        if(!(matrizA[i][j] >= 5 && matrizA[i][j] <= 15)){
            total++
        }
    }
}

console.log(total)