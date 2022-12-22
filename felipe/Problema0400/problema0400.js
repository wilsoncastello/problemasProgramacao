const prompt = require("prompt-sync")({ sigint: true })

var v1, v2, v3, cont = 0;
var c = [];
var padrao = 1;
var value;

console.log("[Linha] [Coluna]. ")
for(var i = 0; i < 4; i++){
        c.push([]);
        for(var j = 0; j < 4; j++, padrao++){
                value = parseInt(prompt('Digite ['+(i+1)+']['+(j+1)+']: ', padrao));
                c[i].push(value);
        }
}

v1 = parseInt(prompt("Digite o valor 1: "));
v2 = parseInt(prompt("Digite o valor 2: "));
v3 = parseInt(prompt("Digite o valor 3: "));

for(let i = 0; i<4; i++){
    for(let j = 0; j<4; j++){
        if (c[i][j] == v1){
            cont++;
        } else {
            if (c[i][j] == v2){
                cont++;
            } else {
                if (c[i][j] == v3){
                    cont++;
                }
            }
        }
    }
}

console.log("Quantidade de valores digitados contidos na matriz: "+cont);