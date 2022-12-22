matriz = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

#Preenchendo a Matriz
for i in range (0, 4):
    for j in range (0, 5):
        matriz[i][j] = int(input(f"Digite o número na posição [{i , j}]: "))

print(matriz)