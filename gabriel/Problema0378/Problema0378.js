var matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]];
var soma = 0, contador = 0, media;

for(var i=0; i<4; i++){
    for(var j=0; j<3; j++){
        matriz [i][j] = parseFloat(prompt("Digite o numero armazenado na linha " +i+ " e da couna "+j));
    }
}

for(var i=0; i<4; i++){
    for(var j=0; j<3; j++){
        if(i % 2 == 0){
            soma = soma + matriz [i][j];
            contador = contador + 1;
        }
    }
}

media = soma / contador;

console.log("A média dos elementos nas linhas pares: "+media);
    