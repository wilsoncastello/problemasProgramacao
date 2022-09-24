const prompt = require("prompt-sync")({ sigint: true })

var x
for (let i = 0; i <= 5; i++) {
    x = Number(prompt("Digite o " + i + " número: "))
    x *= x
    console.log("O quadrado é " + x)
}