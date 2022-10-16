j = 0
k = 0
vetor = list(range(8))
vetorPositivo = list(range(8))
vetorNegativo = list(range(8))
for i in vetor:
    vetor[i] = int(input("Digite um número inteiro: "))
    if(vetor[i] >= 0):
        vetorPositivo[j] = vetor[i]
        j += 1
    else:
        vetorNegativo[k] = vetor[i]
        k += 1

vetPos = list(range(j))
for i in vetPos:
    vetPos[i] = vetorPositivo[i]
print("Números do vetor positivo:")
for i in vetPos:
    print(i)

vetNeg = list(range(k))
for i in vetNeg:
    vetNeg[i] = vetorNegativo[i]
print("Números do vetor negativo:")
for i in vetNeg:
    print(i)
