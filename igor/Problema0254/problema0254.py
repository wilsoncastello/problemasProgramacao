x = []
y = []
a = []
b = []
uniao = []
interseccao = []
diferencia = []
for i in range(0,10):
    x.append(int(input("Escreve x:")))
    y.append(int(input("Escreve y:")))
    a.append(x[i] + y[i]) 
    b.append(x[i] * y[i]) 
    uniao.append(x[i])

for i in range(10,20):
    uniao.append(y[i-10])

uniao = list(dict.fromkeys(uniao))

for i in range(0,10):
    for j in range(0,10):
        if x[i] == y[j]:
            interseccao.append(x[i])


interseccao = list(dict.fromkeys(interseccao))

x.sort
y.sort
diferencia = list(set(x)-set(y))


print(a)
print(b)
print(uniao)
print(interseccao)
print(diferencia)

