const prompt = require("prompt-sync")({sigint: true})

/*Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua 
opinião em relação ao filme:ótimo - 3 ; bom - 2 ; regular - 1. Faça um programa que receba 
a idade e a opinião de quinze espectadores, calcule mostre:
*A média das idades das pessoas que responderam ótimo; 
*A quantidade de pessoas que responderam regular; 
*A porcentagem de pessoas que responderam bom, entre todos os espectadores analisados.*/

var contPessoaOtimo = 0, contPessoaRegular = 0, contPessoaBom = 0
var somaIdade = 0, mediaIdade = 0
var idade, opFilme

for(var i = 0; i < 15; i++){
    idade = Number(prompt("Digite a sua idade: "))
    console.log("Qual a sua opnião do filme (ótimo - 3 ; bom - 2 ; regular - 1)?")
    opFilme = Number(prompt("Digite: "))
    console.log("")
    if(opFilme == 3){
        contPessoaOtimo = contPessoaOtimo + 1
        somaIdade = somaIdade + idade   
        if(contPessoaOtimo > 0){
           mediaIdade = somaIdade/contPessoaOtimo
        }
    }
    else{
        if(opFilme == 1){
            contPessoaRegular = contPessoaRegular + 1
        }
        else{
            contPessoaBom = contPessoaBom + 1
        }
    }
}

porcentagemBom = (contPessoaBom * 100)/15

console.log("A média das idades das pessoas que responderam ótimo:"+mediaIdade)
console.log("A quantidade de pessoas que responderam regular:"+contPessoaRegular)
console.log("A porcentagem de pessoas que responderam bom:"+porcentagemBom+"%")