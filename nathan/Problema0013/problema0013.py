precoFabrica = float(input("Digite o preço de fábrica do veículo: "))
percDistribuidor = float(input("Digite o percentual de lucro do distribuidor: "))
percImposto = float(input("Digite o percentual de impostos: "))

lucroDistribuidor = (precoFabrica * percDistribuidor) / 100
valorImpostos = (precoFabrica * percImposto) / 100
precoFinal = precoFabrica + lucroDistribuidor + valorImpostos

print("Lucro do distribuidor: ", lucroDistribuidor)
print("Valor correspondente aos impostos: ", valorImpostos)
print("Preço final do veículo: ", precoFinal)