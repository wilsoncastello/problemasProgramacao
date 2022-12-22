var matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]];
var pontoSela = false;

for(var i=0; i<4; i++){
    for(var j=0; j<4; j++){
        matriz [i][j] = parseInt(prompt("Digite o valor da linha "+i+" e da coluna "+j));
    }
}

        for (var i = 0; i < 4; i++){
         
            var menorDaLinha = matriz[i][0], indiceColuna = 0, indiceLinha = 0;
            for (var j = 1; j < 4; j++)
            {
                if (menorDaLinha > matriz[i][j])
                {
                    menorDaLinha = matriz[i][j];
                    indiceColuna = j;
                    indiceLinha = i;
                }
            }
       
            
            var k;
            for (k = 0; k < 4; k++){
       
                if (menorDaLinha < matriz[k][indiceColuna]){
                    break;
                }
            }
            
            if (k == 4)
            {
                pontoSela = true;
                console.log("Existe um ponto de sela na posição da linha " +indiceLinha+" e da coluna "+indiceColuna);
                console.log("O valor é "+ menorDaLinha);

            }
        }

        if(pontoSela == false){
            console.log("Não existe ponto de sela na matriz");
        }
        

 
