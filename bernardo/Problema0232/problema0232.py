# Entrada de valores
massa = float(input("Digite a massa (em gramas): "))

# Cálculo do tempo necessário
segundos = 0
while massa >= 0.05:
    massa /= 2
    segundos += 50

# Saída
print(f"O tempo necessário é: {segundos} segundos")
