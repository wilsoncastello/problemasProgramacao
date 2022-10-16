const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var numero = parseInt(prompt("Digit um número: "));

//Verificação se o número é par e saída
if (numero % 2 == 0) {
    console.log("É par");
}
else {
    console.log("Não é par");
}
