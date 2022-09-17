const prompt = require("prompt-sync")({ sigint: true });

var salarioMinimo = parseFloat(prompt("Digite o valor do salário mínimo: "));
var quantidadeQuilowatts = parseInt(prompt("Digite a quantidade de quilowatts consumido: "));
var valorQuilowatt = salarioMinimo / 5;
var valorConta = quantidadeQuilowatts * valorQuilowatt;
var valorContaMulta = valorConta * 1.15;
console.log("O valor de cada quilowatts consumido é: " + valorQuilowatt);
console.log("O valor da conta de luz a ser pago por essa residência é: " + valorConta);
console.log("O valor da conta de luz a ser pago com multa de 15% por essa residência é: " + valorContaMulta);