vetor = []
maiorNumero = 0
menorNumero = 999999
posicaoMenor = 0
posicaoMaior = 0

for i in range(0,10):
    numero = int(input(f"Digite o numero na posicao [{i}]: "))
    vetor.append(numero)

for i in range(0,10):
    if(vetor[i] > maiorNumero):
        maiorNumero = vetor[i]
        posicaoMaior = i

    if(vetor[i] < menorNumero):
        menorNumero = vetor[i]
        posicaoMenor = i

print(f"O maior numero é {maiorNumero} e sua posição é {posicaoMaior}")
print(f"O menor numero é {menorNumero} e sua posição é {posicaoMenor}")

