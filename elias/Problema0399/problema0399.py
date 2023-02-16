A = []
B = []
C = []
for i in range(3):
    linhaA = []
    for j in range(3):
        x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
        linhaA.append(x)
    A.append(linhaA)
for i in range(3):
    linhaB = []
    for j in range(3):
        x = int(input(f"Digite um número para a linha {i} e coluna {j} da matriz:")) 
        linhaB.append(x)
    B.append(linhaB)
for i in range(3):
    k=0
    for i in range(3):
        x = A[i][j]
        C.append(x)
        k+1
        x = B[i][j]
        C.append(x)
        k+1
for i in range(3):
    for j in range(6):
        print(C[i][j], end = " ")
    print()