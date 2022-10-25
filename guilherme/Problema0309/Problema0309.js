const prompt = require("prompt-sync")({ sigint: true })

var x = 0, y = 0, j = 0, k = 0
var a = []
var b = []
var c, d
console.log("Digite 6 números para A: ")
for(let i = 0; i < 6; i++){
    a[i] = Number(prompt())
    if(a[i] % 2 == 1)
        x++
    else
        y++
}
console.log("Digite 6 números para B: ")
for(let i = 0; i < 6; i++){
    b[i] = Number(prompt())
    if(b[i] % 2 == 1)
        x++
    else
        y++
}
c = [x]
d = [y]
for(let i = 0; i < 6; i++){
    if(a[i] % 2 == 1){
        c[j] = a[i]
        j++
    }else{
        d[k] = a[i]
        k++
    }
}
for(let i = 0; i < 6; i++){
    if(b[i] % 2 == 1){
        c[j] = b[i]
        j++
    }else{
        d[k] = b[i]
        k++
    }
}
console.log("Vetor C: ")
for(let i = 0; i < x; i++)
    console.log(c[i])
console.log("Vetor D: ")
for(let i = 0; i < y; i++)
    console.log(d[i])
