# Entrada de valores e verificação de números maiores que 30
quantidade = 0

for x in range(1, 16):
    num = float(input(f"Digite o {x} número: "))
    if num > 30:
        quantidade += 1

# Saída e cálculo da raíz quadrada
print(f"A quantidade de números maiores que 30 é: {quantidade}")
