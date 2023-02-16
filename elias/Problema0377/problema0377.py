matriz = []
somaElementosDiagonalPrincipal = 0
for i in range(3):
    linhaMatriz = []
    for j in range(3):
        x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
        linhaMatriz.append(x)
    matriz.append(linhaMatriz)
for i in range(3):
    for j in range(3):
        if i == j:
            somaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal + matriz[i][j]
mediaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal / 3
print("A média dos elementos da diagonal principal é: ",mediaElementosDiagonalPrincipal)