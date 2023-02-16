matriz = []
vetorSomaLinhas = []
matrizResultante = []
for i in range(5):
    linhaMatriz = []
    for j in range(4):
        x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
        linhaMatriz.append(x)
    matriz.append(linhaMatriz)
for i in range(5):
    somaLinhas = 0
    for i in range(4):
        somaLinhas = somaLinhas + matriz[i][j]   
    vetorSomaLinhas.append(somaLinhas)
for i in range(5):
    for i in range(4):
        x = matriz[i][j] * vetorSomaLinhas[i]
        matrizResultante.append(x)
print("A matriz resultante é: ")
for i in range(5):
    for i in range(4):
        print(matrizResultante[i][j], end = " ")  
    print("")