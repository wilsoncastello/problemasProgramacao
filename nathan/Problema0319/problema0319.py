n = int(input("Digite o tamanho do vetor: "))
vA = []
vB = []
y = 0

for i in range(n):
    x = int(input(f"Digite o valor na posição {i} :"))
    vA.append(x)


for i in range(n+1):
    if i != 0:
        for j in range(i):    
            y = y + vA[j]
        vB.append(y)    
        y = 0 
        
print(vB)