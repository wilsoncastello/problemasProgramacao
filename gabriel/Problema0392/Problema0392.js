var M = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]];
var soma = 0;

for(var i=0; i<4; i++){
    for(var j=0; j<4; j++){
        M[i][j] = parseFloat(prompt("Digite o valor armazenado na linha " +i+ " e na coluna " +j));
    }
}

for(var i=0; i<4; i++){
    for(var j=0; j<4; j++){
        if(i % 2 == 0 || j % 2 != 0){
            soma = soma + M[i][j];
        }
    }
}

console.log("Soma dos elementos das linhas pares e colunas ímpares: " +soma);