const prompt = require("prompt-sync")({ sigint: true });

/*Considerando as faixas especificadas a seguir, escreva um algoritmo que, para um determinado valor inteiro, imprima qual a faixa que o mesmo pertence. Faixa A - Valores abaixo de 100; Faixa B - Valores de 100 a 150 (inclusive extremos); Faixa C - Valores de 151 a 300 (inclusive extremos); Faixa X - Quaisquer outros valores. */

valor = Number(prompt("Digite o valor inteiro: "))

if (valor < 100) {
    console.log("O valor pertence a faixa A")
} else if (valor > 99 && valor < 151) {
    console.log("O valor pertence a faixa B")
} else if (valor > 150 && valor < 301) {
    console.log("O valor pertence a faixa C")
} else {
    console.log("O valor pertence a faixa X")
}