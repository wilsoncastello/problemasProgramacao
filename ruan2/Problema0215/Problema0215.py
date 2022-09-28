#Crie um algoritmo que controle o saldo bancário de um cliente. 
#O algoritmo deve ler o valor do saldo inicial e em seguida as 
#operações realizadas na conta (código e valor da operação). 
#As operações podem ser as seguintes: 
#Saque em dinheiro (código = 10) 
#Depósito (código = 33) 
#Pagamento de cheque (código = 4) 
#Ao ler as operações o algoritmo deve realizar as atualizações na conta, 
#imprimindo uma mensagem ao usuário com o saldo atual.
#O algoritmo deverá continuar a leitura até que o código de operação seja zero. 
#Códigos diferentes dos definidos devem ser ignorados e uma mensagem de erro apresentada.
#Ao final do processamento o algoritmo deverá imprimir se o cliente está com saldo negativo.

saldo = float(input("Digite o seu saldo: "))
print("Escolha a operação")
print("")
print("Caso queira parar (codigo = 0)")
print("Pagamento de cheque (código = 4)")
print("Saque em dinheiro (código = 10)")
print("Depósito (código = 33)")
print("")
codOP = int(input("Digite o código da operação: "))


while(codOP != 0):
    print("")
    valOp = float(input("Digite o valor da operação: "))
    
    if(codOP != 4 and codOP != 10 and codOP !=33):
        print("Código inválido")
        
    elif(codOP == 4):
        saldo = saldo + valOp
        print("Operação feita com êxito")

    elif(codOP == 10):
        saldo = saldo - valOp
        print("Operação feita com êxito")

    else:
        saldo = saldo + valOp
        print("Operação feita com êxito")

    print("")
    print("Escolha a operação")
    print("")
    print("Caso queira parar (codigo = 0)")
    print("Pagamento de cheque (código = 4)")
    print("Saque em dinheiro (código = 10)")
    print("Depósito (código = 33)")
    print("")
    codOP = int(input("Digite o código da operação: "))

print("")
if(saldo < 0):
    print("Saldo negativo")
else:
    print("Saldo positivo")
print("Novo saldo: ",saldo)
    

