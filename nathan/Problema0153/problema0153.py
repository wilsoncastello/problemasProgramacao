preco = float(input("Digite o preço do produto: "))

if preco < 50:
	print("O novo preço é: R$", (preco + (preco * 0.05)))
elif preco >= 50 and preco <= 100:
	print("O novo preço é: R$", (preco + (preco * 0.10)))
else:
	print("O novo preço é: R$", (preco + (preco * 0.15)))

# Classificação conforme a tabela:
if preco < 80:
	print("Classificação: Barato.")
elif preco >= 80 and preco <= 120:
	print("Classificação: Normal.")
elif preco > 120 and preco <= 200:
	print("Classificação: Caro.")
else:
	print("Classificação: Muito caro.")