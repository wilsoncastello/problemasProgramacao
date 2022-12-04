        var matriz = [[0, 0], [0, 0]];
        var determinante;
        
        for(var i=0; i<2; i++){
            for(var j=0; j<2; j++){
                
                matriz[i][j] = parseFloat(prompt("Digite o valor armazenado na linha " +i+ " e na coluna "+j))
            }
        }
        
        determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        
        console.log("Determinante da matriz: " +determinante);