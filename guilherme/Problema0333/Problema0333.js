const prompt = require("prompt-sync")({ sigint: true })

var frase1 = prompt("Digite a primeira frase: ")
var frase2 = prompt("Digite a segunda frase: ")
var frase3 = ""
var palavra1 = frase1.split(" ")
var palavra2 = frase2.split(" ")
var maiorFrase
if(palavra1.length >= palavra2.length)
    maiorFrase = palavra1.length
else
    maiorFrase = palavra2.length

for(let i = 0; i < maiorFrase; i++){
    if(i < palavra1.length)
        frase3 += palavra1[i] + ' '
    if(i < palavra2.length)
        frase3 += palavra2[i] + ' '
}
console.log(frase3)