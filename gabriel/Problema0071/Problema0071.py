"""
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem de lucro do revendedor e com o custo dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do revendedor seja de 25% e que os impostos custam 45% do custo de fábrica, faça um algoritmo para determinar o preço final do automóvel (custo ao consumidor).
"""

CustoFabrica = float(input("Digite o preço de fábrica do veículo: "))

precoVenda = (CustoFabrica) + (CustoFabrica * 0.25) + (CustoFabrica * 0.45)

print("Preço Final ao consumidor: " + str(precoVenda))

