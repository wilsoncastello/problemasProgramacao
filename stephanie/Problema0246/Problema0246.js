const prompt = require("prompt-sync")({ sigint: true })

var a = []
var b = []
var c = []
for(let i = 0; i < 5; i++){
    a[i] =prompt("Digite o nome "+i+" do vetor A: ")
}
for(let i = 0; i < 10; i++){
    b[i] = prompt("Digite o nome "+i+" do vetor B: ")
}
for (let i=0;i<5;i++){
    c[i] = a[i]
}
var j = 5
for (let i=0;i<10;i++){
    c[j] = b[i]
    j++
}

console.log("Vetor C:")
for(let i = 0; i < 15; i++){
    console.log(c[i])
}
