const prompt = require("prompt-sync")({ sigint: true })

var matriz = [
    [],
    [],
    [],
    [],
    []
]
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
        if(i == j){
            matriz[i][j] =  '@';
        }
        else
            matriz[i][j] = prompt("Digite um número para a linha "+i+" e coluna "+j+" :"); 
    }
}
console.log("A matriz resultante é: ");
for (i = 0; i < 5; i++) {
    for (j = 0; j < 5; j++) {
        process.stdout.write(matriz[i][j]+" ");  
    }
    console.log("");
}