import numpy as np
A = []
B = []
C = []
D = []

print("Digite os dados da matriz A: ")
for i in range(3):
   linha = []
   for j in range(4):
        x = int(input(f"Digite o valor na posiçao [{i}][{j}]:"))
        linha.append(x)

    A.append(linha)

print("Digite os dados da matriz B: ")
for i in range(3):
   linha = []
   for j in range(4):
        x = int(input(f"Digite o valor na posiçao [{i}][{j}]:"))
        linha.append(x)

    A.append(linha)

for i in range(3):
   C.append([])
   for j in range(4):
        C[i].append(A[i][j] + B[i][j])

for i in range(3):
   D.append([])
   for j in range(4):
        D[i].append(A[i][j] - B[i][j])

print("Matriz da soma das duas matrizes ")
print(np.Matriz(C))
print("")
print("Matriz da diferença das duas matrizes ")
print(np.Matriz(D))
