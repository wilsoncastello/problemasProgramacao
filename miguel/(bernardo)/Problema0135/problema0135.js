const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var idade = parseInt(prompt("Digite a idade: "));
var peso = parseFloat(prompt("Digite o peso: "));

//Cálculo da dosagem
if (idade >= 12) {
    if (peso >= 60) {
        var mg = 1000;
    }
    else {
        var mg = 875;
    }
}
else {
    if (peso <= 9) {
        var mg = 125;
    }
    else if (peso <= 16) {
        var mg = 250;
    }
    else if (peso <= 24) {
        var mg = 375;
    }
    else if (peso <= 30) {
        var mg = 500;
    }
    else {
        var mg = 750;
    }
}

var gotas = mg / 500 * 20;

//Saída
console.log("O paciente deve tomar: " + gotas + " gotas");