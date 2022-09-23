const prompt = require("prompt-sync")({ sigint: true });

var numero = parseFloat(prompt("Digite um número: "));
if(numero % 3 == 0){
    console.log("O número "+numero+" é multiplo de 3.");
}
else
    console.log("O número "+numero+" não é multiplo de 3.");