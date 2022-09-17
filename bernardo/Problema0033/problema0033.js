const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var altura = parseFloat(prompt("Digite a altura em metros: "));
var largura = parseFloat(prompt("Digite a largura (em metros): "));


//Cálculo da área e potência de iluminação
var area = altura * largura;
var potencia = area * 18;

//Saída 
console.log("Área: " + area + "m²");
console.log("Potência: " + potencia + " W");