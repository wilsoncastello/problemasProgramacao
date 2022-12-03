vetor = []
N = int(input("Digite a quantidade de números para o vetor: "))
for i in range (N):
    n = int(input("Digite um número para a posição %d do vetor:  " %i))
    vetor.append(n)
print("Números múltiplos de 2:")
for i in range (N):
    if vetor[i] % 2 == 0 :
        print(vetor[i])
print("Números múltiplos de 3:")
for i in range (N):
    if vetor[i] % 3 == 0 :
        print(vetor[i])
print("Números multiplos de 2 e de 3:")
for i in range (N):
    if vetor[i] % 2 == 0 and vetor[i] % 3 ==0 :
        print(vetor[i])
