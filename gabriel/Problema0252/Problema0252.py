vetorA = [0] * 10
vetorB = [0] * 10
vetorC = [0] * 20

print("Digite os dados do vetor A")
for i in range(10):
  vetorA[i] = input("Digite o valor guardado na posição " + str(i) + ":")

print("Digite os dados do vetor B")
for i in range(10):
  vetorB[i] = input("Digite o valor guardado na posição " + str(i) + ":")

j = 0
k = 0
for i in range(20):
  if (i % 2 == 0):
    vetorC[i] = vetorA[j]
    j = j + 1

  else:
    vetorC[i] = vetorB[k]
    k = k + 1

print("Vetor C")
for i in range(20):
  print(vetorC[i])