vetorA = [0] * 10
vetorB = [0] * 10

for i in range(10):
  vetorA[i] = int(input("Digite o valor inteiro da posição "+str(i) + ": "))

for i in range(10):
  fat = int(1)
  j = int(2)

  while(j <= vetorA[i]):
    fat = fat * j
    j = j + 1

  vetorB[i] = fat
  if(vetorA[i] < 0):
    vetorB[i] = 0

aux = int(0)
for i in range(10):
  for j in range(i+1, 10):
    if(vetorB[i] > vetorB[j]):
      aux = vetorB[i]
      vetorB[i] = vetorB[j]
      vetorB[j] = aux

for i in range(10):
  if(vetorB[i] > 0):
    print(vetorB[i])