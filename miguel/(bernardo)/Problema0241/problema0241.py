# Entrada de valores
vetorA = []
for n in range(10):
    vetorA.append(float(input(f"Digite o {n + 1} número: ")))

# Cálculo da multiplicação
vetorB = []
for n in vetorA:
    if n % 2 == 0:
        vetorB.append(n * 5)
    else:
        vetorB.append(n + 5)

# Saída
print(f"vetorA: {vetorA}")
print(f"vetorB: {vetorB}")
