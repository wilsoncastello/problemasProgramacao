const prompt = require("prompt-sync")({sigint: true})

/*Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir. 
*Até R$ 29.99 - Sem desconto
*De R$ 30.00 a R$ 49.99 - 10%
*De R$ 50.00 a R$ 79.99 - 15%
*De R$ 80.00 a R$ 100.00 - 20%
*Acima de R$ 100.00 - 25%
Faça um programa que receba o preço atual de um produto e seu código, 
calcule e mostre o valor do desconto e o novo preço.*/

var precoP, codigoP
var precoDesc

console.log("Digite as informações do produto")
precoP = Number(prompt("Digite o preço do produto: "))
codigoP = Number(prompt("Digite o codigo do produto: "))

if(precoP <= 29.99){
    console.log("Informações do produto")
    console.log("Código do produto: "+codigoP)
    console.log("Valor do desconto: 0%")
    console.log("Novo preço do produto: "+precoP)
}
else{
    if(precoP >= 30 && precoP <= 49.99){
        precoDesc = precoP - (10*precoP)/100

        console.log("Informações do produto")
        console.log("Código do produto: "+codigoP)
        console.log("Valor do desconto: 10%")
        console.log("Novo preço do produto: "+precoDesc)
    }
    else{
        if(precoP >= 50 && precoP <= 79.99){
            precoDesc = precoP - (15*precoP)/100

            console.log("Informações do produto")
            console.log("Código do produto: "+codigoP)
            console.log("Valor do desconto: 15%")
            console.log("Novo preço do produto: "+precoDesc)
        }
        else{
            if(precoP >= 80 && precoP <= 100){
                precoDesc = precoP - (20*precoP)/100

                console.log("Informações do produto")
                console.log("Código do produto: "+codigoP)
                console.log("Valor do desconto: 20%")
                console.log("Novo preço do produto: "+precoDesc)
            }
            else{
                precoDesc = precoP - (25*precoP)/100

                console.log("Informações do produto")
                console.log("Código do produto: "+codigoP)
                console.log("Valor do desconto: 25%")
                console.log("Novo preço do produto: "+precoDesc)
                
            }
        }
    }
}