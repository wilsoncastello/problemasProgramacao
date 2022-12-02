vetor1 = []
vetor2 = []
for i in range (10):
    n = int(input("Digite um número para a posição %d do vetor:  " %i))
    vetor1.append(n)
for i in range (10):
    if vetor1[i] < 0 :
        vetor2.append(0)
    else:
        vetor2.append(vetor1[i])
print("Vetor 1:")
for i in range (10):
    print(vetor1[i])
print(" ")
print("Vetor 2:")
for i in range (10):
    print(vetor2[i])