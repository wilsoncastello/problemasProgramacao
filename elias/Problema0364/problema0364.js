const prompt = require("prompt-sync")({ sigint: true })

var matriz = [
    [],
    [],
    [],
    [],
    []
]
var vetorSomaLinhas = [
    []
];
var matrizResultante = [
    [],
    [],
    [],
    [],
    []
]
for(i = 0; i < 5; i++){
    for(j = 0; j < 4; j++){
        matriz[i][j] = prompt("Digite um número para a linha "+i+" e coluna "+j+" da matriz:");
    }
}
for(i = 0; i < 5; i++){
    var somaLinhas = 0;
    for(j = 0; j < 4; j++){
        somaLinhas = somaLinhas + matriz[i][j];
    }
    vetorSomaLinhas[i] = somaLinhas;
}
for(i = 0; i < 5; i++){
    for(j = 0; j < 4; j++){
        matrizResultante[i][j] = matriz[i][j] * vetorSomaLinhas[i];
    }
}
console.log("A matriz resultante é: ");
for(i = 0; i < 5; i++){
    for(j = 0; j < 4; j++){
        process.stdout.write(matrizResultante[i][j]+" ");
    }
    console.log(" ");
}