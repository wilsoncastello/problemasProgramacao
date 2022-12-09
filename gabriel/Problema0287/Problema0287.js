let vetorA = Array(10)
let vetorB = Array(10)
let vetorOperacoes = Array(10)
let vetorResultado = Array(10)

  console.log("Digite os valores do vetor A");
    for(let i=0; i<10; i++){
      vetorA[i] = parseFloat(prompt("posiçao "+i));
    }

    console.log("Digite os valores do vetor B");
    for(let i=0; i<10; i++){
      vetorB[i] = parseFloat(prompt("posiçao "+i));
    }

     console.log("Digite as operaçoes(+, -, *, /)");
    for(let i=0; i<10; i++){
      vetorOperacoes[i] = prompt("posiçao "+i);
    }

    for(let i=0; i<10; i++){
      switch(vetorOperacoes[i]){
        case '+': 
          vetorResultado[i] = vetorA[i] + vetorB[i];
          break;
        
        case '-': 
          vetorResultado[i] = vetorA[i] - vetorB[i];
          break;

        case '*': 
          vetorResultado[i] = vetorA[i] * vetorB[i];
          break;

        case '/': 
          vetorResultado[i] = vetorA[i] / vetorB[i];
          break;
      }
    }

    console.log("Vetor resultado" + ": ");
    for(let i=0; i<10; i++){
        
        if(vetorOperacoes[i] == '+' || vetorOperacoes[i] == '-' || vetorOperacoes[i] == '*' || vetorOperacoes[i] == '/'){
            console.log(vetorResultado[i]);
        }
       
       else{
           console.log("valor inexistente");
       }
    }