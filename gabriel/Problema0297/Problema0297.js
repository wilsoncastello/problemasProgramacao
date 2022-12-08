
    var vetorNome = Array(10);
    var vetorCPF = Array(10);
    var vetorProfissao = Array(10);
    var vetorContador = Array(10);

    for(var i=0; i<10; i++){
      
      vetorNome[i] = prompt("Digite o nome da pessoa da posição " + i + ": ");
      vetorCPF[i] = prompt("Digite o cpf de " + vetorNome[i] + ": ");
      vetorProfissao[i] = prompt("Digite a profissão de " + vetorNome[i] + ": "); 
    }

    for(var i=0; i<10; i++){
      vetorContador[i] = 1;
      for(var j=i+1; j<10; j++){
        if(vetorProfissao[i] == (vetorProfissao[j])){
          vetorContador[i]++;
          vetorProfissao[j] = null;
        }
      }
    }

    for(var i=0; i<10; i++){
      if(vetorProfissao[i] != null){
        console.log("Profissão "+vetorProfissao[i] + ": " + vetorContador[i]);
      }
    }