const prompt = require("prompt-sync")({ sigint: true })

var m = [,]
var qtdPares = 0, somaImpares = 0, soma = 0, media
for(let i = 0; i < 3; i++){
    for(let j = 0; j < 4; j++){
        console.log("Digite o elemento da linha: "+i+", coluna: "+j)
        m[i,j] = Number(prompt())
        if(m[i,j] % 2 == 0)
            qtdPares++
        if(m[i,j] % 2 == 1)
            somaImpares += m[i,j]
        soma += m[i,j]
    }
}
media = soma/12
console.log("Quantidade de elementos pares: "+qtdPares)
console.log("Soma dos elementos impares:"+somaImpares)
console.log("Média de todos os elementos: "+media)