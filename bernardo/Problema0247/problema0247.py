# Entrada de valores
matrizA = []
matrizB = []
tamanho = 20

for num in range(tamanho):
    matrizA.append(float(input(f"Digite o {num + 1} número: ")))

# Cálculo da matrizB
for num in range(tamanho):
    matrizB.append(matrizA[tamanho - 1 - num])

# Saída
print(f"MatrizA:\n {matrizA}")
print(f"MatrizB:\n {matrizB}")
