import math

# Funçao para calcular determinante da matriz


def determinante(matriz, ordem):
    det = 0
    if ordem == 1:
        return matriz[0][0]
    if ordem == 2:
        return (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1])
    else:
        mat = []
        for i in range(ordem - 1):
            mat.append([])
        col = 0
        for intermediario in range(ordem):
            for l in range(1, ordem):
                for coluna in range(ordem):
                    if intermediario != coluna:
                        col += 1
                        mat[l - 1].insert(col, matriz[l][coluna])
                col = 0
            if matriz[0][intermediario] != 0:
                det += math.pow((-1), intermediario) * \
                    matriz[0][intermediario] * determinante(mat, ordem - 1)
    return det


# Entada de valores
det = 0
dependencia = ""
matriz = []
ordem = int(input("Digite a orderm da matriz: "))
for i in range(ordem):
    matriz.append([])
for i in range(ordem):
    for j in range(ordem):
        matriz[i].insert(j, float(input(f"Digite o número {(i+1)}x{(j+1)}: ")))

# Verificação de dependência linear e chamada de função
det = determinante(matriz, ordem)
if det == 0:
    dependencia = "linearmente dependente"
else:
    dependencia = "linearmente independente"

# Saída
print(f"A matriz é: {dependencia}")
