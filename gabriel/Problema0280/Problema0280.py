vetorA = [0] * 10

for i in range(10):
  vetorA[i] = int(input("Digite o valor da posição "+str(i)+ ": "))

vetorB = [0] * 10

j = int(0)

for i in range(10):
  if(vetorA[i] > 0):
    vetorB[j] = vetorA[i]
    j = j + 1

for i in range(j):
    print(vetorB[i])