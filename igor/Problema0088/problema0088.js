const prompt = require("prompt-sync")({ sigint: true });

var x = prompt("Escreve um numero: ")

if(x>0){
    console.log("O numero é positivo")
}else if(x<0){
    console.log("O numero é negativo")
}else{
    console.log("O numero é zero")
}