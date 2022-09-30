const prompt = require("prompt-sync")({ sigint: true })
var n, somaPositivos = 0, qtdNegativos = 0
for(let i = 1; i <= 50; i++){
    n = Number(prompt("Digite o " + i + " número: "))
    if(n >= 0)
        somaPositivos += n;
    else
        qtdNegativos++;
}
console.log("Soma dos Positivos: " + somaPositivos)
console.log("Quantidade de Negativos: " + qtdNegativos)