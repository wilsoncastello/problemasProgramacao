const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var idade = parseInt(prompt("Digite a idade: "));
var peso = parseFloat(prompt("Digite o peso "));


// Verificação do grupo
var grupo = 9;
if (idade >= 20) {
    grupo -= 3;
    if (idade > 50) {
        grupo -= 3;
    }
}
if (peso >= 60) {
    grupo -= 1;
    if (peso > 90) {
        grupo -= 1;
    }
}

// Saída
console.log("O grupo de risco da pessoa é: " + grupo);