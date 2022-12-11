import numpy as np

a = np.zeros((4,4))
cont = 0

print('Digite coeficientes [linha][coluna]:')
for i in range(4):
    for j in range(4):
        a[i][j] = float(input( '['+str(i+1)+']['+ str(j+1)+'] = '))

v1 = int(input("Digite o valor 1: "))
v2 = int(input("Digite o valor 2: "))
v3 = int(input("Digite o valor 3: "))

for i in range(4):
    for j in range(4):
        if a[i][j] == v1:
            cont += 1
        else:
            if a[i][j] == v2:
                cont += 1
            else:
                if a[i][j] == v3:
                    cont += 1

print("Quantidade de valores digitados contidos na matriz: ",cont)