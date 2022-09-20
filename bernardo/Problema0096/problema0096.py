# Entrada de valores
conta = int(input("Digite o número da conta: "))
saldo = float(input("Digite o saldo da conta: "))
operacao = input("Digite o tipo de operação (depósito ou retirada): ")
valor = float(input("Digite o valor desejado: "))

# Realização da operação
if operacao == "depósito" or operacao == "deposito":
    saldo += valor
elif operacao == "retirada":
    saldo -= valor
else:
    print("Operação não reconhecida")

# Saída
print(f"O saldo atual da conta {conta} é: R${round(saldo,2)}")
if saldo < 0:
    print("Conta estourada")
else:
    print("Conta regular")
