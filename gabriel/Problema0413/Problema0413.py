def somarMatriz(matrizA):
    soma = 0
    
    for i in range(3):
        for j in range(3):
            soma = soma + matrizA[i][j]
      
    return soma
  

matrizA = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
soma = 0

for i in range(3):
    for j in range(3):
        matrizA[i][j] = float(input("Digite o elemento correspondente a linha "+str(i)+" e a coluna "+str(j) + ": "))
   

soma = somarMatriz(matrizA)

print("Soma dos elementos da matriz A: "+str(soma))