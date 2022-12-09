const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores e ordenação
var vetor = [];
for (var  i = 0; i < 8; i++){
    var numero = parseInt(prompt("Digite o "+ (i+1) +" número: "));
    for (var  j = 0; j < i; j++){
        if (numero < vetor[j]){
           var intermediario = vetor[j];
           vetor[j] = numero;
           numero = intermediario;
        }
    }
    vetor[i] = numero;
}

// Saída
console.log("O vetor ordenado é: " + vetor);