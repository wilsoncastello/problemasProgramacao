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
        matriz[i][j] = prompt("Digite um número para a linha "+i+" e coluna "+j+" da matriz:");
    }
}
var coluna = parseInt(prompt("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5)."));
while(coluna != -1){
    console.log(" ");
    console.log("Coluna selecionada: ");
    if(coluna == 1){
        for (i = 0; i < 5; i++) {
        console.log(matriz[i][0]);
        }
    }
    else if(coluna == 2){
        for (i = 0; i < 5; i++) {
        console.log(matriz[i][1]);
        }
    }
    else if(coluna == 3){
        for (i = 0; i < 5; i++) {
        console.log(matriz[i][2]);
        }
    }
    else if(coluna == 4){
        for (i = 0; i < 5; i++) {
        console.log(matriz[i][3]);
        }        
    }
    else if(coluna == 5){
        for (i = 0; i < 5; i++) {
        console.log(matriz[i][4]);
        }
    }
    else
        console.log("Número inválido, tente novamente !");
    console.log("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5). ");
    console.log("Digite -1 caso queira sair. ");
    coluna = parseInt(prompt("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5)."));
}