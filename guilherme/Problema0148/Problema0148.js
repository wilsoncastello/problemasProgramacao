const prompt = require("prompt-sync")({ sigint: true })

var codigoEstado = Number(prompt("Digite o Código do Estado do caminhão(1-5): "))
var peso = Number(prompt("Digite o peso da carga do caminhão em Toneladas: "))
var codigoCarga = Number(prompt("Digite o Código da Carga do caminhão(10-40): "))

var pesoQuilos = peso * 1000

var precoCarga = 0
if(codigoCarga >= 10 && codigoCarga <=20){
    precoCarga = 100 * pesoQuilos
}else if(codigoCarga >= 21 && codigoCarga <= 30){
    precoCarga = 250 * pesoQuilos
}else if(codigoCarga >= 31 && codigoCarga <= 40){
    precoCarga = 340 * pesoQuilos
}

var imposto = 0
if(codigoEstado == 1){
    imposto = precoCarga * 35 / 100
}else if(codigoEstado == 2){
    imposto = precoCarga * 25 / 100
}else if(codigoEstado == 3){
    imposto = precoCarga * 15 / 100
}else if(codigoEstado == 4){
    imposto = precoCarga * 5 / 100
}else if(codigoEstado == 5){
    imposto = 0
}

var total = precoCarga + imposto

console.log("Peso da carga do caminhão em Quilos: " + pesoQuilos)
console.log("Preço da carga do caminhão: " + precoCarga)
console.log("Valor do imposto: " + imposto)
console.log("Valor total: " + total)
