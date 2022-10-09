const prompt = require("prompt-sync")({ sigint: true });

var numero, vetor=[10];

for(i=0;i<10;i++){
    vetor[i]=Number(prompt("Digite um numero inteiro de posicao "+i+": " ));
    
    for (j = 0; j < i; j++) {
            if (vetor[i] > vetor[j]) {
                numero = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = numero;
            }
        }

} 
   for(j=0;j<10;j++){
   console.log("Vetor em ordem decrescente: "+vetor[j]);
   }



