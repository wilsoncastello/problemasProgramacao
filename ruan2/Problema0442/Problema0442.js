const prompt = require("prompt-sync")({sigint: true})

function calculo(n1, n2){
    var s = 0;

    if(n1 % n2 == 0){
        s = 0;
    }

    else{
        if(n1 > n2){
            while(n1 % n2 != 0){
                n2 = n2 + 1
                s = n2
            }
        }
        else{
            while(n1 % n2 != 0){
                n2 = n2 - 1
                s = n2
            }
        }
    }
    return s
}

var n1, n2
var valRetorno

n1 = Number(prompt("Digite o dividendo: "))
n2 = Number(prompt("Digite o divisor: "))

valRetorno = calculo(n1, n2)

console.log()
console.log("Se o primeiro número for divisivel pelo segundo número, caso contrário irá retornar o proximo divisor daquela divisão");
console.log("Valor retornado: "+valRetorno);