def calcularInterseccao(vetorA,vetorB):
       
    vetorC= [0] * 10; 
    
    for i in range(10):
        for j in range(10):
            if(vetorA[i] == vetorB[j]):
                vetorC[i] = vetorA[i]
        
    
    for i in range(10):
        for j in range(i+1, 10):
            if(vetorC[i] == vetorC[j]):
                vetorC[j] = None
       
            
            
    return vetorC

   
   
vetorA= [0] * 10
vetorB= [0] * 10
   
print("Digite os dados do vetor A")
for i in range(10):
    vetorA[i] = int(input("Digite o valor da posição: "+str(i) + ": "))
   
   
     
print("Digite os dados do vetor B")
for i in range(10):
    vetorB[i] = int(input("Digite o valor da posição: "+str(i) + ": "))
   
   
vetorC = calcularInterseccao(vetorA, vetorB)
   
print("Vetor Intersecção")
for i in range(10):
    if(vetorC[i] != None):
       print(vetorC[i])

print(vetorC)
   
   