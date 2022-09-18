const prompt = require("prompt-sync")({ sigint: true })

var n = Number(prompt("Digite um número: "))
if(n > 20 && n < 90)
    console.log("O número está entre 20 e 90")
else
    console.log("O número não está entre 20 e 90")    