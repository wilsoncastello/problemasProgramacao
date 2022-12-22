const prompt = require("prompt-sync")({ sigint: true });

//Declaração de variáveis
var num = 6;
var idade = [];
var peso = [];
var altura = [];
var olhos = [];
var cabelo = [];
var condicao1 = 0;
var condicao2 = 0;
var condicao2_numero = 0;
var condicao3 = 0;
var condicao4 = 0;

//Entrada de valores
for (var i = 0; i < num; i++) {
    idade[i] = parseFloat(prompt("Digite a idade da " + (i + 1) + " pessoa : "));
    peso[i] = parseFloat(prompt("Digite o peso da " + (i + 1) + " pessoa (em quilos): "));
    altura[i] = parseFloat(prompt("Digite a altura da " + (i + 1) + " pessoa (em metros): "));
    olhos[i] = prompt("Digite a cor dos olhos da " + (i + 1) + " pessoa (A-azul; P-preto; V-verde; C-castanho): ");
    cabelo[i] = prompt("Digite a cor do cabelo da " + (i + 1) + " pessoa (P-preto; C-castanho; L-louro; e R-ruivo): ");
}

//Cálculo das condições
for (var i = 0; i < num; i++) {
    if (idade[i] > 50 && peso[i] < 60) {
        condicao1 += 1;
    }
    if (altura[i] < 1.5) {
        condicao2 += idade[i]
        condicao2_numero += 1
    }
    if (olhos[i].toUpperCase() == 'A' || olhos[i].toUpperCase() == "AZUL") {
        condicao3 += 1
    }
    else if (cabelo[i].toUpperCase() == 'R' || cabelo[i].toUpperCase() == "RUIVO") {
        condicao4 += 1;
    }
}
if (condicao2_numero > 0) {
    condicao2 /= condicao2_numero;
}
condicao3 /= 0.06;


//Saída
console.log("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg é: " + condicao1);
console.log("A média das idades das pessoas com altura inferior a 1,50m é: " + condicao2);
console.log("A porcentagem de pessoas com olhos azuis é: " + condicao3 + "%");
console.log("A quantidade de pessoas ruivas e que não possuem olhos azuis é: " + condicao4);