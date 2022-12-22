vetorA = []
vetorB = []

for i in range(0, 10):
    numero = int(input(f"Digite o número na posição {i}:"))
    vetorA.append(numero)

for i in range(0, 10):
    vetorB.append(-(vetorA[i]))

print(vetorB)