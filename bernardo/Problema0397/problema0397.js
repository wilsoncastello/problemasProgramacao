const prompt = require("prompt-sync")({ sigint: true });

//Funçao para calcular determinante da matriz
function determinante(matriz, ordem) {
    var det = 0;
    if (ordem == 1) {
        return (matriz[0][0]);
    }
    if (ordem == 2) {
        return (matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1]);
    } else {
        var mat = [];
        for(var i =0; i< ordem-1; i++){
            mat.push([]);
        }
        var col = 0;
        for (var intermediario = 0; intermediario < ordem; intermediario++) {
            for (var l = 1; l < ordem; l++) {
                for (var coluna = 0; coluna < ordem; coluna++){
                    if (intermediario != coluna){
                        mat[l - 1][col++] = matriz[l][coluna];
                    }
                }
                col = 0;
            }
            if (matriz[0][intermediario] != 0) {
                det += Math.pow((-1), intermediario) * matriz[0][intermediario]
                    * determinante(mat, ordem - 1);
            }
        }
    }
    return (det);
}

// Entada de valores
var det;
var dependencia;
var matriz = [];
var ordem = parseInt(prompt("Digite a orderm da matriz: "));
for(var i =0; i< ordem; i++){
    matriz.push([]);
}
for (var i = 0; i < ordem; i++) {
    for (var j = 0; j < ordem; j++) {
        matriz[i][j] = parseFloat(prompt("Digite o número " + (i+1) + "x" + (j+1) + ": "));
    }
}

// Verificação de dependência linear e chamada de função
det = determinante(matriz, ordem);
if (det == 0) {
    dependencia = "linearmente dependente";
} else {
    dependencia = "linearmente independente";
}

// Saída
console.log("A matriz é: " + dependencia);