const prompt = require("prompt-sync")({ sigint: true })

n = prompt("Digite o número de termos: ")
h = 0

for (let i = 1; i <= n; i++) {
    h = h + 1/i;
    console.log(h);
}