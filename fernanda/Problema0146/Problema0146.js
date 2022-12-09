const prompt = require("prompt-sync")({ sigint: true });

var nome1 = prompt("Digite o primeiro nome: ")
var nome2 = prompt("Digite o segundo nome: ")

var comparacao = nome1.localeCompare(nome2)

if(comparacao < 0){
    console.log(nome1 +", "+ nome2);        
}else if(comparacao > 0){
    // o nome1 vem depois do nome2
    console.log(nome2 +", "+ nome1);
}else {
    console.log("Mesma Inicial: "+nome1 +", "+ nome2);
}