print("Digite a quantidade de clientes do Banco A: ")
a = int(input())
x = list(range(a))
for i in range(a):
    print("Digite o nome do ",i,"º cliente: ")
    x[i] = input()

for i in range(a):
    for j in range(a):
        if(x[i] < x[j]):
            apoio = x[i]
            x[i] = x[j]
            x[j] = apoio
print("\nVetor X: ")
for i in range(a):
    print(x[i])

print("Digite a quantidade de clientes do Banco B: ")
b = int(input())
y = list(range(b))
for i in range(b):
    print("Digite o nome do ",i,"º cliente: ")
    y[i] = input()

for i in range(b):
    for j in range(b):
        if(y[i] < y[j]):
            apoio = y[i]
            y[i] = y[j]
            y[j] = apoio
print("\nVetor Y: ")
for i in range(b):
    print(y[i])

z = list(range(a+b))
for i in range(a):
    z[i] = x[i]
temp = 0
for i in range(a, a+b):
    z[i] = y[temp]
    temp += 1
for i in range(a+b):
    for j in range(i+1, a+b):
        if(z[i] > (z[j])):
            apoio = z[i]
            z[i] = z[j]
            z[j] = apoio
        
        if(z[i] == (z[j])):
            if(j+1 < a+b):
                apoio = z[j]
                z[j] = z[j+1]
                z[j+1] = apoio
            else:
                z[j] = "-"
            
print("\nVetor Z: ")
for i in range(a+b):
    if(z[i] != "-"):
        print(z[i])

