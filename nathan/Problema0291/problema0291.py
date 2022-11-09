vA = []
vB = []
vC = []

print("Vetor A")
for i in range(25):
  n = int(input(f"Digite o vetor na posição {i}: "))
  vA.append(n)

print("Vetor B")
for i in range(25):
  n = int(input(f"Digite o vetor na posição {i}: "))
  vB.append(n)

j = 0
k = 0
for i in range(50):
  if (i % 2 == 0):
    vC.append(vA[j])
    j = j + 1
  else:
    vC.append(vB[k])
    k = k + 1

print("Vetor C")
print(vC)
