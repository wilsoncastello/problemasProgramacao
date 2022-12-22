const prompt = require("prompt-sync")({ sigint: true });

var vetorA=[],impar=0,porcentagem;

for(i=0;i<10;i++){
    vetorA[i]=Number(prompt("Digite um numero no vetor A de posicao "+i+": "));
    
    if(vetorA[i]%2==1){
        impar++;
    }

}
porcentagem=impar*0.1;
console.log("Quantidade de numeros impares: "+impar);
console.log("Porcentagem de numeros impares: "+porcentagem);