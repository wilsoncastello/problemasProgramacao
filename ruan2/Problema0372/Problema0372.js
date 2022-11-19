const prompt = require("prompt-sync")({sigint: true})

var kmLitro, nomeC, distC
const nomecidade = []
const distcidades = [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
var quantCombustivel
var x = false

kmLitro = Number(prompt("Digite quantos km o veículo faz por litro: "))

console.log("");
for(var i = 0; i<5; i++){
    nomeC = prompt("Digite o nome da cidade ("+i+"): ")
    nomecidade.push(nomeC)
}

console.log("");
for(var i = 0; i<5; i++){
    for(var j = i + 1; j<5; j++){
        distcidades[i][j] = Number(prompt("Digite a distância entre as cidades em quilômetro("+nomecidade[i]+" até "+nomecidade[j]+"): ")) 
    }
}
console.log("")
for(var i = 0; i<5; i++){
    for(var j = i + 1; j<5; j++){
        if(distcidades[i][j] <= 250){
            console.log(nomecidade[i]+" até "+nomecidade[j]+" não ultrapassou dos 250 quilômetros")
            x = true
        }
    }
}

if(x == false){
    console.log("Todos os percursos passaram dos 250 quilômetros")
}

console.log("");
for(var i = 0; i<5; i++){
    for(var j = i + 1; j<5; j++){
        quantCombustivel = distcidades[i][j] * kmLitro
        console.log(nomecidade[i]," até ",nomecidade[j],", gasta ",quantCombustivel," litros de combutível")
    }
}