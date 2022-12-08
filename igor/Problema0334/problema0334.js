const prompt = require("prompt-sync")({ sigint: true });

var texto = prompt("Escreve o texto uma palavra cada: ")
var x = new Array();

while(texto!="."){
    x[x.length] = texto
    var texto = prompt("Escreve o texto uma palavra cada: ")
}

x.sort()

for(let i=0;i<x.length;i++){
    console.log(x[i])
}