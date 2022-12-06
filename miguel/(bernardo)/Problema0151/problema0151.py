# Entrada de valores
custo = float(input("Digite o custo de fábrica: "))

# Cálculo do custo ao consumidor
if custo < 12000:
    distribuidor = custo * 0.05
    impostos = 0
elif custo <= 25000:
    distribuidor = custo * 0.10
    impostos = custo * 0.15
else:
    distribuidor = custo * 0.15
    impostos = custo * 0.20

preco = custo + distribuidor + impostos

# Saída
print(f"O custo ao consumidor é: R${round(preco,2)}")
