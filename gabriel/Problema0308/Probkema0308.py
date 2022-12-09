vetorA = [0] * 12
vetorB = [0] * 12

for i in range(12):
  vetorA[i] = int(input("Digite o valor inteiro da posição "+str(i)))



for i in range(12):
  vetorB[i] = vetorA[i]
  if(vetorB[i] % 2 != 0):
    vetorB[i] = vetorA[i] * 2

print(vetorB)