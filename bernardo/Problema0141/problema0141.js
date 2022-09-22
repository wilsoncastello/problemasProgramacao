const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var a = parseFloat(prompt("Digite o primeiro número: "));
var b = parseFloat(prompt("Digite o segundo número: "));
var c = parseFloat(prompt("Digite o terceiro número: "));



//Cálculo da soma e saída
var soma = a + b + c;
if (soma >= 100) {
    console.log("O resultado da soma é: " + soma);
}
else {
    console.log("O resultado não pode ser apresentado");
}