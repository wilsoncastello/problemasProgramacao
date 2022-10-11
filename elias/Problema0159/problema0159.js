const prompt = require("prompt-sync")({ sigint: true });

var precoProduto = parseFloat(prompt("Digite o preço do produto:"));
var categoriaProduto = parseInt(prompt("Digite a categoria do produto (1 — limpeza; 2 — alimentação; ou 3 — vestuário):"));
var refrigeracao = prompt("Digite 'R' se o produto necessita de refrigeração, ou 'N' se não necessita:");
if(precoProduto <= 25 && categoriaProduto == 1){
    valorAumento = precoProduto * 0.05;
    valorTotal = precoProduto + valorAumento;
    if(refrigeracao == 'R' || refrigeracao == 'r'){
        valorImposto = valorTotal * 0.05;
    }
    else
        valorImposto = valorTotal * 0.08;
}
else if(precoProduto <= 25 && categoriaProduto == 2){
    valorAumento = precoProduto * 0.08;
    valorTotal = precoProduto + valorAumento;
    valorImposto = valorTotal * 0.05;
}
else if(precoProduto <= 25 && categoriaProduto == 3){
    valorAumento = precoProduto * 0.1;
    valorTotal = precoProduto + valorAumento;
    if(refrigeracao == 'R' || refrigeracao == 'r'){
        valorImposto = valorTotal * 0.05;
    }
    else
        valorImposto = valorTotal * 0.08;
    } 
else if(precoProduto > 25 && categoriaProduto == 1){
    valorAumento = precoProduto * 0.12;
    valorTotal = precoProduto + valorAumento;
    if(refrigeracao == 'R' || refrigeracao == 'r'){
        valorImposto = valorTotal * 0.05;
    }
    else
        valorImposto = valorTotal * 0.08;
}   
else if(precoProduto > 25 && categoriaProduto == 2){
    valorAumento = precoProduto * 0.15;
    valorTotal = precoProduto + valorAumento;
    valorImposto = valorTotal * 0.05;
}
else if(precoProduto > 25 && categoriaProduto == 3){
    valorAumento = precoProduto * 0.18;
    valorTotal = precoProduto + valorAumento;
    if(refrigeracao == 'R' || refrigeracao == 'r'){
        valorImposto = valorTotal * 0.05;
    }
    else
        valorImposto = valorTotal * 0.08;
}
novoPreco = valorTotal - valorImposto;
if (novoPreco <= 50){
    console.log("O novo preço do produto é "+novoPreco+" e o produto està classificado como barato");
}
else if (novoPreco > 50 && novoPreco < 120){
    console.log("O novo preço do produto é "+novoPreco+" e o produto està classificado como normal");
}
else if (novoPreco >= 120){
    console.log("O novo preço do produto é "+novoPreco+" e o produto està classificado como caro");
}