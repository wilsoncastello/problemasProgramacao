const prompt = require("prompt-sync")({ sigint: true })

var codigo, x, resultado, resto, div;
var somaParcelas, restoParcelas, digitoVerificador;
var n = Number(prompt("Digite o número de Códigos: "))
for (let i = 1; i <= n; i++) {
    resultado = 0
    resto = 0
    div = 10000
    x = 6
    somaParcelas = 0
    codigo = Number(prompt("Digite o " + i + " Código com 5 Dígitos: "))
    for (let j = 0; j < 5; j++) {
        if (j == 0) {
            resultado = Math.floor(codigo / div)
            resto = Math.floor(codigo % div)
            div /= 10
            somaParcelas += (x * resultado)
            x--
        } else {
            resultado = Math.floor(resto / div)
            resto = Math.floor(resto % div)
            div /= 10
            somaParcelas += (x * resultado)
            x--
        }
    }
    console.log("Somatório das Parcelas: " + somaParcelas)
    restoParcelas = Math.floor(somaParcelas % 11)
    digitoVerificador = 11 - restoParcelas
    if (digitoVerificador == 10 || digitoVerificador == 11) {
        digitoVerificador = 0
    }
    console.log("Digito Verificador(" + i + "): " + digitoVerificador + "\n")
}