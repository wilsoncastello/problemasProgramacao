vA = []
vB = [] 
vC = []

print("VETOR A") 
for i in range(0, 20): 
    n = int(input("Digite o numero na posição %d:" %(i+1))) 
    vA.append(n) 

print("VETOR B") 
for i in range(0, 20): 
    n = int(input("Digite o numero na posição %d:" %(i+1))) 
    vB.append(n) 

for i in range(0,20): 
    n = int(vA[i] - vB[i]) 
    vC.append(n) 
print(vC)