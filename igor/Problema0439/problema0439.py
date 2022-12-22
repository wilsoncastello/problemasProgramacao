def max(x):
    pos = 0
    valorMax = 0
    for i in range(0, len(x)):
        if x[i] > valorMax:
            valorMax = x[i]
            pos=i
    
    print("Posicao valor maximo: ",pos)



n = int(input("Escreve o numero de n: "))
x = []
for i in range(0,n):
    x.append(int(input("Escreve numero da colocar no vetor: ")))

max(x)



