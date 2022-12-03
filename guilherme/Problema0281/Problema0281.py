vetor = list(range(10))
maior = 0
print("Digite 10 números inteiros: ")
for i in range(10):
    vetor[i] = int(input())
    if(vetor[i] > maior):
        maior = vetor[i]

print("\nVetor após os cálculos: ")
for i in range(10):
    vetor[i] /= maior
    print(vetor[i])

