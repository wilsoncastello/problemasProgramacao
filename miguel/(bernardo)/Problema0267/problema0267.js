const prompt = require("prompt-sync")({ sigint: true });

//Entrada de valores
var conta = [];
var saldo = [];
for (var i = 0; i < 10; i++) {
    codigo = parseInt(prompt("Digite o código da " + (i + 1) + " conta: "));
    if (conta.includes(codigo)) {
        console.log("Código já cadastrado");
        i--;
    }
    else {
        conta[i] = codigo;
        saldo[i] = parseFloat(prompt("Digite o saldo: "));
    }
}

// Aplicação do menu
var executando = true;
console.log("Menu de Opções");
while (executando) {
    console.log(
        "1. Efetuar depósito" +
        "\n2. Efetuar saque" +
        "\n3. Consultar saldo" +
        "\n4. Consultar o ativo bancário" +
        "\n5. Finalizar o programa");
        opcao = parseFloat(prompt("Digite o número da opção desejada: "));
    switch (opcao) {
        case 1:
            codigo = parseInt(prompt("Digite o código da conta: "));
            deposito = parseFloat(prompt("Digite o valor de depósito: "));
            if (conta.includes(codigo)) {
                indice = conta.indexOf(codigo);
                saldo[indice] += deposito;
            }
            else {
                console.log("Conta não encontrada");
            }
            break;
        case 2:
            codigo = parseInt(prompt("Digite o código da conta: "));
            saque =  parseFloat(prompt("Digite o valor de saque: "));
            if (conta.includes(codigo)) {
                indice = conta.indexOf(codigo);
                if (saldo[indice] - saque >= 0) {
                    saldo[indice] -= saque;
                }
                else {
                    console.log("Saldo insuficiente");
                }
            }

            else {
                console.log("Conta não encontrada");
            }
            break;
        case 3:
            codigo =  parseInt(prompt("Digite o código da conta: "));
            if (conta.includes(codigo)) {
                indice = conta.indexOf(codigo);
                console.log("O saldo da conta é: R$" + Math.round(saldo[indice] * 100) / 100);
            }
            else {
                console.log("Conta não encontrada");
            }
            break;
        case 4:
            var ativo = 0;
            for (var i = 0; i < 10; i++) {
                ativo += saldo[i];
            }
            console.log("Ativo bancário: R$" + Math.round(ativo * 100) / 100);
            break;
        case 5:
            executando = false;
            console.log("Operação finalizada");
            break;
        default:
            console.log("Opção não reconhecida");
    }
}