const prompt = require("prompt-sync")({ sigint: true });


var dolar,real,cota;

cota=Number(prompt("Conversor de dolar para real. Digite a cotacao do dolar: "));
dolar=Number(prompt("Digite a quantidade de dolares: "))
real=dolar*cota;
console.log("Valor em reais: "+real);