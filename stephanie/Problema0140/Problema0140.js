const prompt = require("prompt-sync")({ sigint: true });

var n = prompt("Digite um número inteiro que esteja na faixa de valores de 1 até 9: ");

if (n>=1 && n<=9) {
    console.log("O valor está na faixa permitida")
} else {
    console.log("O valor está fora da faixa permitida")
}