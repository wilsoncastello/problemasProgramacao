const prompt = require("prompt-sync")({ sigint: true });

var somaDosPositivos = 0;
var contNegativos = 0;

console.log("ENTRE COM 20 NÚMEROS");
for (var i = 0; i < 20; i++) {
console.log("["+i+"] Digite um número:  ");
var numeroInformado = parseFloat(prompt())
if(numeroInformado >= 0){
    somaDosPositivos = somaDosPositivos + numeroInformado;
}else{
    contNegativos++;
}
            
}

console.log("Soma dos positivos: " + somaDosPositivos);
console.log("Total de negativos: " + contNegativos);