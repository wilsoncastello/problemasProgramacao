const prompt = require("prompt-sync")({ sigvar: true });

function calculaFatorial(x){
    var fatorial = 1

    for(var i = 1; i <= x; i++){
        fatorial = fatorial * i
    }

    return fatorial
}

function combinacao(n, p){
    var resultado = calculaFatorial(n) / (calculaFatorial(p) * calculaFatorial(n - p))
    
    return resultado
}

var n = parseInt(prompt("Digite o valor de 'n' para a combinação: "))
var p = parseInt(prompt("Digite o valor de 'p' para a combinação: "))

var resultado = combinacao(n, p)
console.log(resultado)