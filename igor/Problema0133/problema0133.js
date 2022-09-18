const prompt = require("prompt-sync")({ sigint: true });

var nome = prompt("Escreve nome do produto: ")
var valorCompra = prompt("Escreve valor de compra: ")

var ValorVenda;

if(valorCompra < 100){
    ValorVenda = (valorCompra * 70)/100;
}else if(100 <= valorCompra && valorCompra< 300){
    ValorVenda = (valorCompra * 50)/100;
}else if(300 <= valorCompra && valorCompra< 500){
    ValorVenda = (valorCompra * 40)/100;
}else{
    ValorVenda = (valorCompra * 30)/100;
}

console.log("Nome do produto: "+nome);
console.log("Valor da Venda: "+ValorVenda);