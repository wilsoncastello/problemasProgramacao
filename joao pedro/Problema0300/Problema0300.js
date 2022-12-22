const prompt = require("prompt-sync")({ sigint: true });

var vetorX=[],n=0,check=0,y;

n=Number(prompt("Digite o tamanho do vetor X: "));

for(i=0;i<n;i++){
    vetorX[i]=Number(prompt("Digite um numero na posicao "+i+" do vetor X: "));
    

}
y=Number(prompt("Digite um valor Y: "));


for(i=0;i<n;i++){
    if(y==vetorX[i]){
        console.log("O valor Y existe no vetor X");
        check=1;

    }
    
}
if(check==0){
    console.log("O valor Y nao esta no vetor X. Incluindo valor Y");
    vetorX[0]=y;
}
for(i=0;i<n;i++){
    console.log("Vetor X na posicao "+i+": "+vetorX[i]);
}