matriz = []
for i in range(5):
    linhaMatriz = []
    for j in range(5):
        if i == j:
            x = '@'
            linhaMatriz.append(x)
        else :
            x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
            linhaMatriz.append(x)
    matriz.append(linhaMatriz)
for i in range(5):
    for j in range(5):
        print(matriz[i][j], end = " ")
    print()