vA = []
aux = 0
cont = 0

for i in range (10):
    n = int(input("Digite o vetor na posição %d :" %i))
    vA.append(n)
for i in range(10):
    if(aux != vA[i]):
        for j in range (10):
            aux = vA[i]
            if(aux == vA[j]):
                cont = cont + 1
        if cont > 1:
            print("%d se repetem %d vezes" %aux %cont)
        cont = 0

