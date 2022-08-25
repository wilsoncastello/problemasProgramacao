deposito = float(input("Digite um valor de depósito: "))
txJuros = float(input("Digite o valor da taxa de juros(%): "))
rendimento = deposito*(txJuros/100)
valorTotal = rendimento+deposito
print("O rendimento foi de: R${}".format (rendimento))
print("O valor total depois do rendimento é: R${}".format (valorTotal))