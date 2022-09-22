const prompt = require("prompt-sync")({ sigint: true })

console.log("DESTINO")
console.log("N - Norte")
console.log("NE - Nordeste")
console.log("CO - Centro-Oeste")
console.log("S - Sul")

var destino = prompt("\nDigite o seu destino: ")
var retorno = Boolean(prompt("Viagem de ida e volta(true ou false): "))

if(destino == "n" && retorno == false){
    console.log("Valor: R$500,00")
}else if(destino == "n" && retorno === true){
    console.log("Valor: R$900,00")
}else if(destino == "ne" && retorno === false){
    console.log("Valor: R$350,00")
}else if(destino == "ne" && retorno === true){
    console.log("Valor: R$650,00")
}else if(destino == "co" && retorno === false){
    console.log("Valor: R$350,00")
}else if(destino == "co" && retorno === true){
    console.log("Valor: R$600,00")
}else if(destino == "s" && retorno === false){
    console.log("Valor: R$300,00")
}else if(destino == "s" && retorno === true){
    console.log("Valor: R$550,00")
}else{
    console.log("Região Indisponível ou não existente")
}