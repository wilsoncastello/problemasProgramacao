const prompt = require("prompt-sync")({ sigint: true });

for(var i=0; i<8; i++){
    var x = prompt("Digite um número:")
    console.log("O logaritmo de base 10 do número "+x+" é: "+Math.log10(x));
}