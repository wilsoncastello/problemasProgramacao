const prompt = require("prompt-sync")({ sigint: true })

x = Number(prompt("Digite o limite inferior: "))
y = Number(prompt("Digite o limite superior: "))
z = Number
n = Number(prompt("Digite o número cujos multiplos serão impressos: "))
for(let i = 0; i <= y; i++){
    z = i * n;
    if(z >= x && z <= y)
        console.log(z)
}
