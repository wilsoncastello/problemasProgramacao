matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

#Preenchendo a matriz
for i in range (0,3):
    for j in range (0,4):
        matriz[i][j] = int(input(f"Digite o número na posição [{i, j}]: "))

#Transpondo a matriz
matrizTransposta = [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]
for i in range(0, 4):
    for j in range(0, 3):
        matrizTransposta[i][j] = matriz[j][i]

#Imprimindo a matriz
for i in range(0, 4):
    for j in range(0, 3):
        print(f"  |  {matrizTransposta[i][j]}  |  ")

    print("")