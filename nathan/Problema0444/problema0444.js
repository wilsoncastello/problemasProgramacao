const prompt = require("prompt-sync")({ sigint: true });
function verificaN(x){
    if(x < 0)
        console.log("NEGATIVO");
    else
        console.log("POSITIVO");
}
x = Number(prompt("Digite um numero para saber se é positivo ou negativo:"));
verificaN(x);