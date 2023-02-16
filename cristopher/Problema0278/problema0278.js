const prompt = require("prompt-sync")({ sigvar: true });

var maiorNumero = 0, posicaoMaior = 0, menorNumero = 999999, posicaoMenor = 0;

    var vetor = []

    for(var i = 0; i < 10; i++){
        vetor[i] = parseInt(prompt("Digite o numero na posição ["+i+"]: "))
    }

    for (var i = 0; i < 10; i++) {
        if(vetor[i] > maiorNumero){
            maiorNumero = vetor[i];
            posicaoMaior = i;
        }

        if(vetor[i] < menorNumero){
            menorNumero = vetor[i];
            posicaoMenor = i;
        }
    }
        
    console.log("O maior numero é " + maiorNumero + " e sua posição é " + posicaoMaior + ".");
    console.log("O menor numero é " + menorNumero + " e sua posição é " + posicaoMenor + ".");