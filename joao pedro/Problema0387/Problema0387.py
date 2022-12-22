matriz = [[0] * (3) for _ in range(3)]
print("Digite valores inteiros: ")
i = 0
while (i < 3):
    j = 0
    while (j < 3):
        matriz[i][j] = int(input())
        j += 1
    i += 1
x = len(matriz)
y = len(matriz[0])
rotacionado = [[0] * (x) for _ in range(y)]
i = 0
while (i < y):
    j = 0
    while (j < x):
        rotacionado[i][j] = matriz[x - j - 1][i]
        j += 1
    i += 1
    
i = 0
while (i < 3):
    print("")
    j = 0
    while (j < 3):
        print(rotacionado[i][j], end="")
        j += 1
    i += 1
