n = int(input("Escreve n: "))
m = int(input("Escreve m: "))

x = []
y = []

for i in range(0,n):
    x.append(int(input("Escreve numero da colocar no vetor x: ")))

for i in range(0,m):
    y.append(int(input("Escreve numero da colocar no vetor y: ")))

v = m+n
a = [None] * v


for i in range(0 ,len(a) ,2 ):
    if  i == 0:
        a[i] = x[i]
        a[i+1] = y[i]
    
    elif i <= len(x) and i>0:
        a[i] = x[i-1]
        a[i+1] = y[i-1]

    else:
        a[i] = y[i-2]

print(x)
print(y)
print(a)