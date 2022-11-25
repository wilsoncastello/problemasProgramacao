const prompt = require("prompt-sync")({ sigint: true });
function soma(x, y){
    return x + y;
}

var n1 = Number(prompt("Digite o primeiro número: "));
var n2 = Number(prompt("Digite o segundo número: "));
console.log(soma(n1, n2))