vetA = list()
vetB = list()

for i in range(0, 15):
    num = int(input(f"Digite um numero para o vetor A, na posição {i}: "))
    vetA.append(num)

    fat = 1
    j = 1
    while(j <= vetA[i]):
        fat = fat * j
        j = j + 1
        
    vetB.append(fat)


print("Vetor A                Vetor B")
for i in range(0, 15):
    print("  ",vetA[i],"        -->         ",vetB[i])

