const prompt = require("prompt-sync")({ sigint: true })

var matriz = [
    [],
    [],
    []
]
var somaElementosDiagonalPrincipal = 0;
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        matriz[i][j] = parseInt(prompt("Digite um número para a linha "+i+" e coluna "+j+" :")); 
    }
}
for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        if(i == j){
            somaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal + matriz[i][j];
        }
    }
}
var mediaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal / 3;
console.log("A média dos elementos da diagonal principal é: "+mediaElementosDiagonalPrincipal);