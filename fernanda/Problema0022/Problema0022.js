const prompt = require("prompt-sync")({ sigint: true });
var custo = prompt("Digite o custo do espetáculo teatral: ")
var preco = prompt(("Digite o preço do convite desse espetáculo: "))

var quantidadeConvite = custo/preco

console.log("Devem ser vendidos "+ quantidadeConvite +" convites para que, pelo menos, o custo do espetáculo seja alcançado.")