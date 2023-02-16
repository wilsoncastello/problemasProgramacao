matriz = [[0, 0], [0, 0]]
    
for i in range(2):
    for j in range(2):
        matriz[i][j] = float(input("Digite o valor armazenado na linha " +str(i)+ " e na coluna "+str(j) + ": "))
           
        
determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0])
        
print("Determinante da matriz: " +str(determinante))