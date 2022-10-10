const prompt = require("prompt-sync")({ sigint: true })

var x, j = 19
var a = []
var b = []
for(let i = 0; i < 20; i++)
    a[i] = Number(prompt("Digite o numero " + i + " do vetor A: "))
console.log("Vetor A:")
for(let i = 0; i < 20; i++)
    console.log(a[i])
for(let i = 0; i < 20; i++){
        x = a[i]
        a[i] = b[j]
        b[j] = x
        j--  
}
console.log("\nVetor B:")
for(let i = 0; i < 20; i++)
    console.log(b[i])
