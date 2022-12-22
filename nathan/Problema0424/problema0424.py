def calculaFat(y):
    a = 1
    for i in range(1,y+1):
        a = a * i
    return a

def formarV(n):
    x = []
    for i in range(n):
        y = int(input(f"Digite o vetor na posição {i}: "))
        y = calculaFat(y)
        x.append(y)
    return x

n = int(input("Digite o tamanho do vetor: "))
v = []
v = formarV(n)
print(v)