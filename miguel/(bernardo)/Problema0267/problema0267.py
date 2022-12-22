# Entrada de valores
conta = []
saldo = []
i = 0
while i < 10:
    codigo = int(input(f"Digite o código da {i + 1} conta: "))
    if codigo in conta:
        print("Código já cadastrado")
    else:
        conta.append(codigo)
        saldo.append(float(input("Digite o saldo: ")))
        i += 1

# Aplicação do menu
executando = True
print("Menu de Opções")
while executando:
    opcao = int(input(
                "1. Efetuar depósito"
                "\n2. Efetuar saque"
                "\n3. Consultar saldo"
                "\n4. Consultar o ativo bancário"
                "\n5. Finalizar o programa"
                "\nDigite o número da opção desejada: "))
    match opcao:
        case 1:
            codigo = int(input("Digite o código da conta: "))
            deposito = float(input("Digite o valor de depósito: "))
            if codigo in conta:
                indice = conta.index(codigo)
                saldo[indice] += deposito
            else:
                print(f"Conta não encontrada")
        case 2:
            codigo = int(input("Digite o código da conta: "))
            saque = float(input("Digite o valor de saque: "))
            if codigo in conta:
                indice = conta.index(codigo)
                if saldo[indice] - saque >= 0:
                    saldo[indice] -= saque
                else:
                    print("Saldo insuficiente")
            else:
                print(f"Conta não encontrada")
        case 3:
            codigo = int(input("Digite o código da conta: "))
            if codigo in conta:
                indice = conta.index(codigo)
                print(f"O saldo da conta é: R${round(saldo[indice],2)}")
            else:
                print(f"Conta não encontrada")
        case 4:
            ativo = 0
            for s in saldo:
                ativo += s
            print(f"Ativo bancário: R${round(ativo,2)}")
        case 5:
            executando = False
            print("Operação finalizada")
        case _:
            print("Opção não reconhecida")
