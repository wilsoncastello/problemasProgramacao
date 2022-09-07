 const prompt = require("prompt-sync") ({sigint: true});

 /*Faça um programa que leia os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa*/


 //Entrada de dados
 var catAd = Number(prompt("Digite o valor do cateto adjacente: "));
 var catOp = Number(prompt("Digite o valor do cateto oposto: "));

 //Processamento
 var hip = Math.sqrt(Math.pow(catAd, 2) + Math.pow(catOp, 2));

 //Saída de dados
 console.log("O valor da hipotenusa: "+hip)

