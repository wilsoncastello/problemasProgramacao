M = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
soma = 0
        
for i in range(4):
    for j in range(4):
        M[i][j] = float(input("Digite o valor armazenado na linha " +str(i)+ " e na coluna " +str(j) + ": "));
            
        
for i in range(4):
    for j in range(4):
        if(i % 2 == 0 or j % 2 != 0):
            soma = soma + M[i][j]
           
        
print("Soma dos elementos das linhas pares e colunas ímpares: " +str(soma))