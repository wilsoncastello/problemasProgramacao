n = int(input("Digite o tamanho do vetor: "))

menorN = 999999999
maiorN = -999999999
posMaior = 0
posMenor = 0
diferenca = 0
v = []

for i in range(n):
    x = int(input(f"Digite o vetor na posição {i} :"))
    v.append(x)
for i in range(n):
    if(menorN > v[i]):
        menorN = v[i]
        posMenor = i
    if(maiorN < v[i]):
        maiorN = v[i]
        posMaior = i
if(posMaior > posMenor):
    diferenca = posMaior - posMenor
else:
    diferenca = posMenor - posMaior
for i in range(n):
    if(menorN == v[i]):
        posIgual = i
        novaDiferenca = posIgual - posMaior
        if(novaDiferenca < 0):
            novaDiferenca = novaDiferenca * -1
        if((novaDiferenca) > diferenca):
            diferenca = novaDiferenca
    if(maiorN == v[i]):
        posIgual = i
        novaDiferenca = posIgual - posMaior
        if(novaDiferenca < 0):
            novaDiferenca = novaDiferenca * -1
        if((novaDiferenca) > diferenca):
            diferenca = novaDiferenca            
print("Diferença: %d" %diferenca)