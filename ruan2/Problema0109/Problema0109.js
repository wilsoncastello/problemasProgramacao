const prompt = require("prompt-sync")({sigint: true})

/*Crie uma calculadora capaz de somar, subtrarir, multiplicar e dividir 2 números. 
O usuário deve informar a operação desejada e os valores a serem calculados */

var op
var num1, num2
var valFinal

console.log("Escolha uma das operações a baixo (1, 2, 3 ou 4)")
console.log("1 - Adição")
console.log("2 - Subtração")
console.log("3 - Multiplicação")
console.log("4 - Divisão")
op = Number(prompt("Digite a sua opção: "))

if(op > 4 || op < 1){
    console.log("Digite um valor de operação válido")
}
else{
    num1 = Number(prompt("Digite o valor do primeiro numero: "))
    num2 = Number(prompt("Digite o valor do segundo numero: "))

    if(op == 1){
        valFinal = num1 + num2
    }
    else{
        if(op == 2){
            valFinal = num1 - num2
        }
        else{
            if(op == 3){
                valFinal = num1 * num2
            }
            else{
                valFinal = num1 / num2
            }
        }
    }
}

console.log("Valor final: "+valFinal)



