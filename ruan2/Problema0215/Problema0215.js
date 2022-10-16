const prompt = require("prompt-sync")({sigint: true})

/*Crie um algoritmo que controle o saldo bancário de um cliente. 
O algoritmo deve ler o valor do saldo inicial e em seguida as 
operações realizadas na conta (código e valor da operação). 
As operações podem ser as seguintes: 
Saque em dinheiro (código = 10) 
Depósito (código = 33) 
Pagamento de cheque (código = 4) 
Ao ler as operações o algoritmo deve realizar as atualizações na conta, 
imprimindo uma mensagem ao usuário com o saldo atual.
O algoritmo deverá continuar a leitura até que o código de operação seja zero. 
Códigos diferentes dos definidos devem ser ignorados e uma mensagem de erro apresentada.
Ao final do processamento o algoritmo deverá imprimir se o cliente está com saldo negativo.*/

var saldo, codOP

saldo = float(input("Digite o seu saldo: "))
console.log("Escolha a operação")
console.log("")
console.log("Caso queira parar (codigo = 0)")
console.log("Pagamento de cheque (código = 4)")
console.log("Saque em dinheiro (código = 10)")
console.log("Depósito (código = 33)")
console.log("")
codOP = Number(prompt("Digite o código da operação: "))

while(codOP != 0){
    console.log("")
    valOp = Number(prompt("Digite o valor da operação: "))
    
    if(codOP != 4 && codOP != 10 && codOP !=33){
        console.log("Código inválido")
    }
    else{ 
        if(codOP == 4){
            saldo = saldo + valOp
            console.log("Operação feita com êxito")
        }
        else{
            if(codOP == 10){
                saldo = saldo - valOp
                console.log("Operação feita com êxito")
            }
            else{
                saldo = saldo + valOp
                console.log("Operação feita com êxito")
            }
        }
    }

    console.log("Escolha a operação")
    console.log("")
    console.log("Caso queira parar (codigo = 0)")
    console.log("Pagamento de cheque (código = 4)")
    console.log("Saque em dinheiro (código = 10)")
    console.log("Depósito (código = 33)")
    console.log("")
    codOP = Number(prompt("Digite o código da operação: "))
}

console.log("")
if(saldo < 0){
    console.log("Saldo negativo")
}
else{
    console.log("Saldo positivo")
}
console.log("Novo saldo: ",saldo)