x = int(input("Digite o limite inferior: "))
y = int(input("Digite o limite superior: "))
z = int
n = int(input("Digite o número cujos multiplos serão impressos: "))
for i in range(y+1):
    z = i * n
    if(z >= x and z <= y):
        print(z)
