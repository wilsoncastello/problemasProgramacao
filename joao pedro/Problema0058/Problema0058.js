const prompt = require("prompt-sync")({ sigint: true });

var troco,compra,valor,x,y,z;

valor=Number(prompt("Digite o valor da compra: "));
compra=Number(prompt("Digite o quanto sera pago na compra: "))

troco=compra-valor;

console.log("Troco: "+troco);
console.log("Valor da compra: "+valor);

x=troco/100;

console.log("Notas de 100: "+parseInt(x));

y=troco/10;

console.log("Notas de 10: "+parseInt(y));

z=troco%10;
console.log("Notas de 1: "+parseInt(z));


