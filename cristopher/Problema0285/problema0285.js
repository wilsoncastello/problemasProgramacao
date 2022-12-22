const prompt = require("prompt-sync")({ sigvar: true });

var vetorLucros = []
var precoCompra = 0, precoVenda = 0;
var contLucroMenor10 = 0, contLucroEntre10e20 = 0, contLucroMaior20 = 0;

for (var i = 0; i < 10; i++) {
    precoCompra = parseFloat(prompt("Digite o preço de compra do produto ["+i+"]: "))
    precoVenda = parseFloat(prompt("Digite o preço de venda do produto ["+i+"]: "))
    vetorLucros[i] = precoVenda - precoCompra;

    if(vetorLucros[i] < (precoCompra * 10/100)){
        contLucroMenor10++;
    }else if(vetorLucros[i] >= (precoCompra * 10/100) && vetorLucros[i] <= (precoCompra * 20/100)){
         contLucroEntre10e20++;
    }else{
        contLucroMaior20++;
    }
}

console.log(contLucroMenor10);
console.log(contLucroEntre10e20);
console.log(contLucroMaior20);