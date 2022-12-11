const prompt = require("prompt-sync")({ sigint: true })

var maior = 0, indice = 0

var c = [];
var padrao = 1;
var value;

console.log("[Linha] [Coluna]. ")
for(var i = 0; i < 4; i++){
        c.push([]);
        for(var j = 0; j < 3; j++, padrao++){
                value = parseInt(prompt('Digite ['+(i+1)+']['+(j+1)+']: ', padrao));
                c[i].push(value);
        }
}

var menor = c[0][0];

for(let i = 0; i<4; i++){
    for(let j=0; j<3; j++){
        if(c[i][j] < menor){
            menor = c[i][j];
            indice = i;
        }
    }
}

for(let i = indice; i<indice+1; i++){
    for(let j=0; j<3; j++){
        if(c[i][j] > maior){
            maior = c[i][j];
        }
    }
}

console.log("O maior elemento da linha onde se encontra o menor elemento: ",maior)