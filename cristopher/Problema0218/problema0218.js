const prompt = require("prompt-sync")({ sigvar: true });

function ehPrimo(n){
    if(n < 2){
        return false
    }
    for(var i = 2; i < n; i++){
        if(n % i == 0){
            return false
        }
    }
    return true
}

var qtd = parseInt(prompt("Quantos números deseja verificar: "))
for(var i = 0; i < qtd; i++){
    var numero = parseInt(prompt("Digite um numero par maior que 2: "))

    if(numero % 2 == 0 && numero > 2){
        encontrado = false
        for(var j = 2; j < numero; j++){
            if(ehPrimo(j)){
                var k = numero - j
                if(ehPrimo(k)){
                    encontrado = true
                    if(j <= k){
                        console.log(numero + " = " + j + " + " + k)
                        break
                    }
                }
            }
        }
        if(encontrado == false){
            console.log("Não foi encontrado nenhum número primo.")
        }
    }
    else{
        console.log("Número inválido.")
    }
}