function somarMatriz(matrizA){
    soma = 0;
    
    for(var i = 0; i<3; i++){
      for(var j=0; j<3; j++){
        soma = soma + matrizA[i][j];
      }
      
    }
    
    return soma;
  }


  matrizA = [[0, 0, 0], [0, 0, 0], [0, 0, 0]];
  soma =0;

  for(var i=0; i<3; i++){
    for(var j=0; j<3; j++){
      matrizA[i][j] = parseFloat(prompt("Digite o elemento correspondente a linha "+i+" e a coluna "+j));
    }
  }

  soma = somarMatriz(matrizA);

  console.log("Soma dos elementos da matriz A: "+soma);