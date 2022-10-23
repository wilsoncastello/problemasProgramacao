const prompt = require("prompt-sync")({ sigint: true });

// Entrada de valores e verificação do peso dos bois
var registrado = false;

var numero = parseInt(prompt("Digite o número de identificação do boi " +
    "(digite 0 ou menos para finalizar): "));
if (numero > 0) {
    registrado = true;
    var peso = parseFloat(prompt("Digite o peso do boi: "));
    var maiorPeso = peso;
    var boiGordo = numero;
    var menorPeso = peso;
    var boiMagro = numero;
}

while (numero > 0) {
    numero = parseInt(prompt("Digite o número de identificação do boi " +
        "(digite 0 ou menos para finalizar): "));
    if (numero > 0) {
        peso = parseFloat(prompt("Digite o peso do boi: "));
        if (peso >= maiorPeso) {
            maiorPeso = peso;
            boiGordo = numero;
        }
        if (peso <= menorPeso) {
            menorPeso = peso;
            boiMagro = numero;
        }
    }
}

// Saída
if (registrado) {
    console.log("O boi " + boiGordo + " é o mais gordo e seu peso é: " +
    maiorPeso);
    console.log("O boi " + boiMagro + " é o mais magro e seu peso é: " +
    menorPeso);
}
else {
    console.log("Não houve registro de bois");
}