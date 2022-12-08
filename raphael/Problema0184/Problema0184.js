const prompt = require("prompt-sync")({ sigint: true });

/* Criar um algoritmo que imprima todos os números de 1 até 100 e a soma deles. */

somador =0;

for (var i=1;i<101;i++) {
    console.log(i);
    somador = somador + i;
}

console.log("\n A soma de todos os numeros é: "+somador)