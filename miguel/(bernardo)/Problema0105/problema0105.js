const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
console.log("Menu de opções: \n1. Somar dois números. \n2. Raiz quadrada de um número.");
var opcao = parseInteger(prompt("Digite a opção desejada: "));

//Cálculo das operações
if (opcao == 1) {
    var numero1 = parseFloat(prompt("Digite o primerio número: "));
    var numero2 = parseFloat(prompt("Digite o segundo número: "));
    var resultado = numero1 + numero2;
}
else if (opcao == 2){
    var numero1 = parseFloat(prompt("Digite um número: "));
    var resultado = Math.sqrt(numero1);
}
else {
    console.log("Operação não reconhecida");
    var resultado = 0;
}
//Saída 
console.log("O resultado da operação é: " + resultado);