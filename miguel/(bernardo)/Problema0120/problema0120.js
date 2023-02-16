const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var salario = parseFloat(prompt("Digite o valor do salário: "));

//Cálculo do desconto
if (salario <= 600) {
    var desconto = 0;
}
else if (salario <= 1200) {
    var desconto = salario * 0.20;
}
else if (salario <= 2000) {
    var desconto = salario * 0.25;
}
else {
    var desconto = salario * 0.30;
}
//Saída
console.log("Desconto: R$ " + Math.round(desconto * 100) / 100);