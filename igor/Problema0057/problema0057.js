const prompt = require("prompt-sync")({ sigint: true });

var quantidadeFitas = prompt("Quantidade de fitas: ")
var valorAluguel = prompt("Valor do aluguel: ")

var faturamentoAnual = (parseInt(quantidadeFitas / 3) * valorAluguel)*12
console.log("Faturamento Anual: "+faturamentoAnual)

var totalMultas = (quantidadeFitas/10) * (valorAluguel*(110/100))
console.log("Valor ganho por multa ao mes: "+totalMultas)

var reposicao = quantidadeFitas * (10/100)
var fitasEstragadas = quantidadeFitas * (2/100)
var quantidadeFinal = quantidadeFitas - fitasEstragadas + reposicao
console.log("Quantidade de fitas final: "+quantidadeFinal)