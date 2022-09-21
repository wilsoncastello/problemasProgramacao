const prompt = require("prompt-sync")({ sigint: true });

var n = prompt("Digite um número inteiro positivo: ")

switch (n){
    case 0: console.log("Zero");
    break;
    case 1: console.log("Um");
    break;
    case 2: console.log("Dois");
    break;
    case 3: console.log("Três");
    break;
    case 4: console.log("Quatro");
    break;
    case 5: console.log("Cinco");
    break;
    case 6: console.log("Seis");
    break;
    case 7: console.log("Sete");
    break;
    case 8: console.log("Oito");
    break;
    case 9: console.log("Nove");
    break;
    default: console.log("Entrada Inválida!");
    break;
}