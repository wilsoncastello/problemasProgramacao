const prompt = require("prompt-sync")({ sigint: true });

var vetor15=[15],vetorP=[5],vetorI=[5],x=0,y=0;

console.log("--Digite 15 numeros--");

for(i=0;i<15;i++){
    vetor15[i]=Number(prompt("Numero de posicao "+i+": "));
    

    if(vetor15[i]%2==0 && x<5){
        vetorP[x]=vetor15[i];
        x++;
    } else{
    if(vetor15[i]%2==1 && y<5)
        vetorI[y]=vetor15[i];
        y++; }
    if(x>=5){
        console.log("Vetor P cheio!");
        for(a=0;a<5;a++){
            console.log(vetorP[a]);
        }
        console.log("--Recomecando vetor P--");
        x=0;
    }    
    if(y>=5){
        console.log("Vetor I cheio!");
        for(b=0;b<5;b++){
            console.log(vetorI[b]);
        }
       console.log("--Recomecando vetor I--");
        y=0;
    }
}
console.log("Vetor P final: ");
for(i=0;i<5;i++){
    console.log(vetorP[i]);

}
console.log("Vetor I final: ");
for(i=0;i<5;i++){
   console.log(vetorI[i]);
}
