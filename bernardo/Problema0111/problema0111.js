const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var numero1 = parseFloat(prompt("Digite o primeiro número: "));
var numero2 = parseFloat(prompt("Digite o segundo número: "));



//Cálculo da soma e verificação
var soma = numero1 + numero2;
if (soma > 20) {
    var resultado = soma + 8;
}
else {
    var resultado = soma - 5;
}

//Saída
console.log("O número a ser apresentado é: " + resultado)