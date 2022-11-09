const prompt = require("prompt-sync")({ sigint: true });

function max( x){
    var pos = 0;
    var valorMax = 0;
        for(var i= 0; i < x.length; i++ ){
            if(x[i]>= valorMax){
                valorMax = x[i];
                pos= i;
            }
        }
        console.log("Posicao valor maximo: "+pos);

}


const n = prompt("Escreva numero n: ");
const x= [];
for(var i = 0; i < n ; i++){
    const num = prompt("Escreve numero da colocar no vetor: ");
    x[i] = num;

}

max(x)