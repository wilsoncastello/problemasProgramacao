import numpy as np

a = np.zeros((4,3))

print('Digite coeficientes [linha][coluna]:')
for i in range(4):
    for j in range(3):
        a[i][j] = float(input( '['+str(i+1)+']['+ str(j+1)+'] = '))

menor = a[0][0]
maior = 0

for i in range(4):
    for j in range(3):
        if a[i][j] < menor:
            menor = a[i][j]
            indice = i

for i in range (indice+1):
    for j in range (3):
        if a[i][j] > maior:
            maior = a[i][j]

print("O maior elemento da linha onde se encontra o menor elemento: ",maior)