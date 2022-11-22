const prompt = require("prompt-sync")({ sigint: true })

function acrescimo(x, y){
    var z = y*100/x
    return z
}

var valorAntigo, valorAtual
console.log("Digite o valor antigo de um produto: ")
valorAntigo = Number(prompt())
console.log("Digite o valor atual de um produto: ")
valorAtual = Number(prompt())

var acrescimo = acrescimo(valorAntigo, valorAtual)
console.log("O percentual de acréscimo: "+acrescimo+"%")