const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var ano = parseInt(prompt("Digite o ano atual: "));
var nascimento = parseInt(prompt("Digite o ano de nascimento: "));

//Cálculo da idade e da idade em 2050
var idade = ano - nascimento;
var idadeFutura = 2050 - nascimento;

//Saída 
console.log("A idade da pessoa é: " + idade);
console.log("A idade da pessoa em 2050 será: " + idadeFutura);