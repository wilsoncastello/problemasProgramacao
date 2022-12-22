const prompt = require("prompt-sync")({ sigint: true });

var salarioBruto = prompt("Digite o salário bruto: ")
var valorPrestacao = prompt("Digite o valor da prestação: ")

var valorMaximo = ( salarioBruto*30 )/100;

if (valorPrestacao > valorMaximo){
    console.log("O empréstimo não pode ser concedido.");
}else {
    console.log("O empréstimo pode ser concedido.");
}
