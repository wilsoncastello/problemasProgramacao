const prompt = require("prompt-sync")({ sigint: true });

var n1 = parseInt(prompt("Escreve o primeiro numero: "))
var n2 = parseInt(prompt("Escreve o segundo numero: "))

var somatorio = 0

var n3 = parseInt(n1+1)

for(var i = n3; i<n2; i++){
    var m = i%2
    if(m == 0){
        somatorio = parseInt(somatorio + i)
        console.log(i)
    }
}

console.log("Somatorio: "+somatorio)