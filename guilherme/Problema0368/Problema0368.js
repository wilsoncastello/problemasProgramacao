const prompt = require("prompt-sync")({ sigint: true })

var x = [,]
var cont = 0
for(let i = 0; i < 4; i++){
    for(let j = 0; j < 4; j++){
        x[i,j] = Number(prompt("Digite um número inteiro: "))
        if(x[i,j] > 30)
            cont++
    }
}
console.log("Quantidade de elementos maior que 30: " + cont)
