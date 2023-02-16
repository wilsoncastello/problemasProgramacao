# Entrada de valores
numero = int(input(f"Digite o número de termos: "))

# Cálculo da soma dos termos
razao = 3
soma = 0
termo = 3
if numero > 0:
    for x in range(numero):
        soma += termo
        termo *= razao

# Saída
print(f"O resultado da soma até o {numero} termo é: {soma}")
