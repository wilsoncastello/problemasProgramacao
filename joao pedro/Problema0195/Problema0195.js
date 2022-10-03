const prompt = require("prompt-sync")({ sigint: true });

var x,numero,maiorNumero,menorNumero;
menorNumero=Infinity;
maiorNumero=-Infinity;

x=Number(prompt("Digite a quantidade de numero que quer digitar: "));

for(i=0;i<x;i++){
    numero=Number(prompt("Digite o valor para o "+i+" numero: "));

    if(numero>maiorNumero){
        maiorNumero=numero;
    }
    if(numero<menorNumero){
        menorNumero=numero;
    }



}

console.log("Maior numero: "+maiorNumero);
console.log("Menor numero: "+menorNumero);