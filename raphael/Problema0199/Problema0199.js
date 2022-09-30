const prompt = require("prompt-sync")({ sigint: true });

/* Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores do que 225. */

somador = 0;

for (var i=0;i<20;i++) {
    numero = Number(prompt("Digite o "+(i+1)+"º numero: "));

    if ((numero * numero) < 225) {
        somador = somador + numero;
    }
}

console.log("A soma dos numeros cujo quadrado é menor do que 225 é: "+somador)