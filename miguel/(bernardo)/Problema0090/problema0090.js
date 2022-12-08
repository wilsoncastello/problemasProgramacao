const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var compra = parseFloat(prompt("Digite o valor da compra: "));

//Cálculo do desconto e valor final da compra
if (compra >= 5000) {
    var desconto = compra * 0.20;
    var valor = compra - desconto;
}
else {
    var desconto = compra * 0.15;
    var valor = compra - desconto;
}

//Saída 
console.log("Desconto R$: " + Math.round(desconto * 100) / 100);
console.log("Valor final da compra R$: " + Math.round(valor * 100) / 100);