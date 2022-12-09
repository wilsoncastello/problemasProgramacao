const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var ano = parseInt(prompt("Digite o ano: "));

//Verificação do ano
bissexto = (ano % 4 == 0 && !(ano % 100 == 0) || ano % 400 == 0);

//Saída 
console.log("O ano é bissexto: " + bissexto);