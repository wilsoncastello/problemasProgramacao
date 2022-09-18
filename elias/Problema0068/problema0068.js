const prompt = require("prompt-sync")({ sigint: true });

var quantidadePrestacoes = parseInt(prompt("Digite a quantidade total de prestações: "));
var quantidadePrestacoesPagas = parseInt(prompt("Digite a quantidade de prestações já pagas: "));
var valorPrestacao = parseFloat(prompt("Digite o valor da prestação atual: "));
var valorPago = quantidadePrestacoesPagas * valorPrestacao;
var saldoDevedor = (quantidadePrestacoes * valorPrestacao) - valorPago;
console.log("O total pago pelo consorciado até agora é: " + valorPago);
console.log("O saldo devedor é: " + saldoDevedor);