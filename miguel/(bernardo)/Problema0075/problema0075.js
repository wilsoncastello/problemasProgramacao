const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var cotacao = parseFloat(prompt("Digite a cotação do dólar: "));
var dolares = parseFloat(prompt("Digite a quantidade de dólares: "));

//Cálculo do peso em gramas
var reais = dolares * cotacao;

//Saída 
console.log("O valor convertido em reais é: R$" + Math.round(reais * 100) / 100);