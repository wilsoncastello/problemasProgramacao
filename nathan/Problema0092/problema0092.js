const prompt = require("prompt-sync")({ sigint: true });

var produto1 = prompt("Digite o nome do produto 1: ");
var estoque1 = Number(prompt("Digite a quantidade em estoque: "));
var produto2 = prompt("Digite o nome do produto 2: ");
var estoque2 = Number(prompt("Digite a quantidade em estoque: "));
var produto3 = prompt("Digite o nome do produto 3: ");
var estoque3 = Number(prompt("Digite a quantidade em estoque: "));
var produto4 = prompt("Digite o nome do produto 4: ");
var estoque4 = Number(prompt("Digite a quantidade em estoque: "));

console.log("Produtos que estão abaixo do estoque: ");
if(estoque1 < 30)
    console.log(produto1);
if(estoque2 < 30)
    console.log(produto2);
if(estoque3 < 30)
    console.log(produto3);
if(estoque4 < 30)
    console.log(produto4);