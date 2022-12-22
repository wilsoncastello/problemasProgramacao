# Entrada de valores
numero1 = int(input(f"Digite o 1 número: "))
numero2 = int(input(f"Digite o 2 número: "))

# Cálculo da multiplicação
resultado = 0
for x in range(numero2):
    resultado += numero1

# Saída
print(f"O resultado da multiplicação é: {resultado}")
