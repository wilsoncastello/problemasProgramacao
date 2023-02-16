const prompt = require("prompt-sync")({ sigint: true })

function calculaResultado(A, B, C){
    var soma = A + B + C;
    var resultado = soma * soma;
    return resultado;
}
var A = parseInt(prompt("Digite um número inteiro para A:"));
var B = parseInt(prompt("Digite um número inteiro para B:"));
var C = parseInt(prompt("Digite um número inteiro para C:"));
var resultado = calculaResultado(A, B, C);
console.log("O quadrado da soma dos três valores é: "+resultado);
