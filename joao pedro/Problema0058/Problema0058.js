const prompt = require("prompt-sync")({ sigint: true });

var troco,compra,valor,x,y,z;

valor=Number(prompt("Digite o valor da compra: "));
compra=Number(prompt("Digite o quanto sera pago na compra: "))

troco=compra-valor;

console.log("Troco: "+troco);
console.log("Valor da compra: "+valor);

x =troco/100;
console.log("Notas de 100: ", x);

troco = troco-(100*x);

y = (troco-x)%10;

console.log("Notas de 10:", y);

troco = troco-(10*y);
z = (troco-(y*10)) % 1;
console.log("Notas de 1: ", z);
