import math

# Entrada de valores
numeros = []

for x in range(1, 16):
    num = float(input(f"Digite o {x} número: "))
    numeros.append(num)

# Saída e cálculo da raíz quadrada
for num in numeros:
    raiz_quadrada = math.sqrt(num)
    print(f"A raiz quadrada de {num} é: {raiz_quadrada}")
