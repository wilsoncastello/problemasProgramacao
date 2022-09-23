const prompt = require("prompt-sync")({ sigint: true });

var A = parseInt(prompt("Digite o primeiro número: "));
var B = parseInt(prompt("Digite o segundo número: "));
if(A>B){
    console.log("O maior número é: "+ A);
}
else
    console.log("O maior número é: "+ B);