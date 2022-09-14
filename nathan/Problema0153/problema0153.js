const prompt = require("prompt-sync")({ sigint: true });

var preco = Number(prompt("Digite o preço do produto: "));

if(preco < 50){
    preco = preco + preco*0.05;
    console.log("Novo preço: R$" + preco);
}else if(preco >= 50 && preco <= 100){
    preco = preco + preco*0.1;
    console.log("Novo preço: R$" + preco);            
}else{
    preco = preco + preco*0.15;
    console.log("Novo preço: R$" + preco);            
}

if(preco < 80)
    System.out.println("Classificação: Barato");
else if(preco >= 80 && preco <= 120)
    System.out.println("Classificação: Normal");  
else if(preco > 120 && preco <= 200)
    System.out.println("Classificação: Caro");
else
    System.out.println("Classificação: Muito Caro");   