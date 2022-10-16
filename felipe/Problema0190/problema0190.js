const prompt = require("prompt-sync")({ sigint: true })

lim = prompt("Digite o limite superior maior que 0: ")
incr = prompt("Digite o incremento, maior que 0: ")

for (let i = 0; i <= lim/incr; i++) {
    console.log(i*incr+" ");
}