const prompt = require("prompt-sync")({ sigint: true });
let quadrado =0;
let cubo=0;
let raizQuadrada=0;
let raizCubica=0;

let x = prompt("Digite um numero positivo e maior que zero: ")
quadrado=x*x;
cubo=x*x*x;
raizQuadrada=Math.sqrt(x);
raizCubica=Math.cbrt(x);



console.log(x+ " ao quadrado: "+quadrado)
console.log(x+" ao cubo: "+cubo)
console.log("A raiz quadrada de "+x+": "+raizQuadrada)
console.log("A raiz cubica de "+x+": "+raizCubica)

