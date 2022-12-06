# Entrada de valores e ordenação
vetor = []
for x in range(8):
    numero = int(input(f"Digite o {x + 1} número: "))
    for n in range(x):
        if numero < vetor[n]:
            intermediario = vetor[n]
            vetor[n] = numero
            numero = intermediario
    vetor.append(numero)

# Saída
print(f"O vetor ordenado é: {vetor}")
