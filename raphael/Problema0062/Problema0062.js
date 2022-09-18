const prompt = require("prompt-sync")({ sigint: true });

/* Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se o nome, preço e percentual de desconto. Faça um algoritmo que imprima nome, preço e preço com desconto de cada artigo. Imprima também o total a pagar. */

var nome1, nome2, nome3, nome4, pr1, pr2, pr3, pr4, dc1, dc2, dc3, dc4, prdc1, prdc2, prdc3, prdc4, totalPagar;

nome1 = prompt("Digite o nome do primeiro artigo: ");
pr1 = Number(prompt("Digite o preço do primeiro artigo: "));
dc1 = Number(prompt("Digite o desconto do primeiro artigo (em porcentagem): "));

nome2 = prompt("Digite o nome do segundo artigo: ");
pr2 = Number(prompt("Digite o preço do segundo artigo: "));
dc2 = Number(prompt("Digite o desconto do segundo artigo (em porcentagem): "));

nome3 = prompt("Digite o nome do terceiro artigo: ");
pr3 = Number(prompt("Digite o preço do terceiro artigo: "));
dc3 = Number(prompt("Digite o desconto do terceiro artigo (em porcentagem): "));

nome4 = prompt("Digite o nome do quarto artigo: ");
pr4 = Number(prompt("Digite o preço do quarto artigo: "));
dc4 = Number(prompt("Digite o desconto do quarto artigo (em porcentagem): "));

prdc1 = pr1 - ((dc1 / 100) * pr1);
prdc2 = pr2 - ((dc2 / 100) * pr2);
prdc3 = pr3 - ((dc3 / 100) * pr3);
prdc4 = pr4 - ((dc4 / 100) * pr4);

totalPagar = prdc1 + prdc2 + prdc3 + prdc4;

console.log("Nome do primeiro artigo: "+nome1);
console.log("Preço: "+pr1);
console.log("Preço com desconto: "+prdc1);

console.log("Nome do segundo artigo: "+nome2);
console.log("Preço: "+pr2);
console.log("Preço com desconto: "+prdc2);

console.log("Nome do terceiro artigo: "+nome3);
console.log("Preço: "+pr3);
console.log("Preço com desconto: "+prdc3);

console.log("Nome do quarto artigo: "+nome4);
console.log("Preço: "+pr4);
console.log("Preço com desconto: "+prdc4);

console.log("Total a pagar: "+totalPagar);