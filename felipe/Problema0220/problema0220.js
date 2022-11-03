const prompt = require("prompt-sync")({ sigint: true })

n = prompt("Digite o numero de termos da serie: ")
fact = 1

for (let i = 1; i <= n; i++) {
    fact = fact * i
    console.log(fact);
}