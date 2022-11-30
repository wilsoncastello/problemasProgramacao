const prompt = require("prompt-sync")({ sigint: true })

function binario(n){
    var dec = 0
    var j = n.length - 1
    for(let i = 0; i < n.length; i++){
        if(n.charAt(i) == '1')
            dec += Math.pow(2,j)
        j--
    }
    return dec
}

var bin = prompt("Digite um número em binário: ")
console.log(binario(bin))