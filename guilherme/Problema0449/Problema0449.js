const prompt = require("prompt-sync")({ sigint: true })

function mostraVetor(v){
    console.log("Números no vetor: ");
    for(let i = 0; i < 12; i++){
        console.log(v[i]);
    }
}

function copiaMatriz(m, v){
    var k = 0;
    for(let i = 0; i < 3; i++){
        for(let j = 0; j < 4; j++){
            v[k] = m[i][j];
            k++;
        }
    }
}

var matriz = [,];
var vetor = [];
for(let i = 0; i < 3; i++){
    matriz[i] = []
    for(let j = 0; j < 4; j++){
        console.log("Digite o nº da linha "+i+" e coluna "+j+": ");
        matriz[i][j] = Number(prompt());
        
    }
}

copiaMatriz(matriz, vetor);
mostraVetor(vetor);