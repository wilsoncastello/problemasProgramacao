const prompt = require("prompt-sync")({ sigint: true });

var matriz=[[0,0,0],[0,0,0],[0,0,0]], x, y , rotacionado=[[0,0,0],[0,0,0],[0,0,0]] , rotacionadoString=""

console.log("Digite valores inteiros: ")

for(i=0;i<3;i++){
    for(j=0;j<3;j++){
        matriz[i][j]=Number(prompt(""))
    }
}

x=matriz.length
y=matriz[0].length

for (i=0; i<y; i++) {
    for (j=0; j<x; j++) {
        rotacionado[i][j] = matriz[x - j - 1][i];
}}
for(i=2;i>=0;i--){
    rotacionadoString=("\n")+rotacionadoString
    for(j=2;j>=0;j--){
        rotacionadoString =rotacionado[i][j]+rotacionadoString+" "
    }
}
console.log(rotacionadoString)