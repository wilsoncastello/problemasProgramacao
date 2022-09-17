salarioMinimo = float(input("Digite o valor do salário mínimo:"))
quantidadeQuilowatts = int(input("Digite a quantidade de Quilowwats consumidos:"))
valorQuilowatt = salarioMinimo / 5
valorConta = quantidadeQuilowatts * valorQuilowatt
valorContaMulta = valorConta * 1.15
print(f"O valor de cada quilowatts consumido é: {valorQuilowatt}")
print(f"O valor da conta de luz a ser pago por essa residência é: {valorConta}")
print(f"O valor da conta de luz a ser pago com multa de 15% por essa residência é: {valorContaMulta}")