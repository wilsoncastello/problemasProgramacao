A = []
B = []
for i in range (10):
    n = int(input("Digite um número inteiro para a posição %d do vetor:  " %i))
    A.append(n)
for i in range (10):
    somatorio = 0
    for j in range (1, A[i] + 1, 1):
        somatorio += j
    B.append(somatorio)
print("Vetor B:")
for i in range (10):
    print(B[i])