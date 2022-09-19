const prompt = require("prompt-sync")({ sigint: true });

var codigo = parseInt(prompt("Digite o código do produto (1 a 40): "));

var qtdProduto = parseInt(prompt("Digite a quantidade que comprou desse produto: "))

var preco = 0;
if(codigo >= 1 && codigo <=10){
preco = 10;
System.out.println("Preço unitário: " + preco);
}else if(codigo > 10 && codigo <= 20){
    preco = 15;
    System.out.println("Preço unitário: " + preco);
}else if(codigo > 20 && codigo <= 30){
    preco = 20;
    System.out.println("Preço unitário: " + preco);
}else{
    preco = 30;
     System.out.println("Preço unitário: " + preco);
}               

var precoTotal = preco * qtdProduto;
System.out.println("Preço total da nota: " + precoTotal);

var precoDesconto = 0;
if(precoTotal <= 250){
    precoDesconto = precoTotal * 5/100;
}else if(precoTotal > 250 && precoTotal <= 500){
    precoDesconto = precoTotal * 10/100;
}else{
    precoDesconto = precoTotal * 15/100;
}

var totalFinal = precoTotal - precoDesconto;

System.out.println("Valor do desconto em si: " + precoDesconto);
System.out.println("Valor total da nota com desconto: " + totalFinal);