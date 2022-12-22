vetor = []
contIguais30 = 0
contMaioresMedia = 0
contIguaisMedia = 0
somaNumeros = 0

for i in range(0,10):
    numero = float(input(f"Digite o numero na posição [{i}]: "))
    vetor.append(numero)
    somaNumeros = somaNumeros + numero

media = somaNumeros / 10

for i in range(0,10):
    if(vetor[i] > media):
        contMaioresMedia = contMaioresMedia + 1
    if(vetor[i] == 30):
        contIguais30 = contIguais30 + 1
    if(vetor[i] == media):
        contIguaisMedia = contIguaisMedia + 1

print(f"Maiores que a média -> {contMaioresMedia}")
print(f"Iguais a 30 -> {contIguais30}")
print(f"Iguais a média -> {contIguaisMedia}")