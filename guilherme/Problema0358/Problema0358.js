const prompt = require("prompt-sync")({ sigint: true })

var x = [], y = [], z = []
var apoio, a, b
console.log("Digite a quantidade de clientes do Banco A: ")
a = Number(prompt())
for(let i = 0; i < a; i++){
    console.log("Digite o nome do " + i + "º cliente: ")
    x[i] = prompt()
}
for(let i = 0; i < a; i++){
    for(let j = i + 1; j < a; j++){
        if(x[i].localeCompare(x[j]) > 0){
            apoio = x[i]
            x[i] = x[j]
            x[j] = apoio
        }
    }
}
console.log("Lista X:")
for(let i = 0; i < a; i++){
    console.log(x[i])
}

console.log("Digite a quantidade de clientes do Banco B: ")
b = Number(prompt())

for(let i = 0; i < b; i++){
    console.log("Digite o nome do " + i + "º cliente: ")
    y[i] = prompt()
}
for(let i = 0; i < b; i++){
    for(let j = i + 1; j < b; j++){
        if(y[i].localeCompare(y[j]) > 0){
            apoio = y[i]
            y[i] = y[j]
            y[j] = apoio
        }
    }
}
console.log("Lista Y:")
for(let i = 0; i < b; i++){
    console.log(y[i])
}

for(let i = 0; i < a; i++){
    z[i] = x[i]
}
var temp = 0
for(let i = a; i < a+b; i++){
    z[i] = y[temp]
    temp++
}
for(let i = 0; i < a+b; i++){
    for(let j = i + 1; j < a+b; j++){
        if(z[i].localeCompare(z[j]) > 0){
            apoio = z[i]
            z[i] = z[j]
            z[j] = apoio
        }
        if(z[i].localeCompare(z[j]) == 0){
            if(j+1 < a+b){
                apoio = z[j]
                z[j] = z[j+1]
                z[j+1] = apoio
            }else{
                z[j] = "-"
            }
        }
    }
}
console.log("\nVetor Z: ")
for(let i = 0; i < a+b; i++){
    if(z[i] != "-")
        console.log(z[i])
}