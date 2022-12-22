vetorA = [] 
vetorB = []
vetorC = []
vetorD = []

print("Preenchendo o vetor A")
for i in range(0,5):
    elemento = input(f"Digite o elemento {i}: ")
    vetorA.append(elemento)
print(vetorA)

print("Preenchendo o vetor B")
for i in range(0,5):
    elemento = input(f"Digite o elemento {i}: ")
    vetorB.append(elemento)
print(vetorB)

print("Preenchendo o vetor C")
for i in range(0,5):
    elemento = input(f"Digite o elemento {i}: ")
    vetorC.append(elemento)
print(vetorC)

vetorD = [vetorA + vetorB + vetorC]

print(vetorD)

