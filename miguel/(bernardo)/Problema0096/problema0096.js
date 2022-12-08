const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var conta = parseInt(prompt("Digite o número da conta: "));
var saldo = parseFloat(prompt("Digite o saldo: "));
var operacao = prompt("Digite o tipo de operação (deposito ou retirada): ");
var valor = parseFloat(prompt("Digite o valor desejado: "));

//Realização da operação
if (operacao == "depósito" || operacao == "deposito") {
    saldo += valor;
}
else if (operacao == "retirada"){
   saldo -= valor;
}
else {
    console.log("Operação não identificada");
}

//Saída
console.log("O saldo atual da conta " + conta + " é: R$" + Math.round(saldo * 100) / 100);
if (saldo < 0){
    console.log("Conta estourada");
}
else{
    console.log("Conta regular");
}