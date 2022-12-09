def mostraVetor(v):
    print("Números no vetor:")
    for i in range(12):
        print(v[i])

def copiaMatriz(m, v):
    k = 0
    for i in range(3):
        for j in range(4):
            v[k] = m[i][j]
            k += 1

matriz = list(range(3))
vetor = list(range(12))
for i in range(3):
    linha = list(range(4))
    for j in range(4):
        print("Digite o nº da linha",i,"e coluna",j,":")
        linha[j] = int(input())
    matriz[i] = linha

copiaMatriz(matriz, vetor)
mostraVetor(vetor)