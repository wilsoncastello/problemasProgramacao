num = []

for i in range(1,10):
    num = int(input("Digite "+str(i)+" :"))

for i in range(1,10):
    cont = 0
    for j in range(1,num[i]):
        if num[i] % j == 0:
            cont = cont + 1
    if cont == 2:
        print(num[i]+" posição "+str(i)+" é primo.")