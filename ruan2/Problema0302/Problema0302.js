const prompt = require("prompt-sync")({sigint: true})
/*Escreva um algoritmo que tome como entrada um valor
inteiro expresso na base 10 e imprima o valor correspondente na base 2.*/

var num
var binario = new Array()
var numDiv, numDiv2

num = Number (prompt("Digite um número: "))

do{
    numDiv2 = parseInt(num/2)
    numDiv = num%2
    if(numDiv == 0){
        binario.unshift(0)
    }
    else{
        binario.unshift(1)
    }
    num = numDiv2
}while(numDiv2 != 0)

console.log(binario)