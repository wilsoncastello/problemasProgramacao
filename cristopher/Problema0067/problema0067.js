const prompt = require("prompt-sync")({ sigint: true });

var nome = (prompt("Informe o seu nome: "))

var qtdPorcas = parseInt(prompt("Digite quantas porcas você comprou: "))
var precoPorca = parseFloat(prompt("Agora, informe o preço unitário da porca: R$ "))

var qtdParafusos = parseInt(prompt("Digite quantas porcas você comprou: "))
var precoParafuso = parseFloat(prompt("Agora, informe o preço unitário do parafuso: R$ "))

var qtdArruelas = parseInt(prompt("Digite quantas arruelas você comprou: "))
var precoArruela = parseFloat(prompt("Agora, informe o preço unitário da arruela: R$ "))

var valorBruto = (precoPorca * qtdPorcas) + (precoParafuso * qtdParafusos) + (precoArruela * qtdArruelas)

var descontoPorca = (precoPorca * qtdPorcas) * 10/100
var descontoParafuso = (precoParafuso * qtdParafusos) * 20/100
var descontoArruela = (precoArruela * qtdArruelas) * 30/100

var valorDesconto = descontoPorca + descontoParafuso + descontoArruela

var valorFinal = valorBruto - valorDesconto

console.log(nome + ", você comprou " + qtdPorcas + " porcas, " + qtdParafusos + " parafusos e " + qtdArruelas + " arruelas.")
console.log("O valor bruto é de R$ " + valorBruto)
console.log("O valor do desconto é de R$ " + valorDesconto)
console.log("O valor final a ser pago é de R$ " + valorFinal)